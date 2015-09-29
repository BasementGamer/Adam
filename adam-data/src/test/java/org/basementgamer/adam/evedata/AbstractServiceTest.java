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
import org.junit.BeforeClass;

import static org.junit.Assert.assertNotNull;

/**
 * The type Abstract service test.
 */
public abstract class AbstractServiceTest {
    private static final String TEST_KEY_ID_PROPERTY = "api.keyId";
    private static final String TEST_VALIDATION_CODE_PROPERTY = "api.validationCode";

    private static ApiKey key;

    /**
     * Sets up.
     */
    @BeforeClass
    public static void setUp() {

        // Load appropriate keys from system properties
        String keyId = System.getProperty(TEST_KEY_ID_PROPERTY);
        assertNotNull("System property '" + TEST_KEY_ID_PROPERTY + "' must be set", keyId);
        String validationCode = System.getProperty(TEST_VALIDATION_CODE_PROPERTY);
        assertNotNull("System property '" + TEST_VALIDATION_CODE_PROPERTY + "' must be set", validationCode);

        key = new ApiKey().withKeyId(Integer.valueOf(keyId)).withVerificationCode(validationCode);
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public ApiKey getKey() {
        return key;
    }
}
