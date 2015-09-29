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
import org.basementgamer.adam.model.character.AccountBalance;


/**
 * The interface Character service.
 */
public interface CharacterService {
    /**
     * Gets balance.
     *
     * @param apiKey      the api key
     * @param characterId the character id
     * @return the balance
     */
    AccountBalance getBalance(ApiKey apiKey, Long characterId);
}
