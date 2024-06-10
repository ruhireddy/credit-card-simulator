package com.example.credit.config;

import com.example.credit.model.Statement;
import com.example.credit.repository.StatementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration // Indicates that this class contains Spring configuration
public class DBInitializer_Statement {

    /*
     * Bean that initializes the database with sample users.
     */
    @Bean
    CommandLineRunner initDatabase(StatementRepository statementRepository) {
        return args -> {
            // Create a list of sample users
            /**var statements = List.of(
                    new Statement("Alice", "alice@example.com"),
                    new User("Bob", "bob@example.com"),
                    new User("Charlie", "charlie@example.com")
            );
            // Save all users to the database
            statementRepository.saveAll(statements);**/
        };
    }
}
