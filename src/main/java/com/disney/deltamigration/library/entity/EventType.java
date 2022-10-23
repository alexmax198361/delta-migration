package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "event_type", schema = "dsop_db_live", catalog = "")
public class EventType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "note_text_template")
    private String noteTextTemplate;
    @OneToMany(mappedBy = "eventTypeByEventTypeId")
    private Collection<EventTypeObjectMap> eventTypeObjectMapsById;
    @OneToMany(mappedBy = "eventTypeByEventTypeId")
    private Collection<Note> notesById;
    @OneToMany(mappedBy = "eventTypeByEventTypeId")
    private Collection<UserEventSubscriptions> userEventSubscriptionsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNoteTextTemplate() {
        return noteTextTemplate;
    }

    public void setNoteTextTemplate(String noteTextTemplate) {
        this.noteTextTemplate = noteTextTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventType eventType = (EventType) o;
        return Objects.equals(id, eventType.id) && Objects.equals(type, eventType.type) && Objects.equals(noteTextTemplate, eventType.noteTextTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, noteTextTemplate);
    }

    public Collection<EventTypeObjectMap> getEventTypeObjectMapsById() {
        return eventTypeObjectMapsById;
    }

    public void setEventTypeObjectMapsById(Collection<EventTypeObjectMap> eventTypeObjectMapsById) {
        this.eventTypeObjectMapsById = eventTypeObjectMapsById;
    }

    public Collection<Note> getNotesById() {
        return notesById;
    }

    public void setNotesById(Collection<Note> notesById) {
        this.notesById = notesById;
    }

    public Collection<UserEventSubscriptions> getUserEventSubscriptionsById() {
        return userEventSubscriptionsById;
    }

    public void setUserEventSubscriptionsById(Collection<UserEventSubscriptions> userEventSubscriptionsById) {
        this.userEventSubscriptionsById = userEventSubscriptionsById;
    }
}
