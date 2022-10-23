package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
public class Titleversion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "title_id")
    private Integer titleId;
    @Basic
    @Column(name = "version_type_id")
    private Integer versionTypeId;
    @Basic
    @Column(name = "trt")
    private String trt;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "isan")
    private String isan;
    @Basic
    @Column(name = "isprimary")
    private Byte isprimary;
    @Basic
    @Column(name = "isActive")
    private Byte isActive;
    @Basic
    @Column(name = "eidr_version_id")
    private String eidrVersionId;
    @Basic
    @Column(name = "edit_use_id")
    private Integer editUseId;
    @Basic
    @Column(name = "islocked")
    private Byte islocked;
    @Basic
    @Column(name = "structural_type")
    private String structuralType;
    @Basic
    @Column(name = "resource_name")
    private String resourceName;
    @Basic
    @Column(name = "release_date")
    private Timestamp releaseDate;
    @Basic
    @Column(name = "publication_status")
    private String publicationStatus;
    @Basic
    @Column(name = "edit_details")
    private String editDetails;
    @Basic
    @Column(name = "color_type")
    private String colorType;
    @Basic
    @Column(name = "is3d")
    private Byte is3D;
    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;
    @Basic
    @Column(name = "update_date")
    private Timestamp updateDate;
    @Basic
    @Column(name = "delta_asset_id")
    private Integer deltaAssetId;
    @Basic
    @Column(name = "isassetneeded")
    private Byte isassetneeded;
    @Basic
    @Column(name = "approximate_length")
    private String approximateLength;
    @Basic
    @Column(name = "isDeleted")
    private Byte isDeleted;
    @Basic
    @Column(name = "referent_type")
    private String referentType;
    @Basic
    @Column(name = "isDefault")
    private Byte isDefault;
    @Basic
    @Column(name = "version_radar_info_id")
    private Integer versionRadarInfoId;
    @Basic
    @Column(name = "language_id")
    private Integer languageId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "version_code")
    private String versionCode;
    @Basic
    @Column(name = "isdefaultlanguage")
    private Byte isdefaultlanguage;
    @Basic
    @Column(name = "parent_title_version_id")
    private Integer parentTitleVersionId;
    @Basic
    @Column(name = "is_restricted")
    private Byte isRestricted;
    @Basic
    @Column(name = "sonar_title_version_id")
    private Integer sonarTitleVersionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getVersionTypeId() {
        return versionTypeId;
    }

    public void setVersionTypeId(Integer versionTypeId) {
        this.versionTypeId = versionTypeId;
    }

    public String getTrt() {
        return trt;
    }

    public void setTrt(String trt) {
        this.trt = trt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsan() {
        return isan;
    }

    public void setIsan(String isan) {
        this.isan = isan;
    }

    public Byte getIsprimary() {
        return isprimary;
    }

    public void setIsprimary(Byte isprimary) {
        this.isprimary = isprimary;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public String getEidrVersionId() {
        return eidrVersionId;
    }

    public void setEidrVersionId(String eidrVersionId) {
        this.eidrVersionId = eidrVersionId;
    }

    public Integer getEditUseId() {
        return editUseId;
    }

    public void setEditUseId(Integer editUseId) {
        this.editUseId = editUseId;
    }

    public Byte getIslocked() {
        return islocked;
    }

    public void setIslocked(Byte islocked) {
        this.islocked = islocked;
    }

    public String getStructuralType() {
        return structuralType;
    }

    public void setStructuralType(String structuralType) {
        this.structuralType = structuralType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublicationStatus() {
        return publicationStatus;
    }

    public void setPublicationStatus(String publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    public String getEditDetails() {
        return editDetails;
    }

    public void setEditDetails(String editDetails) {
        this.editDetails = editDetails;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public Byte getIs3D() {
        return is3D;
    }

    public void setIs3D(Byte is3D) {
        this.is3D = is3D;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDeltaAssetId() {
        return deltaAssetId;
    }

    public void setDeltaAssetId(Integer deltaAssetId) {
        this.deltaAssetId = deltaAssetId;
    }

    public Byte getIsassetneeded() {
        return isassetneeded;
    }

    public void setIsassetneeded(Byte isassetneeded) {
        this.isassetneeded = isassetneeded;
    }

    public String getApproximateLength() {
        return approximateLength;
    }

    public void setApproximateLength(String approximateLength) {
        this.approximateLength = approximateLength;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getReferentType() {
        return referentType;
    }

    public void setReferentType(String referentType) {
        this.referentType = referentType;
    }

    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getVersionRadarInfoId() {
        return versionRadarInfoId;
    }

    public void setVersionRadarInfoId(Integer versionRadarInfoId) {
        this.versionRadarInfoId = versionRadarInfoId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public Byte getIsdefaultlanguage() {
        return isdefaultlanguage;
    }

    public void setIsdefaultlanguage(Byte isdefaultlanguage) {
        this.isdefaultlanguage = isdefaultlanguage;
    }

    public Integer getParentTitleVersionId() {
        return parentTitleVersionId;
    }

    public void setParentTitleVersionId(Integer parentTitleVersionId) {
        this.parentTitleVersionId = parentTitleVersionId;
    }

    public Byte getIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(Byte isRestricted) {
        this.isRestricted = isRestricted;
    }

    public Integer getSonarTitleVersionId() {
        return sonarTitleVersionId;
    }

    public void setSonarTitleVersionId(Integer sonarTitleVersionId) {
        this.sonarTitleVersionId = sonarTitleVersionId;
    }


}
