package com.disney.deltamigration.retailer.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "workflow_manager", catalog = "")
public class WorkflowManager {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "workflow_xml")
    private String workflowXml;
    @Basic
    @Column(name = "input_message")
    private String inputMessage;
    @Basic
    @Column(name = "output_message")
    private String outputMessage;
    @Basic
    @Column(name = "workflow_status")
    private String workflowStatus;
    @Basic
    @Column(name = "order_xml")
    private String orderXml;
    @Basic
    @Column(name = "original_order_xml")
    private String originalOrderXml;
    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;
    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;
    @Basic
    @Column(name = "parent_workflow_id")
    private Integer parentWorkflowId;
    @Basic
    @Column(name = "parent_task_id")
    private Integer parentTaskId;
    @Basic
    @Column(name = "media_object_id")
    private Integer mediaObjectId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkflowXml() {
        return workflowXml;
    }

    public void setWorkflowXml(String workflowXml) {
        this.workflowXml = workflowXml;
    }

    public String getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(String inputMessage) {
        this.inputMessage = inputMessage;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public String getOrderXml() {
        return orderXml;
    }

    public void setOrderXml(String orderXml) {
        this.orderXml = orderXml;
    }

    public String getOriginalOrderXml() {
        return originalOrderXml;
    }

    public void setOriginalOrderXml(String originalOrderXml) {
        this.originalOrderXml = originalOrderXml;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getParentWorkflowId() {
        return parentWorkflowId;
    }

    public void setParentWorkflowId(Integer parentWorkflowId) {
        this.parentWorkflowId = parentWorkflowId;
    }

    public Integer getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(Integer parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public Integer getMediaObjectId() {
        return mediaObjectId;
    }

    public void setMediaObjectId(Integer mediaObjectId) {
        this.mediaObjectId = mediaObjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkflowManager that = (WorkflowManager) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(workflowXml, that.workflowXml) && Objects.equals(inputMessage, that.inputMessage) && Objects.equals(outputMessage, that.outputMessage) && Objects.equals(workflowStatus, that.workflowStatus) && Objects.equals(orderXml, that.orderXml) && Objects.equals(originalOrderXml, that.originalOrderXml) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(parentWorkflowId, that.parentWorkflowId) && Objects.equals(parentTaskId, that.parentTaskId) && Objects.equals(mediaObjectId, that.mediaObjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, workflowXml, inputMessage, outputMessage, workflowStatus, orderXml, originalOrderXml, startTime, endTime, parentWorkflowId, parentTaskId, mediaObjectId);
    }
}
