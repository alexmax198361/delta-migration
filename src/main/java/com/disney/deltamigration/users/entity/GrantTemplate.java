package com.disney.delta.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "grant_template", schema = "dsop_db_live", catalog = "")
public class GrantTemplate {
    @Basic
    @Column(name = "grant", nullable = true)
    private Integer grant;
    @Basic
    @Column(name = "template", nullable = true)
    private Integer template;

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }

    public Integer getTemplate() {
        return template;
    }

    public void setTemplate(Integer template) {
        this.template = template;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrantTemplate that = (GrantTemplate) o;
        return Objects.equals(grant, that.grant) && Objects.equals(template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grant, template);
    }
}
