package com.multiverse.SnipperSnippetsAPI.models;


public class SnippetModel {
    private Integer id;
    private String language;
    private String code;


    public SnippetModel(Integer id, String language, String code) {
        this.id = id;
        this.language = language;
        this.code = code;


    }


    public Integer getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
