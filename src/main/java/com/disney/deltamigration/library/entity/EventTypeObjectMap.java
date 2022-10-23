package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "event_type_object_map", schema = "dsop_db_live", catalog = "")
public class EventTypeObjectMap {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "event_type_id")
    private Integer eventTypeId;
    @Basic
    @Column(name = "object_type_id")
    private String objectTypeId;
    @Basic
    @Column(name = "sequence_no")
    private Integer sequenceNo;
    @Basic
    @Column(name = "default_scope")
    private String defaultScope;
    @ManyToOne
    @JoinColumn(name = "event_type_id", referencedColumnName = "id")
    private EventType eventTypeByEventTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public Object getDefaultScope() {
        return defaultScope;
    }

    public void setDefaultScope(String defaultScope) {
        this.defaultScope = defaultScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventTypeObjectMap that = (EventTypeObjectMap) o;
        return Objects.equals(id, that.id) && Objects.equals(eventTypeId, that.eventTypeId) && Objects.equals(objectTypeId, that.objectTypeId) && Objects.equals(sequenceNo, that.sequenceNo) && Objects.equals(defaultScope, that.defaultScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventTypeId, objectTypeId, sequenceNo, defaultScope);
    }

    public EventType getEventTypeByEventTypeId() {
        return eventTypeByEventTypeId;
    }

    public void setEventTypeByEventTypeId(EventType eventTypeByEventTypeId) {
        this.eventTypeByEventTypeId = eventTypeByEventTypeId;
    }
}
