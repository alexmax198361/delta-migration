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
@Table(name = "group_user")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GroupUser {

    @Column(name = "group", nullable = false)
    private int group;
    @Column(name = "user", nullable = true)
    private Integer user;
    @Column(name = "isprimary", nullable = true)
    private Byte isprimary;
    @Column(name = "contact_id", nullable = true)
    private Integer contactId;

    //TODO: вставить таблицы contact

}
