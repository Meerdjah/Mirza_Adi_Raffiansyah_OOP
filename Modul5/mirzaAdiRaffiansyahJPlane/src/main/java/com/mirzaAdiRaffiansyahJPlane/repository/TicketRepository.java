package com.mirzaAdiRaffiansyahJPlane.repository;

import com.mirzaAdiRaffiansyahJPlane.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findFirstByCode (String code);
}
