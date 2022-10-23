package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "parent_id")
    private Integer parentId;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "notedate")
    private Timestamp notedate;
    @Basic
    @Column(name = "contents")
    private String contents;
    @Basic
    @Column(name = "attachment")
    private String attachment;
    @Basic
    @Column(name = "link")
    private String link;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "isresolution")
    private Byte isresolution;
    @Basic
    @Column(name = "resolved_date")
    private Timestamp resolvedDate;
    @Basic
    @Column(name = "assigned_to_userid")
    private Integer assignedToUserid;
    @Basic
    @Column(name = "update_date")
    private Timestamp updateDate;
    @Basic
    @Column(name = "event_type_id")
    private Integer eventTypeId;
    @Basic
    @Column(name = "newsfeed_status")
    private String newsfeedStatus;
    @Basic
    @Column(name = "newsfeed_process_date")
    private Timestamp newsfeedProcessDate;
    @Basic
    @Column(name = "follower_status")
    private String followerStatus;
    @Basic
    @Column(name = "follower_process_date")
    private Timestamp followerProcessDate;
    @ManyToOne
    @JoinColumn(name = "event_type_id", referencedColumnName = "id")
    private EventType eventTypeByEventTypeId;
    @OneToMany(mappedBy = "noteByNoteId")
    private Collection<NoteContext> noteContextsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Object getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Timestamp getNotedate() {
        return notedate;
    }

    public void setNotedate(Timestamp notedate) {
        this.notedate = notedate;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Byte getIsresolution() {
        return isresolution;
    }

    public void setIsresolution(Byte isresolution) {
        this.isresolution = isresolution;
    }

    public Timestamp getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Timestamp resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public Integer getAssignedToUserid() {
        return assignedToUserid;
    }

    public void setAssignedToUserid(Integer assignedToUserid) {
        this.assignedToUserid = assignedToUserid;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Object getNewsfeedStatus() {
        return newsfeedStatus;
    }

    public void setNewsfeedStatus(String newsfeedStatus) {
        this.newsfeedStatus = newsfeedStatus;
    }

    public Timestamp getNewsfeedProcessDate() {
        return newsfeedProcessDate;
    }

    public void setNewsfeedProcessDate(Timestamp newsfeedProcessDate) {
        this.newsfeedProcessDate = newsfeedProcessDate;
    }

    public Object getFollowerStatus() {
        return followerStatus;
    }

    public void setFollowerStatus(String followerStatus) {
        this.followerStatus = followerStatus;
    }

    public Timestamp getFollowerProcessDate() {
        return followerProcessDate;
    }

    public void setFollowerProcessDate(Timestamp followerProcessDate) {
        this.followerProcessDate = followerProcessDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id) && Objects.equals(parentId, note.parentId) && Objects.equals(type, note.type) && Objects.equals(userId, note.userId) && Objects.equals(notedate, note.notedate) && Objects.equals(contents, note.contents) && Objects.equals(attachment, note.attachment) && Objects.equals(link, note.link) && Objects.equals(status, note.status) && Objects.equals(isresolution, note.isresolution) && Objects.equals(resolvedDate, note.resolvedDate) && Objects.equals(assignedToUserid, note.assignedToUserid) && Objects.equals(updateDate, note.updateDate) && Objects.equals(eventTypeId, note.eventTypeId) && Objects.equals(newsfeedStatus, note.newsfeedStatus) && Objects.equals(newsfeedProcessDate, note.newsfeedProcessDate) && Objects.equals(followerStatus, note.followerStatus) && Objects.equals(followerProcessDate, note.followerProcessDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, type, userId, notedate, contents, attachment, link, status, isresolution, resolvedDate, assignedToUserid, updateDate, eventTypeId, newsfeedStatus, newsfeedProcessDate, followerStatus, followerProcessDate);
    }

    public EventType getEventTypeByEventTypeId() {
        return eventTypeByEventTypeId;
    }

    public void setEventTypeByEventTypeId(EventType eventTypeByEventTypeId) {
        this.eventTypeByEventTypeId = eventTypeByEventTypeId;
    }

    public Collection<NoteContext> getNoteContextsById() {
        return noteContextsById;
    }

    public void setNoteContextsById(Collection<NoteContext> noteContextsById) {
        this.noteContextsById = noteContextsById;
    }
}
