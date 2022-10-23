package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_note", schema = "dsop_db_live", catalog = "")
public class ProductNote {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_note_id")
    private Integer productNoteId;
    @Basic
    @Column(name = "product_id")
    private Integer productId;
    @Basic
    @Column(name = "note_id")
    private Integer noteId;

    public Integer getProductNoteId() {
        return productNoteId;
    }

    public void setProductNoteId(Integer productNoteId) {
        this.productNoteId = productNoteId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductNote that = (ProductNote) o;
        return Objects.equals(productNoteId, that.productNoteId) && Objects.equals(productId, that.productId) && Objects.equals(noteId, that.noteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNoteId, productId, noteId);
    }
}
