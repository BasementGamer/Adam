package org.basementgamer.adam.evedata.impl;

import com.beimin.eveapi.account.accountstatus.AccountStatusParser;
import com.beimin.eveapi.account.accountstatus.AccountStatusResponse;
import com.beimin.eveapi.account.accountstatus.EveAccountStatus;
import com.beimin.eveapi.account.apikeyinfo.ApiKeyInfoParser;
import com.beimin.eveapi.account.apikeyinfo.ApiKeyInfoResponse;
import com.beimin.eveapi.account.characters.CharactersParser;
import com.beimin.eveapi.account.characters.CharactersResponse;
import com.beimin.eveapi.account.characters.EveCharacter;
import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.exception.ApiException;
import org.basementgamer.adam.evedata.AccountService;
import org.basementgamer.adam.evedata.ServiceException;
import org.basementgamer.adam.model.ApiKey;
import org.basementgamer.adam.model.account.AccountStatus;
import org.basementgamer.adam.model.account.ApiKeyInfo;
import org.basementgamer.adam.model.account.Character;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private static final transient Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    private final AccountStatusParser accountStatusParser = AccountStatusParser.getInstance();
    private final CharactersParser charactersParser = CharactersParser.getInstance();
    private final ApiKeyInfoParser apiKeyInfoParser = ApiKeyInfoParser.getInstance();

    @Override
    public AccountStatus getAccountStatus(ApiKey key) {
        AccountStatus status = null;
        ApiAuthorization authorization = new ApiAuthorization(key.getKeyId(), key.getVerificationCode());
        try {
            AccountStatusResponse response =  accountStatusParser.getResponse(authorization);
            if (null != response) {
                status = convertEveAccountStatus(response);
            }
        } catch (ApiException e) {
            String message = String.format("Could not obtain Account status: %s", e.getMessage());
            logger.error(message);
            throw new ServiceException(message, e);
        }
        return status;
    }

    @Override
    public Collection<Character> getCharacters(ApiKey key) {
        List<Character> characterList = new ArrayList<>();
        ApiAuthorization authorization = new ApiAuthorization(key.getKeyId(), key.getVerificationCode());
        try {
            CharactersResponse response = charactersParser.getResponse(authorization);
            if (null != response) {
                for (EveCharacter eveCharacter : response.getAll()) {
                    characterList.add(convertEveCharacter(eveCharacter));
                }
            }
        } catch (ApiException e) {
            String message = String.format("Could not obtain Character list: %s", e.getMessage());
            logger.error(message);
            throw new ServiceException(message, e);
        }
        return characterList;
    }

    @Override
    public ApiKeyInfo getApiKeyInfo(ApiKey key) {
        ApiKeyInfo keyInfo = null;
        ApiAuthorization authorization = new ApiAuthorization(key.getKeyId(), key.getVerificationCode());
        try {
            ApiKeyInfoResponse response = apiKeyInfoParser.getResponse(authorization);
            if (null != response) {
                keyInfo = convertApiKeyInfoResponse(response);
                for (EveCharacter eveCharacter : response.getEveCharacters()) {
                    keyInfo.addCharacter(convertEveCharacter(eveCharacter));
                }
            }
        } catch (ApiException e) {
            String message = String.format("Could not obtain api key info: {}", e.getMessage());
            logger.error(message);
            throw new ServiceException(message, e);
        }
        return keyInfo;
    }

    private ApiKeyInfo convertApiKeyInfoResponse(ApiKeyInfoResponse response) {
        return new ApiKeyInfo()
                .withAccessMask(response.getAccessMask())
                .withExpiration(response.getExpires())
                .withType(ApiKeyInfo.KeyType.valueOf(response.getType().toString()))
                .withCurrentTime(response.getCurrentTime())
                .withCachedUntil(response.getCachedUntil());
    }

    private AccountStatus convertEveAccountStatus(AccountStatusResponse response) {
        EveAccountStatus eveAccountStatus = response.get();
        return new AccountStatus()
                .withCreateDate(eveAccountStatus.getCreateDate())
                .withPaidUntil(eveAccountStatus.getPaidUntil())
                .withLogonCount(eveAccountStatus.getLogonCount())
                .withLogonMinutes(eveAccountStatus.getLogonMinutes())
                .withCurrentTime(response.getCurrentTime())
                .withCachedUntil(response.getCachedUntil());
    }

    private Character convertEveCharacter(EveCharacter eveCharacter) {
        return new Character()
                .withCharacterId(eveCharacter.getCharacterID())
                .withName(eveCharacter.getName())
                .withCorporationId(eveCharacter.getCorporationID())
                .withCorporationName(eveCharacter.getCorporationName());
    }
}
