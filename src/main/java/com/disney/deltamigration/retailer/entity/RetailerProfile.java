package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "retailer_profile",  catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RetailerProfile {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "retailer_id", nullable = true)
    private Integer retailerId;
    
    @Column(name = "filename", nullable = true, length = 255)
    private String filename;
    
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    
    @Column(name = "updated", nullable = false)
    private Timestamp updated;
    
    @Column(name = "isdeleted", nullable = false)
    private byte isdeleted;
    
    @Column(name = "xml", nullable = true, length = -1)
    private String xml;
    
    @Column(name = "profile_type", nullable = true)
    private Short profileType;
    
    @Column(name = "territory_id", nullable = true)
    private Integer territoryId;
    
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    
    @Column(name = "xytech_wo_type_no", nullable = true)
    private Integer xytechWoTypeNo;
    
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
    
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;
    
    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;
    
    @Column(name = "charge_code", nullable = true)
    private Integer chargeCode;
    
    @Column(name = "notes", nullable = true, length = -1)
    private String notes;
    
    @Column(name = "localization_type", nullable = true)
    private String localizationType;
    
    @Column(name = "presentation_type", nullable = true)
    private String presentationType;
    
    @Column(name = "base_id", nullable = true)
    private Integer baseId;
    
    @Column(name = "manufacturing_id", nullable = true)
    private Integer manufacturingId;
    
    @Column(name = "milestone_id", nullable = true)
    private Integer milestoneId;
    
    @Column(name = "sources_id", nullable = true)
    private Integer sourcesId;
    
    @Column(name = "transaction_id", nullable = true)
    private Integer transactionId;
    
    @Column(name = "isAutomated", nullable = false)
    private byte isAutomated;


}
