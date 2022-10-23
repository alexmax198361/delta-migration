package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "title_language", schema = "dsop_db_live", catalog = "")
public class TitleLanguage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "title_language_id")
    private Integer titleLanguageId;
    @Basic
    @Column(name = "language_id")
    private Integer languageId;
    @Basic
    @Column(name = "title_id")
    private Integer titleId;
    @Basic
    @Column(name = "localized_title_name")
    private String localizedTitleName;
    @Basic
    @Column(name = "keywords")
    private String keywords;
    @Basic
    @Column(name = "short_synopsis")
    private String shortSynopsis;
    @Basic
    @Column(name = "medium_synopsis")
    private String mediumSynopsis;
    @Basic
    @Column(name = "long_synopsis")
    private String longSynopsis;
    @Basic
    @Column(name = "rating_reason")
    private String ratingReason;
    @Basic
    @Column(name = "source_tp_id")
    private Integer sourceTpId;
    @Basic
    @Column(name = "source_tp_approval_id")
    private Integer sourceTpApprovalId;
    @Basic
    @Column(name = "source_tp_approved")
    private Byte sourceTpApproved;
    @Basic
    @Column(name = "source_tp_approved_by")
    private String sourceTpApprovedBy;
    @Basic
    @Column(name = "source_tp_approved_date")
    private Date sourceTpApprovedDate;
    @Basic
    @Column(name = "source_product_type_name")
    private String sourceProductTypeName;
    @Basic
    @Column(name = "source_product_edition")
    private String sourceProductEdition;
    @Basic
    @Column(name = "source_updated_date")
    private Date sourceUpdatedDate;
    @Basic
    @Column(name = "source_updated_by")
    private String sourceUpdatedBy;
    @Basic
    @Column(name = "update_timestamp")
    private Timestamp updateTimestamp;
    @Basic
    @Column(name = "assignee")
    private Integer assignee;
    @Basic
    @Column(name = "priority")
    private String priority;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "refresh_timestamp")
    private Timestamp refreshTimestamp;
    @Basic
    @Column(name = "copyright_holder")
    private String copyrightHolder;
    @Basic
    @Column(name = "cast_from_title")
    private Byte castFromTitle;
    @Basic
    @Column(name = "crew_from_title")
    private Byte crewFromTitle;
    @Basic
    @Column(name = "storm_film_id")
    private Integer stormFilmId;
    @Basic
    @Column(name = "chapters_approved")
    private Byte chaptersApproved;
    @Basic
    @Column(name = "group_id")
    private Integer groupId;

    public Integer getTitleLanguageId() {
        return titleLanguageId;
    }

    public void setTitleLanguageId(Integer titleLanguageId) {
        this.titleLanguageId = titleLanguageId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getLocalizedTitleName() {
        return localizedTitleName;
    }

    public void setLocalizedTitleName(String localizedTitleName) {
        this.localizedTitleName = localizedTitleName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getShortSynopsis() {
        return shortSynopsis;
    }

    public void setShortSynopsis(String shortSynopsis) {
        this.shortSynopsis = shortSynopsis;
    }

    public String getMediumSynopsis() {
        return mediumSynopsis;
    }

    public void setMediumSynopsis(String mediumSynopsis) {
        this.mediumSynopsis = mediumSynopsis;
    }

    public String getLongSynopsis() {
        return longSynopsis;
    }

    public void setLongSynopsis(String longSynopsis) {
        this.longSynopsis = longSynopsis;
    }

    public String getRatingReason() {
        return ratingReason;
    }

    public void setRatingReason(String ratingReason) {
        this.ratingReason = ratingReason;
    }

    public Integer getSourceTpId() {
        return sourceTpId;
    }

    public void setSourceTpId(Integer sourceTpId) {
        this.sourceTpId = sourceTpId;
    }

    public Integer getSourceTpApprovalId() {
        return sourceTpApprovalId;
    }

    public void setSourceTpApprovalId(Integer sourceTpApprovalId) {
        this.sourceTpApprovalId = sourceTpApprovalId;
    }

    public Byte getSourceTpApproved() {
        return sourceTpApproved;
    }

    public void setSourceTpApproved(Byte sourceTpApproved) {
        this.sourceTpApproved = sourceTpApproved;
    }

    public String getSourceTpApprovedBy() {
        return sourceTpApprovedBy;
    }

    public void setSourceTpApprovedBy(String sourceTpApprovedBy) {
        this.sourceTpApprovedBy = sourceTpApprovedBy;
    }

    public Date getSourceTpApprovedDate() {
        return sourceTpApprovedDate;
    }

    public void setSourceTpApprovedDate(Date sourceTpApprovedDate) {
        this.sourceTpApprovedDate = sourceTpApprovedDate;
    }

    public String getSourceProductTypeName() {
        return sourceProductTypeName;
    }

    public void setSourceProductTypeName(String sourceProductTypeName) {
        this.sourceProductTypeName = sourceProductTypeName;
    }

    public String getSourceProductEdition() {
        return sourceProductEdition;
    }

    public void setSourceProductEdition(String sourceProductEdition) {
        this.sourceProductEdition = sourceProductEdition;
    }

    public Date getSourceUpdatedDate() {
        return sourceUpdatedDate;
    }

    public void setSourceUpdatedDate(Date sourceUpdatedDate) {
        this.sourceUpdatedDate = sourceUpdatedDate;
    }

    public String getSourceUpdatedBy() {
        return sourceUpdatedBy;
    }

    public void setSourceUpdatedBy(String sourceUpdatedBy) {
        this.sourceUpdatedBy = sourceUpdatedBy;
    }

    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getRefreshTimestamp() {
        return refreshTimestamp;
    }

    public void setRefreshTimestamp(Timestamp refreshTimestamp) {
        this.refreshTimestamp = refreshTimestamp;
    }

    public String getCopyrightHolder() {
        return copyrightHolder;
    }

    public void setCopyrightHolder(String copyrightHolder) {
        this.copyrightHolder = copyrightHolder;
    }

    public Byte getCastFromTitle() {
        return castFromTitle;
    }

    public void setCastFromTitle(Byte castFromTitle) {
        this.castFromTitle = castFromTitle;
    }

    public Byte getCrewFromTitle() {
        return crewFromTitle;
    }

    public void setCrewFromTitle(Byte crewFromTitle) {
        this.crewFromTitle = crewFromTitle;
    }

    public Integer getStormFilmId() {
        return stormFilmId;
    }

    public void setStormFilmId(Integer stormFilmId) {
        this.stormFilmId = stormFilmId;
    }

    public Byte getChaptersApproved() {
        return chaptersApproved;
    }

    public void setChaptersApproved(Byte chaptersApproved) {
        this.chaptersApproved = chaptersApproved;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleLanguage that = (TitleLanguage) o;
        return Objects.equals(titleLanguageId, that.titleLanguageId) && Objects.equals(languageId, that.languageId) && Objects.equals(titleId, that.titleId) && Objects.equals(localizedTitleName, that.localizedTitleName) && Objects.equals(keywords, that.keywords) && Objects.equals(shortSynopsis, that.shortSynopsis) && Objects.equals(mediumSynopsis, that.mediumSynopsis) && Objects.equals(longSynopsis, that.longSynopsis) && Objects.equals(ratingReason, that.ratingReason) && Objects.equals(sourceTpId, that.sourceTpId) && Objects.equals(sourceTpApprovalId, that.sourceTpApprovalId) && Objects.equals(sourceTpApproved, that.sourceTpApproved) && Objects.equals(sourceTpApprovedBy, that.sourceTpApprovedBy) && Objects.equals(sourceTpApprovedDate, that.sourceTpApprovedDate) && Objects.equals(sourceProductTypeName, that.sourceProductTypeName) && Objects.equals(sourceProductEdition, that.sourceProductEdition) && Objects.equals(sourceUpdatedDate, that.sourceUpdatedDate) && Objects.equals(sourceUpdatedBy, that.sourceUpdatedBy) && Objects.equals(updateTimestamp, that.updateTimestamp) && Objects.equals(assignee, that.assignee) && Objects.equals(priority, that.priority) && Objects.equals(status, that.status) && Objects.equals(refreshTimestamp, that.refreshTimestamp) && Objects.equals(copyrightHolder, that.copyrightHolder) && Objects.equals(castFromTitle, that.castFromTitle) && Objects.equals(crewFromTitle, that.crewFromTitle) && Objects.equals(stormFilmId, that.stormFilmId) && Objects.equals(chaptersApproved, that.chaptersApproved) && Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleLanguageId, languageId, titleId, localizedTitleName, keywords, shortSynopsis, mediumSynopsis, longSynopsis, ratingReason, sourceTpId, sourceTpApprovalId, sourceTpApproved, sourceTpApprovedBy, sourceTpApprovedDate, sourceProductTypeName, sourceProductEdition, sourceUpdatedDate, sourceUpdatedBy, updateTimestamp, assignee, priority, status, refreshTimestamp, copyrightHolder, castFromTitle, crewFromTitle, stormFilmId, chaptersApproved, groupId);
    }
}
