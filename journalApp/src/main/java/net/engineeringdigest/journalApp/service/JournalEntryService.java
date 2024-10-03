package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    public JournalEntryRepository journalEntryRepository;

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }
    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
//    public void updateById(ObjectId id, JournalEntry journalEntry){
//        journalEntryRepository.save(id,journalEntry);
//    }
}
