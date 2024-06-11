package com.example.credit.config;

import com.example.credit.model.Statement;
import com.example.credit.repository.StatementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBInitializer_Statement {

    @Bean
    CommandLineRunner initDatabase(StatementRepository statementRepository) {
        return args -> {
            List<Statement> statements = List.of(
                    new Statement(1000.00, "2024-06-01", 1),
                    new Statement(200.00, "2024-10-02", 2),
                    new Statement(450.00, "2024-09-04", 3),
                    new Statement(20.00, "2024-30-12", 4),
            statementRepository.saveAll(statements);
        };
    }
}
