package org.basementgamer.adam.model.account;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.basementgamer.adam.model.CacheableData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiKeyInfo extends CacheableData<ApiKeyInfo> {
    private Long accessMask;
    private KeyType type;
    private Date expiration;
    private List<Character> characterList = new ArrayList<>();

    public enum KeyType {
        Account,
        Character,
        Corporation;
    }

    public Long getAccessMask() {
        return accessMask;
    }

    public void setAccessMask(Long accessMask) {
        this.accessMask = accessMask;
    }

    public KeyType getType() {
        return type;
    }

    public void setType(KeyType type) {
        this.type = type;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<Character> getCharacters() {
        return characterList;
    }

    public ApiKeyInfo addCharacter(Character character) {
        this.characterList.add(character);
        return this;
    }

    public ApiKeyInfo withAccessMask(final Long accessMask) {
        this.accessMask = accessMask;
        return this;
    }

    public ApiKeyInfo withType(final KeyType type) {
        this.type = type;
        return this;
    }

    public ApiKeyInfo withExpiration(final Date expiration) {
        this.expiration = expiration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("accessMask", accessMask)
                .append("type", type)
                .append("expiration", expiration)
                .appendSuper(super.toString())
                .toString();
    }
}
