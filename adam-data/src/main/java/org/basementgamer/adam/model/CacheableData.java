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

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * The type Cacheable data.
 *
 * @param <T> the type parameter
 */
public abstract class CacheableData<T extends CacheableData<?>> {
    /**
     * The Current time.
     */
    protected Date currentTime;
    /**
     * The Cached until.
     */
    protected Date cachedUntil;

    /**
     * Gets current time.
     *
     * @return the current time
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets current time.
     *
     * @param currentTime the current time
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * Gets cached until.
     *
     * @return the cached until
     */
    public Date getCachedUntil() {
        return cachedUntil;
    }

    /**
     * Sets cached until.
     *
     * @param cachedUntil the cached until
     */
    public void setCachedUntil(Date cachedUntil) {
        this.cachedUntil = cachedUntil;
    }

    /**
     * With current time t.
     *
     * @param currentTime the current time
     * @return the t
     */
    public T withCurrentTime(final Date currentTime) {
        this.currentTime = currentTime;
        return (T) this;
    }

    /**
     * With cached until t.
     *
     * @param cachedUntil the cached until
     * @return the t
     */
    public T withCachedUntil(final Date cachedUntil) {
        this.cachedUntil = cachedUntil;
        return (T) this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
