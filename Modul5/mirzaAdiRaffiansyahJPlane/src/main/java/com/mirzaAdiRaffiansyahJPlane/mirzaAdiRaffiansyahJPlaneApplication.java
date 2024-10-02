package com.mirzaAdiRaffiansyahJPlane;

import com.mirzaAdiRaffiansyahJPlane.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class mirzaAdiRaffiansyahJPlaneApplication {

    @Autowired
    private AccountService accountService;


    public static void main(String[] args) {
        SpringApplication.run(mirzaAdiRaffiansyahJPlaneApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer (){
        return args -> {
            accountService.registerAccount("Meerdjah", "rawrOwO"); //ganti username dengan nama kalian dan password nya bebas (jangan password asli yaa)
            List<Account> accounts = accountService.getAllUsers();
            accounts.forEach(account -> System.out.println(account));
        };
    }
}
