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

import javax.jdo.annotations.PersistenceCapable;
import java.util.Date;

/**
 * The type Account status.
 */
@PersistenceCapable
public class AccountStatus extends CacheableData<AccountStatus> {
    private Date paidUntil;
    private Date createDate;
    private Integer logonCount;
    private Integer logonMinutes;

    /**
     * Gets paid until.
     *
     * @return the paid until
     */
    public Date getPaidUntil() {
        return paidUntil;
    }

    /**
     * Sets paid until.
     *
     * @param paidUntil the paid until
     */
    public void setPaidUntil(Date paidUntil) {
        this.paidUntil = paidUntil;
    }

    /**
     * Gets create date.
     *
     * @return the create date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets create date.
     *
     * @param createDate the create date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets logon count.
     *
     * @return the logon count
     */
    public Integer getLogonCount() {
        return logonCount;
    }

    /**
     * Sets logon count.
     *
     * @param logonCount the logon count
     */
    public void setLogonCount(Integer logonCount) {
        this.logonCount = logonCount;
    }

    /**
     * Gets logon minutes.
     *
     * @return the logon minutes
     */
    public Integer getLogonMinutes() {
        return logonMinutes;
    }

    /**
     * Sets logon minutes.
     *
     * @param logonMinutes the logon minutes
     */
    public void setLogonMinutes(Integer logonMinutes) {
        this.logonMinutes = logonMinutes;
    }

    /**
     * With paid until account status.
     *
     * @param paidUntil the paid until
     * @return the account status
     */
    public AccountStatus withPaidUntil(final Date paidUntil) {
        this.paidUntil = paidUntil;
        return this;
    }

    /**
     * With create date account status.
     *
     * @param createDate the create date
     * @return the account status
     */
    public AccountStatus withCreateDate(final Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * With logon count account status.
     *
     * @param logonCount the logon count
     * @return the account status
     */
    public AccountStatus withLogonCount(final Integer logonCount) {
        this.logonCount = logonCount;
        return this;
    }

    /**
     * With logon minutes account status.
     *
     * @param logonMinutes the logon minutes
     * @return the account status
     */
    public AccountStatus withLogonMinutes(final Integer logonMinutes) {
        this.logonMinutes = logonMinutes;
        return this;
    }
}
