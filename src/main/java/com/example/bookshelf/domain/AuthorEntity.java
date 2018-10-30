package com.example.bookshelf.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name=("Authors"))
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="author_id")
    private Integer author_id;

    @Column(name="name")
    private String name;

    @Column(name="born")
    private Date born;

    @Column(name="gender")
    private String gender;

    public AuthorEntity() {
        }

    public AuthorEntity(Integer author_id,String name, Date born, String gender) {
        this.author_id=author_id;
        this.name = name;
        this.born = born;
        this.gender = gender;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
