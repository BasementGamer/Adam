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
package org.basementgamer.adam.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

/**
 * The type Api key.
 */
@PersistenceCapable(identityType = IdentityType.DATASTORE)
public class ApiKey {

    private int keyId;

    private String verificationCode;

    /**
     * Gets key id.
     *
     * @return the key id
     */
    public int getKeyId() {
        return keyId;
    }

    /**
     * Sets key id.
     *
     * @param keyId the key id
     */
    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    /**
     * Gets verification code.
     *
     * @return the verification code
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Sets verification code.
     *
     * @param verificationCode the verification code
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    /**
     * With key id api key.
     *
     * @param keyId the key id
     * @return the api key
     */
    public ApiKey withKeyId(final int keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * With verification code api key.
     *
     * @param verificationCode the verification code
     * @return the api key
     */
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
