package me.olmaneuh.blog.post;

import me.olmaneuh.blog.base.domain.BaseEntity;
import me.olmaneuh.blog.user.User;

import java.time.LocalDate;

public class Post extends BaseEntity {

    private String title;
    private String extract;
    private String body;
    private User author;

    public Post(Long id, LocalDate createdDate, LocalDate updatedDate, String title, String extract, String body, User author) {
        super(id, createdDate, updatedDate);
        this.title = title;
        this.extract = extract;
        this.body = body;
        this.author = author;
    }

    public Post(String title, String extract, String body, User author) {
        this.title = title;
        this.extract = extract;
        this.body = body;
        this.author = author;
    }

    public Post() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}
