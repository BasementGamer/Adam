package org.basementgamer.adam.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(identityType = IdentityType.DATASTORE)
public class ApiKey {

    private int keyId;

    private String verificationCode;

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public ApiKey withKeyId(final int keyId) {
        this.keyId = keyId;
        return this;
    }

    public ApiKey withVerificationCode(final String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("keyId", keyId)
                .toString();
    }
}
