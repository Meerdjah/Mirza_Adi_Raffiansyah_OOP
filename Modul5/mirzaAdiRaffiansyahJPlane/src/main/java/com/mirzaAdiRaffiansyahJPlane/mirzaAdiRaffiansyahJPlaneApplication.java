package com.mirzaAdiRaffiansyahJPlane;

import com.mirzaAdiRaffiansyahJPlane.service.AccountService;
import com.mirzaAdiRaffiansyahJPlane.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class mirzaAdiRaffiansyahJPlaneApplication {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private AccountService accountService;


    public static void main(String[] args) {
        SpringApplication.run(mirzaAdiRaffiansyahJPlaneApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer (){
        return args -> {
            List<Account> accounts = accountService.getAllUsers();
            System.out.println("All accounts:");
            accounts.forEach(account -> System.out.println(account));

            // ganti dengan account yang anda buat saat pre-cs
            Account account = accountService.topUpBalance(7L, "Meerdjah", "rawrOwO", 200000);
            // ganti buyerId menjadi id account yang anda buat, ganti juga 000 menjadi 3 digit terakhir NPM anda
            Ticket ticket = ticketService.bookTicket(7L, 7L, "KL323");
            System.out.println("Added ticket:");
            System.out.println(ticketService.getTicket(ticket.getId()));
            System.out.println("All ticket:");
            List<Ticket> tickets = ticketService.getAllTickets();
            tickets.forEach(x -> System.out.println(x));
            List<Account> updatedAccounts = accountService.getAllUsers();
            System.out.println("All accounts updated:");
            updatedAccounts.forEach(x -> System.out.println(x));
        };
    }

}
