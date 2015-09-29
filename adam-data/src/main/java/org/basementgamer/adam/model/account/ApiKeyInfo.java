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
package org.basementgamer.adam.model.account;

import org.basementgamer.adam.model.CacheableData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * The type Api key info.
 */
public class ApiKeyInfo extends CacheableData<ApiKeyInfo> {
    private Long accessMask;
    private KeyType type;
    private Date expiration;
    private List<Character> characterList = new ArrayList<>();

    /**
     * The enum Key type.
     */
    public enum KeyType {
        /**
         * Account key type.
         */
        Account,
        /**
         * Character key type.
         */
        Character,
        /**
         * Corporation key type.
         */
        Corporation
    }

    /**
     * Gets access mask.
     *
     * @return the access mask
     */
    public Long getAccessMask() {
        return accessMask;
    }

    /**
     * Sets access mask.
     *
     * @param accessMask the access mask
     */
    public void setAccessMask(Long accessMask) {
        this.accessMask = accessMask;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public KeyType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(KeyType type) {
        this.type = type;
    }

    /**
     * Gets expiration.
     *
     * @return the expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Sets expiration.
     *
     * @param expiration the expiration
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    /**
     * Gets characters.
     *
     * @return the characters
     */
    public Collection<Character> getCharacters() {
        return characterList;
    }

    /**
     * Add character api key info.
     *
     * @param character the character
     * @return the api key info
     */
    public ApiKeyInfo addCharacter(Character character) {
        this.characterList.add(character);
        return this;
    }

    /**
     * With access mask api key info.
     *
     * @param accessMask the access mask
     * @return the api key info
     */
    public ApiKeyInfo withAccessMask(final Long accessMask) {
        this.accessMask = accessMask;
        return this;
    }

    /**
     * With type api key info.
     *
     * @param type the type
     * @return the api key info
     */
    public ApiKeyInfo withType(final KeyType type) {
        this.type = type;
        return this;
    }

    /**
     * With expiration api key info.
     *
     * @param expiration the expiration
     * @return the api key info
     */
    public ApiKeyInfo withExpiration(final Date expiration) {
        this.expiration = expiration;
        return this;
    }
}
