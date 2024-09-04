package com.shikhar.journalApp.repo;

import com.shikhar.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEnteryRepo  extends MongoRepository<JournalEntry, ObjectId> {

}
