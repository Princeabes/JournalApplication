package com.prince.journalApp.repo;

import com.prince.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEnteryRepo  extends MongoRepository<JournalEntry, ObjectId> {
    //mongoRepo interface extend by journalentry repo interface such thst mongo repo contains all the
    //method provided by spring data mongodb  and these abstract methods implemented at run time by
    //spring
}
