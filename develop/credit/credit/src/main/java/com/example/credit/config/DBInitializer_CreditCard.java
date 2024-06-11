package com.example.credit.config;

import com.example.credit.model.CreditCard;
import com.example.credit.repository.CreditCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration 
public class DBInitializer_CreditCard {

    @Bean
    CommandLineRunner initDatabase(CreditCardRepository creditCardRepository) {
        return args -> {
            List<CreditCard> creditCards = List.of(
                    new CreditCard(1, "Joe Dole", "1111222233334444", "Gold", "123",  "123 Green St.", "33423", "Active"),
                    new CreditCard(2, "Ronald Jones", "2222333344445555", "Platinum", "234", "234 Rainbow Rd.", "23523", "Active"),
                    new CreditCard(3, "Daisy Bush", "3333444455556666", "Silver", "345", "Paused", "904 Congress Ave.", "45927"),
                    new CreditCard(4, "Rose Waters", "4444555566667777", "Gold", "456", "Active", "405 Park Ave.", "12264"),
                    new CreditCard(5, "Penelope Downs", "5555666677778888", "Bronze", "567", "2003 Atlantic Ave.", "92735", "Canceled"));
                    /**new CreditCard(6, "Grant Peters", "6666777788889999", "Silver", "678", "Active"),
                    new CreditCard(7, "", "7777888899990000", "Platinum", "789", "Paused"),
                    new CreditCard(8, 8, "8888999900001111", "Gold", "890", "Active"),
                    new CreditCard(9, 9, "9999000011112222", "Bronze", "901", "Active"),
                    new CreditCard(10, 10, "0000111122223333", "Silver", "012", "Canceled"));**/

            creditCardRepository.saveAll(creditCards);
        };
    }
}
