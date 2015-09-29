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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * The type Api call group.
 */
public class ApiCallGroup {
    private Integer groupID;
    private String name;
    private String description;
    private List<ApiCall> apiCalls = new ArrayList<>();

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
     * Gets api calls.
     *
     * @return the api calls
     */
    public Collection<ApiCall> getApiCalls() {
        return Collections.unmodifiableCollection(apiCalls);
    }

    /**
     * Sets api calls.
     *
     * @param apiCalls the api calls
     */
    public void setApiCalls(Collection<ApiCall> apiCalls) {
        this.apiCalls.clear();
        this.apiCalls.addAll(apiCalls);
    }

    /**
     * Add api call.
     *
     * @param apiCall the api call
     */
    public void addApiCall(ApiCall apiCall) {
        apiCalls.add(apiCall);
    }

    /**
     * With group id api call group.
     *
     * @param groupID the group id
     * @return the api call group
     */
    public ApiCallGroup withGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }

    /**
     * With name api call group.
     *
     * @param name the name
     * @return the api call group
     */
    public ApiCallGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * With description api call group.
     *
     * @param description the description
     * @return the api call group
     */
    public ApiCallGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
