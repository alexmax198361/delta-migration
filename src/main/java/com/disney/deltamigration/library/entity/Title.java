package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
public class Title {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "storm_title_id")
    private Integer stormTitleId;
    @Basic
    @Column(name = "legal_title")
    private String legalTitle;
    @Basic
    @Column(name = "alt")
    private String alt;
    @Basic
    @Column(name = "abbreviated")
    private String abbreviated;
    @Basic
    @Column(name = "mpm")
    private Long mpm;
    @Basic
    @Column(name = "release_year")
    private Integer releaseYear;
    @Basic
    @Column(name = "aspect_ratio")
    private Integer aspectRatio;
    @Basic
    @Column(name = "banner")
    private String banner;
    @Basic
    @Column(name = "popularity")
    private Integer popularity;
    @Basic
    @Column(name = "creation_date")
    private Date creationDate;
    @Basic
    @Column(name = "priority")
    private Integer priority;
    @Basic
    @Column(name = "origin_territory_id")
    private Integer originTerritoryId;
    @Basic
    @Column(name = "original_version_language_id")
    private Integer originalVersionLanguageId;
    @Basic
    @Column(name = "isan")
    private String isan;
    @Basic
    @Column(name = "imdb_id")
    private String imdbId;
    @Basic
    @Column(name = "production_company_id")
    private Integer productionCompanyId;
    @Basic
    @Column(name = "title_radar_info_id")
    private Integer titleRadarInfoId;
    @Basic
    @Column(name = "source_approved")
    private Byte sourceApproved;
    @Basic
    @Column(name = "source_approved_by")
    private String sourceApprovedBy;
    @Basic
    @Column(name = "source_approved_date")
    private Date sourceApprovedDate;
    @Basic
    @Column(name = "storm_mpm_product_number")
    private Long stormMpmProductNumber;
    @Basic
    @Column(name = "umid")
    private String umid;
    @Basic
    @Column(name = "type_name")
    private String typeName;
    @Basic
    @Column(name = "provider_name")
    private String providerName;
    @Basic
    @Column(name = "update_timestamp")
    private Timestamp updateTimestamp;
    @Basic
    @Column(name = "world_id")
    private Integer worldId;
    @Basic
    @Column(name = "category")
    private String category;
    @Basic
    @Column(name = "product_type")
    private String productType;
    @Basic
    @Column(name = "default_eidr_org")
    private Integer defaultEidrOrg;
    @Basic
    @Column(name = "default_eidr_org_type")
    private String defaultEidrOrgType;
    @Basic
    @Column(name = "is_animated")
    private Byte isAnimated;
    @Basic
    @Column(name = "bonus_lock")
    private Byte bonusLock;
    @Basic
    @Column(name = "bonus_priority")
    private Integer bonusPriority;
    @Basic
    @Column(name = "isActive")
    private Byte isActive;
    @Basic
    @Column(name = "isAssetPrepLocked")
    private Byte isAssetPrepLocked;
    @Basic
    @Column(name = "isLibrary")
    private Byte isLibrary;
    @Basic
    @Column(name = "trt")
    private String trt;
    @Basic
    @Column(name = "working_title")
    private String workingTitle;
    @Basic
    @Column(name = "isLocked")
    private Byte isLocked;
    @Basic
    @Column(name = "ispublishable")
    private Byte ispublishable;
    @Basic
    @Column(name = "xytech_title_no")
    private Integer xytechTitleNo;
    @Basic
    @Column(name = "eidr_title_id")
    private String eidrTitleId;
    @Basic
    @Column(name = "wbs_number")
    private Integer wbsNumber;
    @Basic
    @Column(name = "sonar_title_id")
    private Integer sonarTitleId;
    @Basic
    @Column(name = "th_title_abbr")
    private String thTitleAbbr;
    @Basic
    @Column(name = "theatrical_OAR")
    private Integer theatricalOar;
    @Basic
    @Column(name = "projector_ar_code")
    private String projectorArCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStormTitleId() {
        return stormTitleId;
    }

    public void setStormTitleId(Integer stormTitleId) {
        this.stormTitleId = stormTitleId;
    }

    public String getLegalTitle() {
        return legalTitle;
    }

    public void setLegalTitle(String legalTitle) {
        this.legalTitle = legalTitle;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAbbreviated() {
        return abbreviated;
    }

    public void setAbbreviated(String abbreviated) {
        this.abbreviated = abbreviated;
    }

    public Long getMpm() {
        return mpm;
    }

    public void setMpm(Long mpm) {
        this.mpm = mpm;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Integer aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getOriginTerritoryId() {
        return originTerritoryId;
    }

    public void setOriginTerritoryId(Integer originTerritoryId) {
        this.originTerritoryId = originTerritoryId;
    }

    public Integer getOriginalVersionLanguageId() {
        return originalVersionLanguageId;
    }

    public void setOriginalVersionLanguageId(Integer originalVersionLanguageId) {
        this.originalVersionLanguageId = originalVersionLanguageId;
    }

    public String getIsan() {
        return isan;
    }

    public void setIsan(String isan) {
        this.isan = isan;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Integer getProductionCompanyId() {
        return productionCompanyId;
    }

    public void setProductionCompanyId(Integer productionCompanyId) {
        this.productionCompanyId = productionCompanyId;
    }

    public Integer getTitleRadarInfoId() {
        return titleRadarInfoId;
    }

    public void setTitleRadarInfoId(Integer titleRadarInfoId) {
        this.titleRadarInfoId = titleRadarInfoId;
    }

    public Byte getSourceApproved() {
        return sourceApproved;
    }

    public void setSourceApproved(Byte sourceApproved) {
        this.sourceApproved = sourceApproved;
    }

    public String getSourceApprovedBy() {
        return sourceApprovedBy;
    }

    public void setSourceApprovedBy(String sourceApprovedBy) {
        this.sourceApprovedBy = sourceApprovedBy;
    }

    public Date getSourceApprovedDate() {
        return sourceApprovedDate;
    }

    public void setSourceApprovedDate(Date sourceApprovedDate) {
        this.sourceApprovedDate = sourceApprovedDate;
    }

    public Long getStormMpmProductNumber() {
        return stormMpmProductNumber;
    }

    public void setStormMpmProductNumber(Long stormMpmProductNumber) {
        this.stormMpmProductNumber = stormMpmProductNumber;
    }

    public String getUmid() {
        return umid;
    }

    public void setUmid(String umid) {
        this.umid = umid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getDefaultEidrOrg() {
        return defaultEidrOrg;
    }

    public void setDefaultEidrOrg(Integer defaultEidrOrg) {
        this.defaultEidrOrg = defaultEidrOrg;
    }

    public String getDefaultEidrOrgType() {
        return defaultEidrOrgType;
    }

    public void setDefaultEidrOrgType(String defaultEidrOrgType) {
        this.defaultEidrOrgType = defaultEidrOrgType;
    }

    public Byte getIsAnimated() {
        return isAnimated;
    }

    public void setIsAnimated(Byte isAnimated) {
        this.isAnimated = isAnimated;
    }

    public Byte getBonusLock() {
        return bonusLock;
    }

    public void setBonusLock(Byte bonusLock) {
        this.bonusLock = bonusLock;
    }

    public Integer getBonusPriority() {
        return bonusPriority;
    }

    public void setBonusPriority(Integer bonusPriority) {
        this.bonusPriority = bonusPriority;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public Byte getIsAssetPrepLocked() {
        return isAssetPrepLocked;
    }

    public void setIsAssetPrepLocked(Byte isAssetPrepLocked) {
        this.isAssetPrepLocked = isAssetPrepLocked;
    }

    public Byte getIsLibrary() {
        return isLibrary;
    }

    public void setIsLibrary(Byte isLibrary) {
        this.isLibrary = isLibrary;
    }

    public String getTrt() {
        return trt;
    }

    public void setTrt(String trt) {
        this.trt = trt;
    }

    public String getWorkingTitle() {
        return workingTitle;
    }

    public void setWorkingTitle(String workingTitle) {
        this.workingTitle = workingTitle;
    }

    public Byte getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Byte isLocked) {
        this.isLocked = isLocked;
    }

    public Byte getIspublishable() {
        return ispublishable;
    }

    public void setIspublishable(Byte ispublishable) {
        this.ispublishable = ispublishable;
    }

    public Integer getXytechTitleNo() {
        return xytechTitleNo;
    }

    public void setXytechTitleNo(Integer xytechTitleNo) {
        this.xytechTitleNo = xytechTitleNo;
    }

    public String getEidrTitleId() {
        return eidrTitleId;
    }

    public void setEidrTitleId(String eidrTitleId) {
        this.eidrTitleId = eidrTitleId;
    }

    public Integer getWbsNumber() {
        return wbsNumber;
    }

    public void setWbsNumber(Integer wbsNumber) {
        this.wbsNumber = wbsNumber;
    }

    public Integer getSonarTitleId() {
        return sonarTitleId;
    }

    public void setSonarTitleId(Integer sonarTitleId) {
        this.sonarTitleId = sonarTitleId;
    }

    public String getThTitleAbbr() {
        return thTitleAbbr;
    }

    public void setThTitleAbbr(String thTitleAbbr) {
        this.thTitleAbbr = thTitleAbbr;
    }

    public Integer getTheatricalOar() {
        return theatricalOar;
    }

    public void setTheatricalOar(Integer theatricalOar) {
        this.theatricalOar = theatricalOar;
    }

    public String getProjectorArCode() {
        return projectorArCode;
    }

    public void setProjectorArCode(String projectorArCode) {
        this.projectorArCode = projectorArCode;
    }

}
