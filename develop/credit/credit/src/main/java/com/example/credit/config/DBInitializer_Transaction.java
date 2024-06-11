package com.example.credit.config;

import com.example.credit.model.Transaction;
import com.example.credit.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBInitializer_Transaction {

    @Bean
    CommandLineRunner initDatabase(TransactionRepository transactionRepository) {
        return args -> {
            List<Transaction> transactions = List.of(
                    new Transaction("John Dole", "1111222233334444", "1", "2024-06-01 10:00:00", 150.00, "Walmart", "Walmart", "Completed", "USD"),
                    new Transaction("Ronald Jones", "2222333344445555", "2", "2024-06-02 12:30:00", 250.00, "Amazon", "Amazon", "Completed", "EUR"),
                    new Transaction("Daisy Bush", "3333444455556666", "3", "2024-06-03 14:45:00", 50.00, "Starbucks", "Starbucks", "Completed", "USD"),
                    new Transaction("Rose Waters", "4444555566667777", "4", "2024-06-04 09:15:00", 300.00, "Best Buy", "Best Buy", "Completed", "USD"),
                    new Transaction("Penelope Downs", ""5555666677778888", "5", "2024-06-05 11:00:00", 75.00, "Target", "Target", "Completed", "USD"),
                   );
            
            transactionRepository.saveAll(transactions);
        };
    }
}
