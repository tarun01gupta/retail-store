package com.assignment.retailstore.entity;

import java.time.LocalDateTime;

/**
 * Base Entity class for POJO classes
 */
public class BaseEntity {
    /**
     * create by username
     */
    String createdBy;

    /**
     * created date of the Entity
     */
    LocalDateTime createdDate;
    /**
     * updated by username
     */
    String updatedBy;
    /**
     * updated date of the Entity
     */
    LocalDateTime updatedDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
