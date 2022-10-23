package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id")
    private Integer productId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "market_id")
    private Integer marketId;
    @Basic
    @Column(name = "title_id")
    private Integer titleId;
    @Basic
    @Column(name = "line_of_business")
    private Integer lineOfBusiness;
    @Basic
    @Column(name = "titleversion_id")
    private Integer titleversionId;
    @Basic
    @Column(name = "producttemplate_id")
    private Integer producttemplateId;
    @Basic
    @Column(name = "locked")
    private Integer locked;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public Object getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(Integer lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public Integer getTitleversionId() {
        return titleversionId;
    }

    public void setTitleversionId(Integer titleversionId) {
        this.titleversionId = titleversionId;
    }

    public Integer getProducttemplateId() {
        return producttemplateId;
    }

    public void setProducttemplateId(Integer producttemplateId) {
        this.producttemplateId = producttemplateId;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(status, product.status) && Objects.equals(marketId, product.marketId) && Objects.equals(titleId, product.titleId) && Objects.equals(lineOfBusiness, product.lineOfBusiness) && Objects.equals(titleversionId, product.titleversionId) && Objects.equals(producttemplateId, product.producttemplateId) && Objects.equals(locked, product.locked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, description, status, marketId, titleId, lineOfBusiness, titleversionId, producttemplateId, locked);
    }
}
