package com.DSPMU.RegistrationManager.Repositories;

import com.DSPMU.RegistrationManager.Entities.Attendees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistartionsRepo extends JpaRepository<Attendees, Long> {
}
