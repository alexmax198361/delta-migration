package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_element", schema = "dsop_db_live", catalog = "")
public class ProductElement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productelement_id")
    private Integer productelementId;
    @Basic
    @Column(name = "product_id")
    private Integer productId;
    @Basic
    @Column(name = "product_element_type_id")
    private Integer productElementTypeId;
    @Basic
    @Column(name = "product_experience_type_id")
    private Integer productExperienceTypeId;

    public Integer getProductelementId() {
        return productelementId;
    }

    public void setProductelementId(Integer productelementId) {
        this.productelementId = productelementId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductElementTypeId() {
        return productElementTypeId;
    }

    public void setProductElementTypeId(Integer productElementTypeId) {
        this.productElementTypeId = productElementTypeId;
    }

    public Integer getProductExperienceTypeId() {
        return productExperienceTypeId;
    }

    public void setProductExperienceTypeId(Integer productExperienceTypeId) {
        this.productExperienceTypeId = productExperienceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductElement that = (ProductElement) o;
        return Objects.equals(productelementId, that.productelementId) && Objects.equals(productId, that.productId) && Objects.equals(productElementTypeId, that.productElementTypeId) && Objects.equals(productExperienceTypeId, that.productExperienceTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productelementId, productId, productElementTypeId, productExperienceTypeId);
    }
}
