package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_types",  catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderTypes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "order_type_description")
    private String orderTypeDescription;
    
    @Column(name = "sendtoxytech")
    private Byte sendtoxytech;
    
    @Column(name = "xytech_wo_type_no")
    private Integer xytechWoTypeNo;


}
