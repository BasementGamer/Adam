package org.basementgamer.adam.model.character;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author <a href="mailto:gcastro-contractor@zappos.com">Guillermo Castro</a>
 */
public class AccountBalance {
    private Integer accountId;
    private Integer accountKey;
    private Double balance;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(Integer accountKey) {
        this.accountKey = accountKey;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountBalance withAccountId(final Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    public AccountBalance withAccountKey(final Integer accountKey) {
        this.accountKey = accountKey;
        return this;
    }

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
