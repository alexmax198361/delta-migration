package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "retailer_site", catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RetailerSite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "retailer_site_id", nullable = false)
    private int retailerSiteId;
    
    @Column(name = "retailer", nullable = true)
    private Integer retailer;
    
    @Column(name = "site_name", nullable = true, length = 50)
    private String siteName;
    
    @Column(name = "site_xml", nullable = true, length = -1)
    private String siteXml;
    
    @Column(name = "delivery_method", nullable = true)
    private String deliveryMethod;
    
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
    
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;
    
    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;
    
    @Column(name = "updated_on", nullable = true)
    private Timestamp updatedOn;

}
