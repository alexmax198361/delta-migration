package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client_deliverables")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClientDeliverables {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "retailer_id")
    private Integer retailerId;
    
    @Column(name = "content_version_package_id")
    private Integer contentVersionPackageId;
    
    @Column(name = "title_id")
    private Integer titleId;
    
    @Column(name = "retailer_track_type")
    private String retailerTrackType;
    
    @Column(name = "retailer_trackid")
    private String retailerTrackid;
    
    @Column(name = "format")
    private String format;
    
    @Column(name = "content_type")
    private String contentType;
    
    @Column(name = "track_subtype")
    private String trackSubtype;
    
    @Column(name = "language_id")
    private Integer languageId;
    
    @Column(name = "file_tracker_id")
    private Integer fileTrackerId;
    
    @Column(name = "retailer_inventory_type")
    private String retailerInventoryType;
    
    @Column(name = "inventory_file_name")
    private String inventoryFileName;
    
    @Column(name = "isActive")
    private Byte isActive;
    
    @Column(name = "qc_status")
    private String qcStatus;

 
}
