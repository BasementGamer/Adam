package org.basementgamer.adam.evedata;

import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.character.AccountBalance;

/**
 * @author <a href="mailto:gcastro-contractor@zappos.com">Guillermo Castro</a>
 */
public interface CharacterService {
    AccountBalance getBalance(ApiKey apiKey, Long characterId);
}
