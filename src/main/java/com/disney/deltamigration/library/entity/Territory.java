package com.disney.deltamigration.library.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Territory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "territory_id", nullable = false)
    private int territoryId;

    @Column(name = "territory_name", nullable = true, length = 255)
    private String territoryName;
    @Column(name = "territory_name_abbr_two", nullable = true, length = 12)
    private String territoryNameAbbrTwo;
    @Column(name = "territory_name_abbr_three", nullable = true, length = 12)
    private String territoryNameAbbrThree;
    @Column(name = "storm_territory_id", nullable = true)
    private Integer stormTerritoryId;
    @Column(name = "territory_flag_filename", nullable = true, length = 64)
    private String territoryFlagFilename;
    @Column(name = "region_id", nullable = true)
    private Integer regionId;
    @Column(name = "parent_territory_id", nullable = true)
    private Integer parentTerritoryId;
    @Column(name = "isactive", nullable = true)
    private Byte isactive;

}
