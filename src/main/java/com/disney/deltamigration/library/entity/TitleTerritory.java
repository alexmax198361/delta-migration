package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "title_territory", schema = "dsop_db_live", catalog = "")
public class TitleTerritory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "title_territory_id")
    private Integer titleTerritoryId;
    @Basic
    @Column(name = "territory_id")
    private Integer territoryId;
    @Basic
    @Column(name = "title_id")
    private Integer titleId;
    @Basic
    @Column(name = "box_office")
    private String boxOffice;
    @Basic
    @Column(name = "theatrical_release_date")
    private Date theatricalReleaseDate;
    @Basic
    @Column(name = "street_release_date")
    private Date streetReleaseDate;
    @Basic
    @Column(name = "rating_id")
    private Integer ratingId;
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
    @Column(name = "refresh_timestamp")
    private Timestamp refreshTimestamp;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "rating_reason")
    private String ratingReason;

    public Integer getTitleTerritoryId() {
        return titleTerritoryId;
    }

    public void setTitleTerritoryId(Integer titleTerritoryId) {
        this.titleTerritoryId = titleTerritoryId;
    }

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Date getTheatricalReleaseDate() {
        return theatricalReleaseDate;
    }

    public void setTheatricalReleaseDate(Date theatricalReleaseDate) {
        this.theatricalReleaseDate = theatricalReleaseDate;
    }

    public Date getStreetReleaseDate() {
        return streetReleaseDate;
    }

    public void setStreetReleaseDate(Date streetReleaseDate) {
        this.streetReleaseDate = streetReleaseDate;
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
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

    public Timestamp getRefreshTimestamp() {
        return refreshTimestamp;
    }

    public void setRefreshTimestamp(Timestamp refreshTimestamp) {
        this.refreshTimestamp = refreshTimestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRatingReason() {
        return ratingReason;
    }

    public void setRatingReason(String ratingReason) {
        this.ratingReason = ratingReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleTerritory that = (TitleTerritory) o;
        return Objects.equals(titleTerritoryId, that.titleTerritoryId) && Objects.equals(territoryId, that.territoryId) && Objects.equals(titleId, that.titleId) && Objects.equals(boxOffice, that.boxOffice) && Objects.equals(theatricalReleaseDate, that.theatricalReleaseDate) && Objects.equals(streetReleaseDate, that.streetReleaseDate) && Objects.equals(ratingId, that.ratingId) && Objects.equals(sourceTpId, that.sourceTpId) && Objects.equals(sourceTpApprovalId, that.sourceTpApprovalId) && Objects.equals(sourceTpApproved, that.sourceTpApproved) && Objects.equals(sourceTpApprovedBy, that.sourceTpApprovedBy) && Objects.equals(sourceTpApprovedDate, that.sourceTpApprovedDate) && Objects.equals(sourceProductTypeName, that.sourceProductTypeName) && Objects.equals(sourceProductEdition, that.sourceProductEdition) && Objects.equals(sourceUpdatedDate, that.sourceUpdatedDate) && Objects.equals(sourceUpdatedBy, that.sourceUpdatedBy) && Objects.equals(updateTimestamp, that.updateTimestamp) && Objects.equals(refreshTimestamp, that.refreshTimestamp) && Objects.equals(status, that.status) && Objects.equals(ratingReason, that.ratingReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleTerritoryId, territoryId, titleId, boxOffice, theatricalReleaseDate, streetReleaseDate, ratingId, sourceTpId, sourceTpApprovalId, sourceTpApproved, sourceTpApprovedBy, sourceTpApprovedDate, sourceProductTypeName, sourceProductEdition, sourceUpdatedDate, sourceUpdatedBy, updateTimestamp, refreshTimestamp, status, ratingReason);
    }
}
