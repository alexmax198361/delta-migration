package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "productelement_deltaasset", schema = "dsop_db_live", catalog = "")
public class ProductelementDeltaasset {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "productelement_id")
    private Integer productelementId;
    @Basic
    @Column(name = "delta_id")
    private Integer deltaId;
    @Basic
    @Column(name = "asset_primary")
    private Byte assetPrimary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductelementId() {
        return productelementId;
    }

    public void setProductelementId(Integer productelementId) {
        this.productelementId = productelementId;
    }

    public Integer getDeltaId() {
        return deltaId;
    }

    public void setDeltaId(Integer deltaId) {
        this.deltaId = deltaId;
    }

    public Byte getAssetPrimary() {
        return assetPrimary;
    }

    public void setAssetPrimary(Byte assetPrimary) {
        this.assetPrimary = assetPrimary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductelementDeltaasset that = (ProductelementDeltaasset) o;
        return Objects.equals(id, that.id) && Objects.equals(productelementId, that.productelementId) && Objects.equals(deltaId, that.deltaId) && Objects.equals(assetPrimary, that.assetPrimary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productelementId, deltaId, assetPrimary);
    }
}
