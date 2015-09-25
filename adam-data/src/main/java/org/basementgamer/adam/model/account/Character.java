package org.basementgamer.adam.model.account;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Character {
    private Long characterId;

    private String name;

    private Long corporationId;

    private String corporationName;

    private Integer allianceId;

    private String allianceName;

    private Integer factionId;

    private String factionName;

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    public Character withCharacterId(final Long characterId) {
        this.characterId = characterId;
        return this;
    }

    public Character withName(final String name) {
        this.name = name;
        return this;
    }

    public Character withCorporationId(final Long corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    public Character withCorporationName(final String corporationName) {
        this.corporationName = corporationName;
        return this;
    }

    public Character withAllianceId(final Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    public Character withAllianceName(final String allianceName) {
        this.allianceName = allianceName;
        return this;
    }

    public Character withFactionId(final Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    public Character withFactionName(final String factionName) {
        this.factionName = factionName;
        return this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
