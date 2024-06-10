package com.example.credit.config;

import com.example.credit.model.CreditCard;
import com.example.credit.repository.CreditCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration // Indicates that this class contains Spring configuration
public class DBInitializer_User {

    /*
     * Bean that initializes the database with sample users.
     */
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            // Create a list of sample users
            /**var creditCards = List.of(
                    new CreditCard("Alice", "alice@example.com"),
                    new User("Bob", "bob@example.com"),
                    new User("Charlie", "charlie@example.com")
            );
            // Save all users to the database
            userRepository.saveAll(users);**/
        };
    }
}
