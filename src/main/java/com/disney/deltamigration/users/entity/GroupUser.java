package com.disney.delta.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "group_user", schema = "dsop_db_live", catalog = "")
public class GroupUser {
    @Basic
    @Column(name = "group", nullable = false)
    private int group;
    @Basic
    @Column(name = "user", nullable = true)
    private Integer user;
    @Basic
    @Column(name = "isprimary", nullable = true)
    private Byte isprimary;
    @Basic
    @Column(name = "contact_id", nullable = true)
    private Integer contactId;

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Byte getIsprimary() {
        return isprimary;
    }

    public void setIsprimary(Byte isprimary) {
        this.isprimary = isprimary;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupUser groupUser = (GroupUser) o;
        return group == groupUser.group && Objects.equals(user, groupUser.user) && Objects.equals(isprimary, groupUser.isprimary) && Objects.equals(contactId, groupUser.contactId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, user, isprimary, contactId);
    }
}
