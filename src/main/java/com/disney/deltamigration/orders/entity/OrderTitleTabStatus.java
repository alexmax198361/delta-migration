package com.disney.deltamigration.orders.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_title_tab_status")
public class OrderTitleTabStatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_title_tab_status_id")
    private Integer orderTitleTabStatusId;
    
    @Column(name = "order_title_id")
    private Integer orderTitleId;
    
    @Column(name = "tab_id")
    private Integer tabId;
    
    @Column(name = "status")
    private String status;


}
