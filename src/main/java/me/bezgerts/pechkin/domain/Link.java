package me.bezgerts.pechkin.domain;

import javax.persistence.*;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PATH")
    private String path;

    @Column(name = "DESCRIPTION")
    private String description;

    public Link() {
    }

    public Link(String path, String description) {
        this.path = path;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
