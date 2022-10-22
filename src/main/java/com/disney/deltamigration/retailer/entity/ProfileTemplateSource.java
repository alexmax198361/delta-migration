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
@Table(name = "profile_template_source", catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProfileTemplateSource {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "profile_template_source_id", nullable = false)
    private int profileTemplateSourceId;
 
    @Column(name = "source_name", nullable = true, length = 100)
    private String sourceName;
 
    @Column(name = "source_xml_message", nullable = true)
    private byte[] sourceXmlMessage;
 
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
 
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;
 
    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;
 
    @Column(name = "updated_on", nullable = true)
    private Timestamp updatedOn;


}
