package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderTitleClientDeliverables {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "order_title_id")
    private Integer orderTitleId;
    
    @Column(name = "client_deliverables_id")
    private Integer clientDeliverablesId;
    
    @Column(name = "delivery_type")
    private String deliveryType;
    
    @Column(name = "delivery_status")
    private String deliveryStatus;
    
    @Column(name = "delivery_date")
    private Timestamp deliveryDate;


}
