package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "market_region_territory")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MarketRegionTerritory {
    @Basic
    @Column(name = "market", nullable = true)
    private Integer market;

    @Column(name = "region", nullable = true)
    private Integer region;

    @Column(name = "territory", nullable = true)
    private Integer territory;

}
