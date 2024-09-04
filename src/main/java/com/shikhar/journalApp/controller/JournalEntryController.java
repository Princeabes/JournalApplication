package com.shikhar.journalApp.controller;

import com.shikhar.journalApp.entity.JournalEntry;
import com.shikhar.journalApp.services.JournalEnteryServices;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    JournalEnteryServices journalEnteryServices;

    @PostMapping("/insert")
    public JournalEntry insertEntry( @RequestBody JournalEntry journalEntry){
        journalEntry.setDate(LocalDateTime.now());
        journalEnteryServices.saveEntry(journalEntry);
        return journalEntry;
    }

    @GetMapping("/getall")
    public List<JournalEntry> getAllEnteries(){
        return journalEnteryServices.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public JournalEntry getById(@PathVariable ObjectId id){
      return  journalEnteryServices.getById(id).orElse(null);
    }

    @DeleteMapping("/deletebyid/{id}")
    public boolean deleteJournalEntryById(@PathVariable ObjectId id){
        journalEnteryServices.deleteJournalEntryUsingId(id);
        return true ;
    }

    @PutMapping("/uid/{id}")
    public JournalEntry updateEntry(@PathVariable ObjectId id ,@RequestBody JournalEntry newEntry){
     JournalEntry oldjournalEntry = journalEnteryServices.getById(id).orElse(null);
     if (oldjournalEntry!=null){
         oldjournalEntry.setContent(!newEntry.getContent().equals("") && newEntry.getContent() !=null ? newEntry.getContent():oldjournalEntry.getContent());
         oldjournalEntry.setTitle(!newEntry.getTitle().equals("")&& newEntry.getTitle()!=null ?newEntry.getTitle():oldjournalEntry.getTitle());
     }
     journalEnteryServices.saveEntry(oldjournalEntry);
     return  oldjournalEntry;
    }




}
