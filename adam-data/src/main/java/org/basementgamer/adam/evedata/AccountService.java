package org.basementgamer.adam.evedata;

import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.account.AccountStatus;
import org.basementgamer.adam.model.account.ApiKeyInfo;
import org.basementgamer.adam.model.account.Character;

import java.util.Collection;

public interface AccountService {
    AccountStatus getAccountStatus(ApiKey key);

    Collection<Character> getCharacters(ApiKey key);

    ApiKeyInfo getApiKeyInfo(ApiKey key);
}
