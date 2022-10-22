package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "profile_template_manufacturing",  catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProfileTemplateManufacturing {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "profile_template_manufacturing_id", nullable = false)
    private int profileTemplateManufacturingId;
   
    @Column(name = "manufacturing_name", nullable = true, length = 100)
    private String manufacturingName;
   
    @Column(name = "manufacturing_xml_message", nullable = true)
    private byte[] manufacturingXmlMessage;
   
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
   
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;
   
    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;
   
    @Column(name = "updated_on", nullable = true)
    private Timestamp updatedOn;


}
