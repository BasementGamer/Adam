package org.basementgamer.adam.evedata;

import org.basementgamer.adam.model.ApiKey;
import org.junit.BeforeClass;

import static org.junit.Assert.assertNotNull;

public abstract class AbstractServiceTest {
    private static final String TEST_KEY_ID_PROPERTY = "api.keyId";
    private static final String TEST_VALIDATION_CODE_PROPERTY = "api.validationCode";

    private static ApiKey key;

    @BeforeClass
    public static void setUp() {

        // Load appropriate keys from system properties
        String keyId = System.getProperty(TEST_KEY_ID_PROPERTY);
        assertNotNull("System property '" + TEST_KEY_ID_PROPERTY + "' must be set", keyId);
        String validationCode = System.getProperty(TEST_VALIDATION_CODE_PROPERTY);
        assertNotNull("System property '" + TEST_VALIDATION_CODE_PROPERTY + "' must be set", validationCode);

        key = new ApiKey().withKeyId(Integer.valueOf(keyId)).withVerificationCode(validationCode);
    }

    public ApiKey getKey() {
        return key;
    }
}
