package com.disney.deltamigration.retailer.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "workflow_definition", catalog = "")
public class WorkflowDefinition {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "author")
    private Integer author;
    @Basic
    @Column(name = "author_date")
    private Timestamp authorDate;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "file_path")
    private String filePath;
    @Basic
    @Column(name = "isAutomated")
    private Byte isAutomated;
    @Basic
    @Column(name = "isRedelivery")
    private Byte isRedelivery;
    @Basic
    @Column(name = "isTransmit")
    private Byte isTransmit;
    @Basic
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Basic
    @Column(name = "updated_on")
    private Timestamp updatedOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Timestamp getAuthorDate() {
        return authorDate;
    }

    public void setAuthorDate(Timestamp authorDate) {
        this.authorDate = authorDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Byte getIsAutomated() {
        return isAutomated;
    }

    public void setIsAutomated(Byte isAutomated) {
        this.isAutomated = isAutomated;
    }

    public Byte getIsRedelivery() {
        return isRedelivery;
    }

    public void setIsRedelivery(Byte isRedelivery) {
        this.isRedelivery = isRedelivery;
    }

    public Byte getIsTransmit() {
        return isTransmit;
    }

    public void setIsTransmit(Byte isTransmit) {
        this.isTransmit = isTransmit;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkflowDefinition that = (WorkflowDefinition) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(author, that.author) && Objects.equals(authorDate, that.authorDate) && Objects.equals(description, that.description) && Objects.equals(filePath, that.filePath) && Objects.equals(isAutomated, that.isAutomated) && Objects.equals(isRedelivery, that.isRedelivery) && Objects.equals(isTransmit, that.isTransmit) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(updatedOn, that.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, authorDate, description, filePath, isAutomated, isRedelivery, isTransmit, updatedBy, updatedOn);
    }
}
