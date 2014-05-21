package org.basementgamer.adam.evedata;

import org.basementgamer.adam.evedata.impl.AccountServiceImpl;
import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.account.*;
import org.basementgamer.adam.model.account.Character;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class AccountServiceTest {
    private static final transient Logger logger = LoggerFactory.getLogger(AccountServiceTest.class);

    private static final int TEST_KEY_ID = 3353841;
    private static final String TEST_VALIDATION_CODE = "hPbPjrajDSOi6w6CItRrnp5NH3CIklPRKSYvvZ8eOducCbxXmIPontAj7iU32Ons";

    private AccountService accountService = new AccountServiceImpl();
    private ApiKey key = new ApiKey().withKeyId(TEST_KEY_ID).withVerificationCode(TEST_VALIDATION_CODE);

    @Test
    @Ignore
    public void testGetAccountStatus() throws Exception {
        AccountStatus accountStatus = accountService.getAccountStatus(key);
        assertNotNull(accountStatus);
        logger.info("Account Status: {}", accountStatus);
    }

    @Test
    @Ignore
    public void testGetCharacters() throws Exception {
        List<Character> characterList = accountService.getCharacters(key);
        assertNotNull(characterList);
        assertFalse(characterList.isEmpty());
        logger.info("Found {} characters:", characterList.size());
        for (Character character : characterList) {
            logger.info(character.toString());
        }
    }

    @Test
    public void testGetApiKeyInfo() throws Exception {
        ApiKeyInfo apiKeyInfo = accountService.getApiKeyInfo(key);
        assertNotNull(apiKeyInfo);
        logger.info("Api Key Info: {}", apiKeyInfo);
        assertFalse(apiKeyInfo.getCharacters().isEmpty());
        logger.info("Found {} characters in the Api", apiKeyInfo.getCharacters().size());
        for (Character character : apiKeyInfo.getCharacters()) {
            logger.info(character.toString());
        }
    }
}
