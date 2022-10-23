package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Market {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = true, length = 255)
    private String name;

    @Column(name = "type", columnDefinition = "ENUM('NULL', 'Territory', 'Region', 'Custom')")
    @Enumerated(EnumType.STRING)
    private MarketType type;
    @Column(name = "is_active", nullable = true)
    private Byte isActive;
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;

    @Column(name = "created_on", nullable = true)
    private LocalDateTime createdOn;

    @Column(name = "updated_on", nullable = true)
    private LocalDateTime updatedOn;

    @Column(name = "default_language", nullable = true)
    private Integer defaultLanguage;

    @Column(name = "default_territory", nullable = true)
    private Integer defaultTerritory;

}
