package me.olmaneuh.blog.post;

import me.olmaneuh.blog.base.domain.BaseEntity;
import me.olmaneuh.blog.base.util.Constants;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Constants.TABLE_NAME_POST)
public class Post extends BaseEntity {

    private String title;
    private String extract;
    private String body;

    public Post() {
        super();
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

}
