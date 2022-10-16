package com.disney.delta.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "grant_user", schema = "dsop_db_live", catalog = "")
public class GrantUser {
    @Basic
    @Column(name = "grant", nullable = true)
    private Integer grant;
    @Basic
    @Column(name = "user", nullable = true)
    private Integer user;

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrantUser grantUser = (GrantUser) o;
        return Objects.equals(grant, grantUser.grant) && Objects.equals(user, grantUser.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grant, user);
    }
}
