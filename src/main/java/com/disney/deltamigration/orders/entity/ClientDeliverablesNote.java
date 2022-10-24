package com.disney.deltamigration.orders.entity;

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
@Table(name = "client_deliverables_note")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClientDeliverablesNote {
    
    @Column(name = "client_deliverables")
    private Integer clientDeliverables;
    
    @Column(name = "note")
    private Integer note;
    
    @Column(name = "client_rejection")
    private Byte clientRejection;

}
