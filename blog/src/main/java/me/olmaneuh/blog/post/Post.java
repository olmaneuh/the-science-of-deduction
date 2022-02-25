package me.olmaneuh.blog.post;

import me.olmaneuh.blog.base.domain.BaseEntity;
import me.olmaneuh.blog.base.util.Constants;
import me.olmaneuh.blog.user.User;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_NAME_POST)
public class Post extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Lob
    private String body;

    @Column(nullable = false)
    private boolean isPrivate;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = Constants.TABLE_FK_USERS_POSTS), nullable = false)
    private User author;

    public Post() {
        super();
        isPrivate = false;
        author = new User();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}
