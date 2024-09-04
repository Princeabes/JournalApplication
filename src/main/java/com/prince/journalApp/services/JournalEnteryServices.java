package com.prince.journalApp.services;

import com.prince.journalApp.entity.JournalEntry;
import com.prince.journalApp.repo.JournalEnteryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEnteryServices {

    @Autowired
    JournalEnteryRepo journalEnteryRepo;

    public  boolean saveEntry(JournalEntry journalEntry){

        journalEnteryRepo.save(journalEntry);
        return true;
    }

    public List<JournalEntry> getAll(){
     return  journalEnteryRepo.findAll();

    }
    public Optional<JournalEntry> getById(ObjectId objectId){
         return journalEnteryRepo.findById(objectId);
     }
     public  void  deleteJournalEntryUsingId(ObjectId id){
        journalEnteryRepo.deleteById(id);
     }





}
