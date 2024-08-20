package com.omer.game.runner.controller;

public class Course {

    private long id;
    private String name;
    private String author;

    public Course() {
    }

    public Course(int i, String learnAws, String company) {
        this.id = i;
        this.name = learnAws;
        this.author = company;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            '}';
    }
}
