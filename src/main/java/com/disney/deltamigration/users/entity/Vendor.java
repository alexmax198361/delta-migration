package com.disney.deltamigration.users.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Vendor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = true, length = 255)
    private String name;

    @Column(name = "logo", nullable = true, length = 255)
    private String logo;

    @Column(name = "vendor_type_id", nullable = true)
    private Integer vendorTypeId;

    @Column(name = "vendor_abbr", nullable = true, length = 2)
    private String vendorAbbr;

    @Column(name = "onboard_automation", nullable = true)
    private Byte onboardAutomation;

    @Column(name = "created_by", nullable = true)
    private Integer createdBy;

    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;

    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;

    @Column(name = "updated_on", nullable = true)
    private Timestamp updatedOn;

    @Column(name = "api_key", nullable = true, length = 20000)
    private String apiKey;

}
