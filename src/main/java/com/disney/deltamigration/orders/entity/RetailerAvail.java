package com.disney.deltamigration.orders.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "retailer_avail",  catalog = "")
public class RetailerAvail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "alt_id")
    private String altId;
    @Basic
    @Column(name = "retailer_id")
    private Integer retailerId;
    @Basic
    @Column(name = "title_id")
    private Integer titleId;
    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;
    @Basic
    @Column(name = "update_date")
    private Timestamp updateDate;
    @Basic
    @Column(name = "draft_order_title_id")
    private Integer draftOrderTitleId;
    @Basic
    @Column(name = "order_title_id")
    private Integer orderTitleId;
    @Basic
    @Column(name = "title_version_code")
    private String titleVersionCode;
    @Basic
    @Column(name = "isDeleted")
    private Byte isDeleted;
    @Basic
    @Column(name = "eidr_level_one")
    private String eidrLevelOne;
    @Basic
    @Column(name = "eidr_level_two")
    private String eidrLevelTwo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAltId() {
        return altId;
    }

    public void setAltId(String altId) {
        this.altId = altId;
    }

    public Integer getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
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

    public Integer getDraftOrderTitleId() {
        return draftOrderTitleId;
    }

    public void setDraftOrderTitleId(Integer draftOrderTitleId) {
        this.draftOrderTitleId = draftOrderTitleId;
    }

    public Integer getOrderTitleId() {
        return orderTitleId;
    }

    public void setOrderTitleId(Integer orderTitleId) {
        this.orderTitleId = orderTitleId;
    }

    public String getTitleVersionCode() {
        return titleVersionCode;
    }

    public void setTitleVersionCode(String titleVersionCode) {
        this.titleVersionCode = titleVersionCode;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getEidrLevelOne() {
        return eidrLevelOne;
    }

    public void setEidrLevelOne(String eidrLevelOne) {
        this.eidrLevelOne = eidrLevelOne;
    }

    public String getEidrLevelTwo() {
        return eidrLevelTwo;
    }

    public void setEidrLevelTwo(String eidrLevelTwo) {
        this.eidrLevelTwo = eidrLevelTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetailerAvail that = (RetailerAvail) o;
        return Objects.equals(id, that.id) && Objects.equals(altId, that.altId) && Objects.equals(retailerId, that.retailerId) && Objects.equals(titleId, that.titleId) && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(draftOrderTitleId, that.draftOrderTitleId) && Objects.equals(orderTitleId, that.orderTitleId) && Objects.equals(titleVersionCode, that.titleVersionCode) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(eidrLevelOne, that.eidrLevelOne) && Objects.equals(eidrLevelTwo, that.eidrLevelTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altId, retailerId, titleId, createDate, updateDate, draftOrderTitleId, orderTitleId, titleVersionCode, isDeleted, eidrLevelOne, eidrLevelTwo);
    }
}
