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
@Table(name = "retailer_user",  catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RetailerUser {
    
    @Column(name = "retailer", nullable = true)
    private Integer retailer;
    
    @Column(name = "user", nullable = true)
    private Integer user;


}
