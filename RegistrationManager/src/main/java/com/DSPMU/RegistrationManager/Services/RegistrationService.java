package com.DSPMU.RegistrationManager.Services;

import com.DSPMU.RegistrationManager.Entities.Attendees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DSPMU.RegistrationManager.Repositories.RegistartionsRepo;

import java.util.List;

@Service
public class RegistrationService {

   @Autowired
   private RegistartionsRepo repo;

   public void saveAttendee(Attendees ad){
       repo.save(ad);
   }

   public List<Attendees> getAllEntries(){
       return repo.findAll();
    }
}
