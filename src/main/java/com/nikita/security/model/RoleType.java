package com.nikita.security.model;

/**
 * Created by FromxSoul on 28.08.2016.
 */
public enum RoleType {

    ADMIN("ADMIN"),
    USER("USER");

    private String roleType;

    RoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return this.roleType;
    }
}
