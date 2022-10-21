package com.disney.deltamigration.users.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "grant_template")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GrantTemplate {

    @Column(name = "grant", nullable = true)
    private Integer grant;

    @Column(name = "template", nullable = true)
    private Integer template;


}
