package com.academy.automationpractice.kdt.engine;

public class KeywordStep {
    private String page;
    private String action;
    private String object;
    private String value;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KeywordStep withPage(String page) {
        this.page = page;
        return this;
    }

    public KeywordStep withAction(String action) {
        this.action = action;
        return this;
    }

    public KeywordStep withObject(String object) {
        this.object = object;
        return this;
    }

    public KeywordStep withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "KeywordStep{" +
                "page='" + page + '\'' +
                ", action='" + action + '\'' +
                ", object='" + object + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
