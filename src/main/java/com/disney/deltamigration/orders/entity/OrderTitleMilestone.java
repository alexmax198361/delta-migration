package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "order_title_milestone",  catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderTitleMilestone {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "order_id")
    private Integer orderId;
    
    @Column(name = "order_title_id")
    private Integer orderTitleId;
    
    @Column(name = "milestone_type_id")
    private Integer milestoneTypeId;
    
    @Column(name = "date")
    private Date date;
    
    @Column(name = "reference_order_title_milestone")
    private Integer referenceOrderTitleMilestone;
    
    @Column(name = "offset_duration")
    private Integer offsetDuration;
    
    @Column(name = "business_days")
    private Byte businessDays;
    
    @Column(name = "template_date")
    private Date templateDate;
    
    @Column(name = "estimated_date")
    private Date estimatedDate;
    
    @Column(name = "due_date")
    private Date dueDate;
    
    @Column(name = "milestone_name")
    private String milestoneName;
    
    @Column(name = "flexibility")
    private String flexibility;
    
    @Column(name = "order_number")
    private Integer orderNumber;


}
