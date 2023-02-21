package com.foldersandfiles.foldersandfiles.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "files")
    private List<File> files;
    @Column(name = "person")
    private Person person;

    public Folder(String title, List<File> files, Person person) {
        this.title = title;
        this.files = files;
        this.person = person;
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
