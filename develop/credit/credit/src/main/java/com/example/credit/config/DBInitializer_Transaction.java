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
            // Create a list of sample transactions
            var transactions = List.of(
                    new Transaction(1, 1, "2024-06-01 10:00:00", 150.00, "Walmart", "Walmart", "Completed", "USD"),
                    new Transaction(2, 2, "2024-06-02 12:30:00", 250.00, "Amazon", "Amazon", "Completed", "EUR"),
                    new Transaction(3, 3, "2024-06-03 14:45:00", 50.00, "Starbucks", "Starbucks", "Completed", "USD"),
                    new Transaction(4, 4, "2024-06-04 09:15:00", 300.00, "Best Buy", "Best Buy", "Completed", "USD"),
                    new Transaction(5, 5, "2024-06-05 11:00:00", 75.00, "Target", "Target", "Completed", "USD"),
                    new Transaction(6, 6, "2024-06-06 16:30:00", 200.00, "Barnes & Noble", "Barnes & Noble",
                            "Completed", "USD"),
                    new Transaction(7, 7, "2024-06-07 13:45:00", 400.00, "Apple Store", "Apple Store", "Completed",
                            "USD"),
                    new Transaction(8, 8, "2024-06-08 17:00:00", 100.00, "Costco", "Costco", "Completed", "USD"),
                    new Transaction(9, 9, "2024-06-09 15:15:00", 50.00, "Uber", "Uber", "Completed", "EUR"),
                    new Transaction(10, 10, "2024-06-10 18:30:00", 250.00, "Home Depot", "Home Depot", "Completed",
                            "USD"));

            // Save all transactions to the database
            transactionRepository.saveAll(transactions);
        };
    }
}
