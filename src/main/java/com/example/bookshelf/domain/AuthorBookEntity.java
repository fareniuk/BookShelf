package com.example.bookshelf.domain;

import javax.persistence.*;

@Entity
@Table(name=("authorbook"))
public class AuthorBookEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name="id")
    private Integer id;

    @Column(name="ab_id")
    private Integer ab_id;

    private Integer authorid;
    private Integer bookid;

    public AuthorBookEntity() {
    }

    public AuthorBookEntity(Integer ab_id, Integer authorid, Integer bookid) {
        this.ab_id = ab_id;
        this.authorid = authorid;
        this.bookid = bookid;
    }

    public Integer getAb_id() {
        return ab_id;
    }

    public void setAb_id(Integer ab_id) {
        this.ab_id = ab_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
}
