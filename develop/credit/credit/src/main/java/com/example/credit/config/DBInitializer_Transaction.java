package com.example.credit.config;

import com.example.credit.model.Transaction;
import com.example.credit.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration // Indicates that this class contains Spring configuration
public class DBInitializer_Transaction {

    /*
     * Bean that initializes the database with sample users.
     */
    @Bean
    CommandLineRunner initDatabase(TransactionRepository transactionRepository) {
        return args -> {
            // Create a list of sample users
            /**var transactions = List.of(
                    new Transaction("Alice", "alice@example.com"),
                    new User("Bob", "bob@example.com"),
                    new User("Charlie", "charlie@example.com")
            );
            // Save all users to the database
            transactionRepository.saveAll(transactions);**/
        };
    }
}
