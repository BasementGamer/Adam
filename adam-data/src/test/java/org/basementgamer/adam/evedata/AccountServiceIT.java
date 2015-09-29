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
package org.basementgamer.adam.evedata;

import org.basementgamer.adam.evedata.impl.AccountServiceImpl;
import org.basementgamer.adam.model.account.AccountStatus;
import org.basementgamer.adam.model.account.ApiKeyInfo;
import org.basementgamer.adam.model.account.Character;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * The type Account service it.
 */
public class AccountServiceIT extends AbstractServiceTest {
    private static final transient Logger logger = LoggerFactory.getLogger(AccountServiceIT.class);

    private AccountService accountService = new AccountServiceImpl();

    /**
     * Test get account status.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetAccountStatus() throws Exception {
        logger.debug("=== tesGetAccountStatus ===");
        AccountStatus accountStatus = accountService.getAccountStatus(getKey());
        assertNotNull(accountStatus);
        logger.info("Account Status: {}", accountStatus);
    }

    /**
     * Test get characters.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetCharacters() throws Exception {
        logger.debug("=== testGetCharacters ===");
        Collection<Character> characterList = accountService.getCharacters(getKey());
        assertNotNull(characterList);
        assertFalse(characterList.isEmpty());
        logger.info("Found {} characters:", characterList.size());
        for (Character character : characterList) {
            logger.info(character.toString());
        }
    }

    /**
     * Test get api key info.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetApiKeyInfo() throws Exception {
        logger.debug("=== testGetApiKeyInfo ===");
        ApiKeyInfo apiKeyInfo = accountService.getApiKeyInfo(getKey());
        assertNotNull(apiKeyInfo);
        logger.info("Api Key Info: {}", apiKeyInfo);
        assertFalse(apiKeyInfo.getCharacters().isEmpty());
        logger.info("Found {} characters in the Api", apiKeyInfo.getCharacters().size());
        for (Character character : apiKeyInfo.getCharacters()) {
            logger.info(character.toString());
        }
    }
}
