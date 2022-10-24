package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Orders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "order_date")
    private Timestamp orderDate;
    
    @Column(name = "retailer_id")
    private Integer retailerId;
    
    @Column(name = "creator")
    private Integer creator;
    
    @Column(name = "behalf")
    private Integer behalf;
    
    @Column(name = "behalf_group")
    private Integer behalfGroup;
    
    @Column(name = "priority")
    private String priority;
    
    @Column(name = "duedate")
    private Date duedate;
    
    @Column(name = "order_status")
    private String orderStatus;
    
    @Column(name = "order_type")
    private String orderType;
    
    @Column(name = "system_generated")
    private Byte systemGenerated;
    
    @Column(name = "charge_code")
    private Integer chargeCode;
    
    @Column(name = "car_assignment")
    private Integer carAssignment;
    
    @Column(name = "vendor")
    private Integer vendor;
    
    @Column(name = "parent_do")
    private Integer parentDo;
    
    @Column(name = "billing_status")
    private String billingStatus;
    
    @Column(name = "order_closed_date")
    private Timestamp orderClosedDate;
    
    @Column(name = "vendorsite")
    private Integer vendorsite;
    
    @Column(name = "order_notes")
    private String orderNotes;
    
    @Column(name = "retailer_profile_id")
    private Integer retailerProfileId;
    
    @Column(name = "order_name")
    private String orderName;
    
    @Column(name = "jobtype_id")
    private Integer jobtypeId;
    
    @Column(name = "division_id")
    private Integer divisionId;
    
    @Column(name = "customer_id")
    private Integer customerId;
    
    @Column(name = "ratecard_id")
    private Integer ratecardId;
    
    @Column(name = "project_manager_id")
    private Integer projectManagerId;
    
    @Column(name = "xytech_job_no")
    private Integer xytechJobNo;
    
    @Column(name = "xytech_status")
    private String xytechStatus;
    
    @Column(name = "workflow_id")
    private Integer workflowId;
    
    @Column(name = "justification")
    private String justification;


}
