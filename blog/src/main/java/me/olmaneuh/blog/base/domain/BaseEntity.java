package me.olmaneuh.blog.base.domain;

import me.olmaneuh.blog.base.util.Constants;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = Constants.TABLE_COLUMN_NAME_CREATED_DATE, nullable = false, updatable = false)
    private LocalDate createdDate;

    @Column(name = Constants.TABLE_COLUMN_NAME_UPDATED_DATE, nullable = false)
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
