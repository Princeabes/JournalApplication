package com.shikhar.journalApp.entity;

import org.bson.types.ObjectId;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "myJournalEntryAppliction")
public class JournalEntry {

    @Id
    private ObjectId id;

    private String title;
    private String content;
    private LocalDateTime date;

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public ObjectId getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

}