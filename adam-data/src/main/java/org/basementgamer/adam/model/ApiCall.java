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

/**
 * The type Api call.
 */
public class ApiCall {
    private Long accessMask;
    private Type type;
    private String name;
    private Integer groupID;
    private String description;

    /**
     * The enum Type.
     */
    public enum Type {
        /**
         * Character type.
         */
        Character,
        /**
         * Corporation type.
         */
        Corporation
    }

    /**
     * Gets access mask.
     *
     * @return the access mask
     */
    public Long getAccessMask() {
        return accessMask;
    }

    /**
     * Sets access mask.
     *
     * @param accessMask the access mask
     */
    public void setAccessMask(Long accessMask) {
        this.accessMask = accessMask;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * Sets group id.
     *
     * @param groupID the group id
     */
    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * With access mask api call.
     *
     * @param accessMask the access mask
     * @return the api call
     */
    public ApiCall withAccessMask(Long accessMask) {
        this.accessMask = accessMask;
        return this;
    }

    /**
     * With type api call.
     *
     * @param type the type
     * @return the api call
     */
    public ApiCall withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * With name api call.
     *
     * @param name the name
     * @return the api call
     */
    public ApiCall withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * With group id api call.
     *
     * @param groupID the group id
     * @return the api call
     */
    public ApiCall withGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }

    /**
     * With description api call.
     *
     * @param description the description
     * @return the api call
     */
    public ApiCall withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
