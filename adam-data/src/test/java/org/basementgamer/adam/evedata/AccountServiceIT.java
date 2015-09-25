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

public class AccountServiceIT extends AbstractServiceTest {
    private static final transient Logger logger = LoggerFactory.getLogger(AccountServiceIT.class);

    private AccountService accountService = new AccountServiceImpl();

    @Test
    public void testGetAccountStatus() throws Exception {
        logger.debug("=== tesGetAccountStatus ===");
        AccountStatus accountStatus = accountService.getAccountStatus(getKey());
        assertNotNull(accountStatus);
        logger.info("Account Status: {}", accountStatus);
    }

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
