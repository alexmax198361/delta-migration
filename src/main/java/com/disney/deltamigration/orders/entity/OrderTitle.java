package com.disney.deltamigration.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_title")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderTitle {
    
    @Column(name = "order")
    private Integer order;
    
    @Column(name = "title")
    private Integer title;
    
    @Column(name = "title_duedate")
    private Date titleDuedate;
    
    @Column(name = "equal_cartduedate")
    private Byte equalCartduedate;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "error")
    private Integer error;
    
    @Column(name = "title_delivered_date")
    private Timestamp titleDeliveredDate;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_title_id")
    private Integer orderTitleId;
    
    @Column(name = "retailer_profile_id")
    private Integer retailerProfileId;
    
    @Column(name = "order_xml")
    private String orderXml;
    
    @Column(name = "job_type")
    private String jobType;
    
    @Column(name = "note")
    private String note;
    
    @Column(name = "workflow_id")
    private Integer workflowId;
    
    @Column(name = "vendor_id")
    private Integer vendorId;
    
    @Column(name = "language_id")
    private Integer languageId;
    
    @Column(name = "project_manager_id")
    private Integer projectManagerId;
    
    @Column(name = "charge")
    private String charge;
    
    @Column(name = "workflow_definition_id")
    private Integer workflowDefinitionId;
    
    @Column(name = "vendor_project_manager")
    private Integer vendorProjectManager;
    
    @Column(name = "count_items")
    private Integer countItems;
    
    @Column(name = "vendorsite_id")
    private Integer vendorsiteId;
    
    @Column(name = "related_order_title_id")
    private Integer relatedOrderTitleId;
    
    @Column(name = "related_order_title_type")
    private String relatedOrderTitleType;
    
    @Column(name = "related_order_title_creator")
    private Integer relatedOrderTitleCreator;
    
    @Column(name = "order_title_start_time")
    private Timestamp orderTitleStartTime;
    
    @Column(name = "order_title_end_time")
    private Timestamp orderTitleEndTime;
    
    @Column(name = "version")
    private Integer version;
    
    @Column(name = "retailer_id")
    private Integer retailerId;
    
    @Column(name = "xytech_wo_no")
    private String xytechWoNo;
    
    @Column(name = "customer_contact_id")
    private Integer customerContactId;
    
    @Column(name = "order_title_name")
    private String orderTitleName;
    
    @Column(name = "order_title_type")
    private String orderTitleType;
    
    @Column(name = "ishigh_security")
    private Byte ishighSecurity;
    
    @Column(name = "isrush")
    private Byte isrush;
    
    @Column(name = "billing_amount")
    private BigDecimal billingAmount;
    
    @Column(name = "billing_type")
    private String billingType;
    
    @Column(name = "invoice_type")
    private String invoiceType;
    
    @Column(name = "nonbillable_reason_id")
    private Integer nonbillableReasonId;
    
    @Column(name = "billing_lock_status")
    private Byte billingLockStatus;
    
    @Column(name = "xytech_status")
    private String xytechStatus;
    
    @Column(name = "created_date")
    private Timestamp createdDate;
    
    @Column(name = "creator")
    private Integer creator;
    
    @Column(name = "update_date")
    private Timestamp updateDate;
    
    @Column(name = "updated_by")
    private Integer updatedBy;
    
    @Column(name = "payable_amount")
    private BigDecimal payableAmount;
    
    @Column(name = "net_amount")
    private BigDecimal netAmount;
    
    @Column(name = "isfullmanifest")
    private Byte isfullmanifest;
    
    @Column(name = "delta_id")
    private Integer deltaId;
    
    @Column(name = "istxgen")
    private Byte istxgen;
    
    @Column(name = "sequence_no")
    private Integer sequenceNo;
    
    @Column(name = "isredelivery")
    private Byte isredelivery;
    
    @Column(name = "title_id")
    private Integer titleId;
    
    @Column(name = "storage_estimate_red")
    private Integer storageEstimateRed;
    
    @Column(name = "storage_estimate_grey")
    private Integer storageEstimateGrey;
    
    @Column(name = "storage_estimate_tomcat")
    private Integer storageEstimateTomcat;
    
    @Column(name = "relatedcontent_id")
    private Integer relatedcontentId;
    
    @Column(name = "is_bonus")
    private Byte isBonus;


}
