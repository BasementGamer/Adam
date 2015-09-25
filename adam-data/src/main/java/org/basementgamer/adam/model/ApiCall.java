package org.basementgamer.adam.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ApiCall {
    private Long accessMask;
    private Type type;
    private String name;
    private Integer groupID;
    private String description;

    public enum Type {
        Character,
        Corporation
    }

    public Long getAccessMask() {
        return accessMask;
    }

    public void setAccessMask(Long accessMask) {
        this.accessMask = accessMask;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiCall withAccessMask(Long accessMask) {
        this.accessMask = accessMask;
        return this;
    }

    public ApiCall withType(Type type) {
        this.type = type;
        return this;
    }

    public ApiCall withName(String name) {
        this.name = name;
        return this;
    }

    public ApiCall withGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }

    public ApiCall withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
