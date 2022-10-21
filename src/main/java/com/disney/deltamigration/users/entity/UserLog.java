package com.disney.deltamigration.users.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "login", nullable = true, length = 255)
    private String login;
    @Basic
    @Column(name = "date_time", nullable = true)
    private Timestamp dateTime;
    @Basic
    @Column(name = "success", nullable = true)
    private Byte success;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Byte getSuccess() {
        return success;
    }

    public void setSuccess(Byte success) {
        this.success = success;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLog userLog = (UserLog) o;
        return id == userLog.id && Objects.equals(login, userLog.login) && Objects.equals(dateTime, userLog.dateTime) && Objects.equals(success, userLog.success) && Objects.equals(userId, userLog.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, dateTime, success, userId);
    }
}
