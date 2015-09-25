package org.basementgamer.adam.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

public abstract class CacheableData<T extends CacheableData<?>> {
    protected Date currentTime;
    protected Date cachedUntil;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Date getCachedUntil() {
        return cachedUntil;
    }

    public void setCachedUntil(Date cachedUntil) {
        this.cachedUntil = cachedUntil;
    }

    public T withCurrentTime(final Date currentTime) {
        this.currentTime = currentTime;
        return (T) this;
    }

    public T withCachedUntil(final Date cachedUntil) {
        this.cachedUntil = cachedUntil;
        return (T) this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
