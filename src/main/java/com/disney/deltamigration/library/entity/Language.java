package com.disney.deltamigration.library.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Language {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "disney_code")
    private String disneyCode;
    @Basic
    @Column(name = "language")
    private String language;
    @Basic
    @Column(name = "locale")
    private String locale;
    @Basic
    @Column(name = "storm_language_id")
    private Integer stormLanguageId;
    @Basic
    @Column(name = "storm_code")
    private String stormCode;
    @Basic
    @Column(name = "metadata_valid")
    private Byte metadataValid;
    @Basic
    @Column(name = "trailer_valid")
    private Byte trailerValid;
    @Basic
    @Column(name = "artwork_valid")
    private Byte artworkValid;
    @Basic
    @Column(name = "priority")
    private Byte priority;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "simple_name")
    private String simpleName;
    @Basic
    @Column(name = "dubcard_valid")
    private Byte dubcardValid;
    @Basic
    @Column(name = "lts_lang_id")
    private Integer ltsLangId;
    @Basic
    @Column(name = "lts_lang_name")
    private String ltsLangName;
    @Basic
    @Column(name = "audio_valid")
    private Byte audioValid;
    @Basic
    @Column(name = "timedtext_valid")
    private Byte timedtextValid;
    @Basic
    @Column(name = "timedtext_cctt_valid")
    private Byte timedtextCcttValid;
    @Basic
    @Column(name = "isactive")
    private Byte isactive;
    @Basic
    @Column(name = "lir_valid")
    private Byte lirValid;
    @Basic
    @Column(name = "bolt_lang_code")
    private String boltLangCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisneyCode() {
        return disneyCode;
    }

    public void setDisneyCode(String disneyCode) {
        this.disneyCode = disneyCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getStormLanguageId() {
        return stormLanguageId;
    }

    public void setStormLanguageId(Integer stormLanguageId) {
        this.stormLanguageId = stormLanguageId;
    }

    public String getStormCode() {
        return stormCode;
    }

    public void setStormCode(String stormCode) {
        this.stormCode = stormCode;
    }

    public Byte getMetadataValid() {
        return metadataValid;
    }

    public void setMetadataValid(Byte metadataValid) {
        this.metadataValid = metadataValid;
    }

    public Byte getTrailerValid() {
        return trailerValid;
    }

    public void setTrailerValid(Byte trailerValid) {
        this.trailerValid = trailerValid;
    }

    public Byte getArtworkValid() {
        return artworkValid;
    }

    public void setArtworkValid(Byte artworkValid) {
        this.artworkValid = artworkValid;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public Byte getDubcardValid() {
        return dubcardValid;
    }

    public void setDubcardValid(Byte dubcardValid) {
        this.dubcardValid = dubcardValid;
    }

    public Integer getLtsLangId() {
        return ltsLangId;
    }

    public void setLtsLangId(Integer ltsLangId) {
        this.ltsLangId = ltsLangId;
    }

    public String getLtsLangName() {
        return ltsLangName;
    }

    public void setLtsLangName(String ltsLangName) {
        this.ltsLangName = ltsLangName;
    }

    public Byte getAudioValid() {
        return audioValid;
    }

    public void setAudioValid(Byte audioValid) {
        this.audioValid = audioValid;
    }

    public Byte getTimedtextValid() {
        return timedtextValid;
    }

    public void setTimedtextValid(Byte timedtextValid) {
        this.timedtextValid = timedtextValid;
    }

    public Byte getTimedtextCcttValid() {
        return timedtextCcttValid;
    }

    public void setTimedtextCcttValid(Byte timedtextCcttValid) {
        this.timedtextCcttValid = timedtextCcttValid;
    }

    public Byte getIsactive() {
        return isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public Byte getLirValid() {
        return lirValid;
    }

    public void setLirValid(Byte lirValid) {
        this.lirValid = lirValid;
    }

    public String getBoltLangCode() {
        return boltLangCode;
    }

    public void setBoltLangCode(String boltLangCode) {
        this.boltLangCode = boltLangCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language1 = (Language) o;
        return Objects.equals(id, language1.id) && Objects.equals(name, language1.name) && Objects.equals(disneyCode, language1.disneyCode) && Objects.equals(language, language1.language) && Objects.equals(locale, language1.locale) && Objects.equals(stormLanguageId, language1.stormLanguageId) && Objects.equals(stormCode, language1.stormCode) && Objects.equals(metadataValid, language1.metadataValid) && Objects.equals(trailerValid, language1.trailerValid) && Objects.equals(artworkValid, language1.artworkValid) && Objects.equals(priority, language1.priority) && Objects.equals(note, language1.note) && Objects.equals(simpleName, language1.simpleName) && Objects.equals(dubcardValid, language1.dubcardValid) && Objects.equals(ltsLangId, language1.ltsLangId) && Objects.equals(ltsLangName, language1.ltsLangName) && Objects.equals(audioValid, language1.audioValid) && Objects.equals(timedtextValid, language1.timedtextValid) && Objects.equals(timedtextCcttValid, language1.timedtextCcttValid) && Objects.equals(isactive, language1.isactive) && Objects.equals(lirValid, language1.lirValid) && Objects.equals(boltLangCode, language1.boltLangCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, disneyCode, language, locale, stormLanguageId, stormCode, metadataValid, trailerValid, artworkValid, priority, note, simpleName, dubcardValid, ltsLangId, ltsLangName, audioValid, timedtextValid, timedtextCcttValid, isactive, lirValid, boltLangCode);
    }
}
