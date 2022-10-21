package com.disney.deltamigration.users.entity;

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
@Table(name = "grant_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrantUser {

    @Column(name = "grant", nullable = true)
    private Integer grant;
    
    @Column(name = "user", nullable = true)
    private Integer user;


}
