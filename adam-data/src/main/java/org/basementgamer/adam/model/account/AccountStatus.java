package org.basementgamer.adam.model.account;

import org.basementgamer.adam.model.CacheableData;

import javax.jdo.annotations.PersistenceCapable;
import java.util.Date;

@PersistenceCapable
public class AccountStatus extends CacheableData<AccountStatus> {
    private Date paidUntil;
    private Date createDate;
    private Integer logonCount;
    private Integer logonMinutes;

    public Date getPaidUntil() {
        return paidUntil;
    }

    public void setPaidUntil(Date paidUntil) {
        this.paidUntil = paidUntil;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getLogonCount() {
        return logonCount;
    }

    public void setLogonCount(Integer logonCount) {
        this.logonCount = logonCount;
    }

    public Integer getLogonMinutes() {
        return logonMinutes;
    }

    public void setLogonMinutes(Integer logonMinutes) {
        this.logonMinutes = logonMinutes;
    }

    public AccountStatus withPaidUntil(final Date paidUntil) {
        this.paidUntil = paidUntil;
        return this;
    }

    public AccountStatus withCreateDate(final Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public AccountStatus withLogonCount(final Integer logonCount) {
        this.logonCount = logonCount;
        return this;
    }

    public AccountStatus withLogonMinutes(final Integer logonMinutes) {
        this.logonMinutes = logonMinutes;
        return this;
    }
}
