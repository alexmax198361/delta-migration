package com.disney.deltamigration.retailer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "retailer_profile_workflowdefinition",catalog = "")
public class RetailerProfileWorkflowdefinition {

    @Column(name = "retailer_profile", nullable = true)
    private Integer retailerProfile;

    @Column(name = "workflowdefinition", nullable = true)
    private Integer workflowdefinition;

    @Column(name = "isdefault", nullable = true)
    private Boolean isdefault;


}
