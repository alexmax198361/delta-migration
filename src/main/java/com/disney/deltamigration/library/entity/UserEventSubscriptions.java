package com.disney.deltamigration.library.entity;

import com.disney.deltamigration.users.entity.User;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_event_subscriptions", schema = "dsop_db_live", catalog = "")
public class UserEventSubscriptions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "event_type_id")
    private Integer eventTypeId;
    @Basic
    @Column(name = "object_type_id")
    private String objectTypeId;
    @Basic
    @Column(name = "object_id")
    private String objectId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User usersByUserId;
    @ManyToOne
    @JoinColumn(name = "event_type_id", referencedColumnName = "id")
    private EventType eventTypeByEventTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(String objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEventSubscriptions that = (UserEventSubscriptions) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(eventTypeId, that.eventTypeId) && Objects.equals(objectTypeId, that.objectTypeId) && Objects.equals(objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, eventTypeId, objectTypeId, objectId);
    }

    public User getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(User usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    public EventType getEventTypeByEventTypeId() {
        return eventTypeByEventTypeId;
    }

    public void setEventTypeByEventTypeId(EventType eventTypeByEventTypeId) {
        this.eventTypeByEventTypeId = eventTypeByEventTypeId;
    }
}
