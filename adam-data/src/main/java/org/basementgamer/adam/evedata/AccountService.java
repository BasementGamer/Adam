package org.basementgamer.adam.evedata;

import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.account.*;
import org.basementgamer.adam.model.account.Character;

import java.util.List;

public interface AccountService {
    AccountStatus getAccountStatus(ApiKey key);

    List<Character> getCharacters(ApiKey key);

    ApiKeyInfo getApiKeyInfo(ApiKey key);
}
