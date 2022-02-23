package me.olmaneuh.blog.base.domain;

import me.olmaneuh.blog.base.util.Constants;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = Constants.TABLE_COLUMN_NAME_CREATED_DATE)
    private LocalDate createdDate;
    @Column(name = Constants.TABLE_COLUMN_NAME_UPDATED_DATE)
    private LocalDate updatedDate;

    public BaseEntity() {
        createdDate = LocalDate.now();
        updatedDate = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

}
