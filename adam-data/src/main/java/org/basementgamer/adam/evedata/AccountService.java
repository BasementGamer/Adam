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

import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.account.AccountStatus;
import org.basementgamer.adam.model.account.ApiKeyInfo;
import org.basementgamer.adam.model.account.Character;

import java.util.Collection;

/**
 * The interface Account service.
 */
public interface AccountService {
    /**
     * Gets account status.
     *
     * @param key the key
     * @return the account status
     */
    AccountStatus getAccountStatus(ApiKey key);

    /**
     * Gets characters.
     *
     * @param key the key
     * @return the characters
     */
    Collection<Character> getCharacters(ApiKey key);

    /**
     * Gets api key info.
     *
     * @param key the key
     * @return the api key info
     */
    ApiKeyInfo getApiKeyInfo(ApiKey key);
}
