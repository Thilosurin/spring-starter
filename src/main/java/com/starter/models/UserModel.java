package com.starter.models;

import org.springframework.core.style.ToStringCreator;


class InfoObject {
    public String seed;
    public int results;
    public int page;
    public String version;
}

public class UserModel {
    public UserObject[] results;
    public InfoObject info;

    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("results", results)
                .append("info", info)
                .toString();
    }
}