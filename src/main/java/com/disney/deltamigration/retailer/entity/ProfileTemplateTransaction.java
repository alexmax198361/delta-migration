package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "profile_template_transaction", catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProfileTemplateTransaction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "profile_template_transaction_id", nullable = false)
    private int profileTemplateTransactionId;
 
    @Column(name = "transaction_name", nullable = true, length = 100)
    private String transactionName;
 
    @Column(name = "transaction_xml_message", nullable = true)
    private byte[] transactionXmlMessage;
 
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
 
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;
 
    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;
 
    @Column(name = "updated_on", nullable = true)
    private Timestamp updatedOn;

    public int getProfileTemplateTransactionId() {
        return profileTemplateTransactionId;
    }

    public void setProfileTemplateTransactionId(int profileTemplateTransactionId) {
        this.profileTemplateTransactionId = profileTemplateTransactionId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public byte[] getTransactionXmlMessage() {
        return transactionXmlMessage;
    }

    public void setTransactionXmlMessage(byte[] transactionXmlMessage) {
        this.transactionXmlMessage = transactionXmlMessage;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileTemplateTransaction that = (ProfileTemplateTransaction) o;
        return profileTemplateTransactionId == that.profileTemplateTransactionId && Objects.equals(transactionName, that.transactionName) && Arrays.equals(transactionXmlMessage, that.transactionXmlMessage) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(createdOn, that.createdOn) && Objects.equals(updatedOn, that.updatedOn);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(profileTemplateTransactionId, transactionName, createdBy, updatedBy, createdOn, updatedOn);
        result = 31 * result + Arrays.hashCode(transactionXmlMessage);
        return result;
    }
}
