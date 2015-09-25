package org.basementgamer.adam.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApiCallGroup {
    private Integer groupID;
    private String name;
    private String description;
    private List<ApiCall> apiCalls = new ArrayList<>();

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<ApiCall> getApiCalls() {
        return Collections.unmodifiableCollection(apiCalls);
    }

    public void setApiCalls(Collection<ApiCall> apiCalls) {
        this.apiCalls.clear();
        this.apiCalls.addAll(apiCalls);
    }

    public void addApiCall(ApiCall apiCall) {
        apiCalls.add(apiCall);
    }

    public ApiCallGroup withGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }

    public ApiCallGroup withName(String name) {
        this.name = name;
        return this;
    }

    public ApiCallGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
