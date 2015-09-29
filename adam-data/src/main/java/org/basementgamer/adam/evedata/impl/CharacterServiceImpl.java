/*
 * Copyright 2015 Guillermo Castro
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.basementgamer.adam.evedata.impl;

import com.beimin.eveapi.character.accountbalance.AccountBalanceParser;
import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.exception.ApiException;
import com.beimin.eveapi.shared.accountbalance.AccountBalanceResponse;
import com.beimin.eveapi.shared.accountbalance.EveAccountBalance;
import org.basementgamer.adam.evedata.CharacterService;
import org.basementgamer.adam.evedata.ServiceException;
import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.character.AccountBalance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Character service.
 */
public class CharacterServiceImpl implements CharacterService {
    private static final transient Logger logger = LoggerFactory.getLogger(CharacterServiceImpl.class);
    /**
     * The Account balance parser.
     */
    AccountBalanceParser accountBalanceParser = AccountBalanceParser.getInstance();

    @Override
    public AccountBalance getBalance(ApiKey apiKey, Long characterId) {
        AccountBalance balance;
        ApiAuthorization authorization = new ApiAuthorization(apiKey.getKeyId(), apiKey.getVerificationCode());
        authorization.setCharacterID(characterId);
        try {
            AccountBalanceResponse response = accountBalanceParser.getResponse(authorization);
            EveAccountBalance eveBalance = response.getAll().iterator().next();
            balance = convertEveAccountBalance(eveBalance);
        } catch (ApiException e) {
            String message = String.format("Could not obtain account balance. %s", e.getMessage());
            logger.error(message);
            throw new ServiceException(message, e);
        }
        return balance;
    }

    private AccountBalance convertEveAccountBalance(EveAccountBalance eveBalance) {
        return new AccountBalance()
                .withAccountId(eveBalance.getAccountID())
                .withAccountKey(eveBalance.getAccountKey())
                .withBalance(eveBalance.getBalance());
    }
}
