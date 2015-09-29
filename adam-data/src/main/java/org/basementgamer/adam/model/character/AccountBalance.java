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
package org.basementgamer.adam.model.character;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * The type Account balance.
 */
public class AccountBalance {
    private Integer accountId;
    private Integer accountKey;
    private Double balance;

    /**
     * Gets account id.
     *
     * @return the account id
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * Sets account id.
     *
     * @param accountId the account id
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets account key.
     *
     * @return the account key
     */
    public Integer getAccountKey() {
        return accountKey;
    }

    /**
     * Sets account key.
     *
     * @param accountKey the account key
     */
    public void setAccountKey(Integer accountKey) {
        this.accountKey = accountKey;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * With account id account balance.
     *
     * @param accountId the account id
     * @return the account balance
     */
    public AccountBalance withAccountId(final Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * With account key account balance.
     *
     * @param accountKey the account key
     * @return the account balance
     */
    public AccountBalance withAccountKey(final Integer accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * With balance account balance.
     *
     * @param balance the balance
     * @return the account balance
     */
    public AccountBalance withBalance(final Double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("accountId", accountId)
                .append("accountKey", accountKey)
                .append("balance", balance)
                .toString();
    }
}
