package me.olmaneuh.blog.post;

import me.olmaneuh.blog.base.domain.BaseEntity;
import me.olmaneuh.blog.base.util.Constants;
import me.olmaneuh.blog.user.User;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_NAME_POST)
public class Post extends BaseEntity {

    private String title;
    private String extract;
    private String body;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = Constants.TABLE_COLUMN_FK_USERS_POSTS))
    private User author;

    public Post() {
        super();
        author = new User();
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
