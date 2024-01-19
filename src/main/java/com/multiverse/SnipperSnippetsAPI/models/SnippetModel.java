package com.multiverse.SnipperSnippetsAPI.models;

import java.util.ArrayList;

public class SnippetModel {
    private Integer id;
    private String language;
    private String code;

    static ArrayList<SnippetModel> snippetsList = new ArrayList <>();

    public SnippetModel(Integer id, String language, String code) {
        this.id = id;
        this.language = language;
        this.code = code;
//        SnippetModel.snippetsList.add(this);


    }

//    @Override
//    public String toString() {
//        return '{' +
//                "id=" + id +
//                ", language='" + language + '\'' +
//                ", code='" + code + '\'' +
//                '}';
//    }

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


    public static void main(String[] args) {
        SnippetModel s1 = new SnippetModel(0, "Java", "System.out.println(\"text\")");
//        new SnippetModel(1, "Java", "System.out.println(\"text\")");
//        new SnippetModel(2, "Java", "System.out.println(\"text\")");
//        new SnippetModel(3, "Java", "System.out.println(\"text\")");
        snippetsList.add(s1);

        System.out.println(SnippetModel.snippetsList);

    }
}
