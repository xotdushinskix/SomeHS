package com.nikita.security.model;

/**
 * Created by FromxSoul on 28.08.2016.
 */
public enum Position {

    ACTIVE("Active"),
    INACTIVE("Inactive"),
    DELETED("Deleted"),
    LOCKED("Locked");

    private String postion;

    Position(final String postion) {
        this.postion = postion;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    @Override
    public String toString() {
        return this.postion;
    }
}
