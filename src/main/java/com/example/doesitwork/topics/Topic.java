package com.example.doesitwork.topics;


public class Topic {

    private String id;
    private String name;
    private int division;

    public Topic(String id, String name, int division) {
        this.id = id;
        this.name = name;
        this.division = division;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

}
