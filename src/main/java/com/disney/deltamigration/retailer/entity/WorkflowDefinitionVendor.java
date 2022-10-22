package com.disney.deltamigration.retailer.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "workflow_definition_vendor",  catalog = "")
public class WorkflowDefinitionVendor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "vendorsite_id")
    private Integer vendorsiteId;
    @Basic
    @Column(name = "workflow_definition_id")
    private Integer workflowDefinitionId;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "isdefault")
    private Byte isdefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVendorsiteId() {
        return vendorsiteId;
    }

    public void setVendorsiteId(Integer vendorsiteId) {
        this.vendorsiteId = vendorsiteId;
    }

    public Integer getWorkflowDefinitionId() {
        return workflowDefinitionId;
    }

    public void setWorkflowDefinitionId(Integer workflowDefinitionId) {
        this.workflowDefinitionId = workflowDefinitionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Byte isdefault) {
        this.isdefault = isdefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkflowDefinitionVendor that = (WorkflowDefinitionVendor) o;
        return Objects.equals(id, that.id) && Objects.equals(vendorsiteId, that.vendorsiteId) && Objects.equals(workflowDefinitionId, that.workflowDefinitionId) && Objects.equals(description, that.description) && Objects.equals(isdefault, that.isdefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vendorsiteId, workflowDefinitionId, description, isdefault);
    }
}
