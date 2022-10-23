package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "content_version_package", schema = "dsop_db_live", catalog = "")
public class ContentVersionPackage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "title_version_package_type")
    private String titleVersionPackageType;
    @Basic
    @Column(name = "title_version_id")
    private Integer titleVersionId;
    @Basic
    @Column(name = "content_type")
    private String contentType;
    @Basic
    @Column(name = "map_status")
    private String mapStatus;
    @Basic
    @Column(name = "map_revision")
    private Integer mapRevision;
    @Basic
    @Column(name = "map_date")
    private Date mapDate;
    @Basic
    @Column(name = "map_assignee")
    private Integer mapAssignee;
    @Basic
    @Column(name = "map_lastauthor")
    private Integer mapLastauthor;
    @Basic
    @Column(name = "map_ingestdirectory")
    private String mapIngestdirectory;
    @Basic
    @Column(name = "map_workflow_stage")
    private Integer mapWorkflowStage;
    @Basic
    @Column(name = "assignee")
    private Integer assignee;
    @Basic
    @Column(name = "priority")
    private String priority;
    @Basic
    @Column(name = "rank")
    private Integer rank;
    @Basic
    @Column(name = "map_stagediretory")
    private String mapStagediretory;
    @Basic
    @Column(name = "map_qc_status")
    private Byte mapQcStatus;
    @Basic
    @Column(name = "map_manual_link_required")
    private Byte mapManualLinkRequired;
    @Basic
    @Column(name = "map_assignee_group")
    private Integer mapAssigneeGroup;
    @Basic
    @Column(name = "group_id")
    private Integer groupId;
    @Basic
    @Column(name = "relatedcontent_id")
    private Integer relatedcontentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleVersionPackageType() {
        return titleVersionPackageType;
    }

    public void setTitleVersionPackageType(String titleVersionPackageType) {
        this.titleVersionPackageType = titleVersionPackageType;
    }

    public Integer getTitleVersionId() {
        return titleVersionId;
    }

    public void setTitleVersionId(Integer titleVersionId) {
        this.titleVersionId = titleVersionId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getMapStatus() {
        return mapStatus;
    }

    public void setMapStatus(String mapStatus) {
        this.mapStatus = mapStatus;
    }

    public Integer getMapRevision() {
        return mapRevision;
    }

    public void setMapRevision(Integer mapRevision) {
        this.mapRevision = mapRevision;
    }

    public Date getMapDate() {
        return mapDate;
    }

    public void setMapDate(Date mapDate) {
        this.mapDate = mapDate;
    }

    public Integer getMapAssignee() {
        return mapAssignee;
    }

    public void setMapAssignee(Integer mapAssignee) {
        this.mapAssignee = mapAssignee;
    }

    public Integer getMapLastauthor() {
        return mapLastauthor;
    }

    public void setMapLastauthor(Integer mapLastauthor) {
        this.mapLastauthor = mapLastauthor;
    }

    public String getMapIngestdirectory() {
        return mapIngestdirectory;
    }

    public void setMapIngestdirectory(String mapIngestdirectory) {
        this.mapIngestdirectory = mapIngestdirectory;
    }

    public Integer getMapWorkflowStage() {
        return mapWorkflowStage;
    }

    public void setMapWorkflowStage(Integer mapWorkflowStage) {
        this.mapWorkflowStage = mapWorkflowStage;
    }

    public Integer getAssignee() {
        return assignee;
    }

    public void setAssignee(Integer assignee) {
        this.assignee = assignee;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getMapStagediretory() {
        return mapStagediretory;
    }

    public void setMapStagediretory(String mapStagediretory) {
        this.mapStagediretory = mapStagediretory;
    }

    public Byte getMapQcStatus() {
        return mapQcStatus;
    }

    public void setMapQcStatus(Byte mapQcStatus) {
        this.mapQcStatus = mapQcStatus;
    }

    public Byte getMapManualLinkRequired() {
        return mapManualLinkRequired;
    }

    public void setMapManualLinkRequired(Byte mapManualLinkRequired) {
        this.mapManualLinkRequired = mapManualLinkRequired;
    }

    public Integer getMapAssigneeGroup() {
        return mapAssigneeGroup;
    }

    public void setMapAssigneeGroup(Integer mapAssigneeGroup) {
        this.mapAssigneeGroup = mapAssigneeGroup;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRelatedcontentId() {
        return relatedcontentId;
    }

    public void setRelatedcontentId(Integer relatedcontentId) {
        this.relatedcontentId = relatedcontentId;
    }

}
