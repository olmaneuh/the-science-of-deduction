package me.olmaneuh.blog.user;

import me.olmaneuh.blog.base.domain.BaseEntity;

import java.time.LocalDate;

public class User extends BaseEntity {

    private String firstName;
    private String lastName;

    public User(Long id, LocalDate createdDate, LocalDate updatedDate, String firstName, String lastName) {
        super(id, createdDate, updatedDate);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {

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

}
