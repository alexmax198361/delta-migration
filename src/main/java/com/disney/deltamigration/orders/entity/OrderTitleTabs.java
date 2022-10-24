package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_title_tabs")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderTitleTabs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_title_tabs_id")
    private Integer orderTitleTabsId;
    @Basic
    @Column(name = "tab_name")
    private String tabName;
    @Basic
    @Column(name = "is_valid")
    private Byte isValid;
}


