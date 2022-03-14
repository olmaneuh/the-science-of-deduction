package me.olmaneuh.blog.user;

import me.olmaneuh.blog.base.domain.BaseEntity;
import me.olmaneuh.blog.base.util.Constants;
import me.olmaneuh.blog.post.Post;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Constants.TABLE_NAME_USER)
public class User extends BaseEntity {

    @Column(name = Constants.TABLE_COLUMN_NAME_FIRST_NAME, nullable = false)
    private String firstName;

    @Column(name = Constants.TABLE_COLUMN_NAME_LAST_NAME, nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "author")
    List<Post> posts;

    public User() {
        super();
        posts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}
