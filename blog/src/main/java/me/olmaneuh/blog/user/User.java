package me.olmaneuh.blog.user;

import me.olmaneuh.blog.base.domain.BaseEntity;
import me.olmaneuh.blog.base.util.Constants;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Constants.TABLE_NAME_USER)
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public User() {
        super();
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

}
