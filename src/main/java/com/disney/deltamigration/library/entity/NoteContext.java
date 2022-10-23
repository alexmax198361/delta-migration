package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "note_context", schema = "dsop_db_live", catalog = "")
public class NoteContext {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "note_id")
    private Integer noteId;
    @Basic
    @Column(name = "object_type_id")
    private String objectTypeId;
    @Basic
    @Column(name = "object_id")
    private String objectId;
    @ManyToOne
    @JoinColumn(name = "note_id", referencedColumnName = "id")
    private Note noteByNoteId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
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
        NoteContext that = (NoteContext) o;
        return Objects.equals(id, that.id) && Objects.equals(noteId, that.noteId) && Objects.equals(objectTypeId, that.objectTypeId) && Objects.equals(objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, noteId, objectTypeId, objectId);
    }

    public Note getNoteByNoteId() {
        return noteByNoteId;
    }

    public void setNoteByNoteId(Note noteByNoteId) {
        this.noteByNoteId = noteByNoteId;
    }
}
