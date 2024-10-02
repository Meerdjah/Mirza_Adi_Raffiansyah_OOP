package com.mirzaAdiRaffiansyahJPlane.service;

import java.util.*;

import com.mirzaAdiRaffiansyahJPlane.Account;
import com.mirzaAdiRaffiansyahJPlane.Plane;
import com.mirzaAdiRaffiansyahJPlane.Ticket;
import com.mirzaAdiRaffiansyahJPlane.repository.AccountRepository;
import com.mirzaAdiRaffiansyahJPlane.repository.PlaneRepository;
import com.mirzaAdiRaffiansyahJPlane.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.accessibility.AccessibleContext;


@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private PlaneRepository planeRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Ticket getTicket(long TicketID) {
        Ticket ticket = ticketRepository.findById(TicketID).orElseThrow( () -> new RuntimeException("Ticket not found"));

        return ticket;
    }

    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();

        return tickets;
    }

    public Ticket bookTicket(long buyerId, long planeId, String code) {
        Plane plane = planeRepository.findById(planeId).orElseThrow(() -> new
                RuntimeException("Plane not found"));;
        Account account = accountRepository.findById(buyerId).orElseThrow(() -> new
                RuntimeException("Account not found"));;

        Ticket ticket = new Ticket(account, plane, code);
    }
}
