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

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * The type Character.
 */
public class Character {
    private Long characterId;

    private String name;

    private Long corporationId;

    private String corporationName;

    private Integer allianceId;

    private String allianceName;

    private Integer factionId;

    private String factionName;

    /**
     * Gets character id.
     *
     * @return the character id
     */
    public Long getCharacterId() {
        return characterId;
    }

    /**
     * Sets character id.
     *
     * @param characterId the character id
     */
    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets corporation id.
     *
     * @return the corporation id
     */
    public Long getCorporationId() {
        return corporationId;
    }

    /**
     * Sets corporation id.
     *
     * @param corporationId the corporation id
     */
    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    /**
     * Gets corporation name.
     *
     * @return the corporation name
     */
    public String getCorporationName() {
        return corporationName;
    }

    /**
     * Sets corporation name.
     *
     * @param corporationName the corporation name
     */
    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    /**
     * Gets alliance id.
     *
     * @return the alliance id
     */
    public Integer getAllianceId() {
        return allianceId;
    }

    /**
     * Sets alliance id.
     *
     * @param allianceId the alliance id
     */
    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    /**
     * Gets alliance name.
     *
     * @return the alliance name
     */
    public String getAllianceName() {
        return allianceName;
    }

    /**
     * Sets alliance name.
     *
     * @param allianceName the alliance name
     */
    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    /**
     * Gets faction id.
     *
     * @return the faction id
     */
    public Integer getFactionId() {
        return factionId;
    }

    /**
     * Sets faction id.
     *
     * @param factionId the faction id
     */
    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    /**
     * Gets faction name.
     *
     * @return the faction name
     */
    public String getFactionName() {
        return factionName;
    }

    /**
     * Sets faction name.
     *
     * @param factionName the faction name
     */
    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    /**
     * With character id character.
     *
     * @param characterId the character id
     * @return the character
     */
    public Character withCharacterId(final Long characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * With name character.
     *
     * @param name the name
     * @return the character
     */
    public Character withName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * With corporation id character.
     *
     * @param corporationId the corporation id
     * @return the character
     */
    public Character withCorporationId(final Long corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * With corporation name character.
     *
     * @param corporationName the corporation name
     * @return the character
     */
    public Character withCorporationName(final String corporationName) {
        this.corporationName = corporationName;
        return this;
    }

    /**
     * With alliance id character.
     *
     * @param allianceId the alliance id
     * @return the character
     */
    public Character withAllianceId(final Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * With alliance name character.
     *
     * @param allianceName the alliance name
     * @return the character
     */
    public Character withAllianceName(final String allianceName) {
        this.allianceName = allianceName;
        return this;
    }

    /**
     * With faction id character.
     *
     * @param factionId the faction id
     * @return the character
     */
    public Character withFactionId(final Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * With faction name character.
     *
     * @param factionName the faction name
     * @return the character
     */
    public Character withFactionName(final String factionName) {
        this.factionName = factionName;
        return this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
