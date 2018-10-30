package com.example.bookshelf.domain;

import javafx.scene.input.DataFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="book_id")
    private Integer book_id;
    @Column(name="name")
    private String name;
    @Column(name="published")
    private Date published;
    @Column(name="genre")
    private String genre;
    @Column(name="rating")
    private Integer rating;

    public BookEntity() {

    }

    public BookEntity(Integer book_id,String name, Date published, String genre, Integer rating) {
        this.book_id=book_id;
        this.name = name;
        this.published = published;
        this.genre = genre;
        this.rating = rating;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
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

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
