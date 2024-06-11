package com.example.credit.config;

import com.example.credit.model.Statement;
import com.example.credit.repository.StatementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
public class DBInitializer_Statement {

    @Bean
    CommandLineRunner initDatabase(StatementRepository statementRepository) {
        return args -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            List<Statement> statements = List.of(
                    new Statement(1000.00, 500.00, 600.00, 0.00, 0.00, 10.00, 15.00, 1105.00, 5000.00, 3895.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(2000.00, 1500.00, 750.00, 0.00, 0.00, 15.00, 20.00, 1265.00, 10000.00, 8735.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(500.00, 100.00, 200.00, 0.00, 0.00, 5.00, 10.00, 605.00, 3000.00, 2395.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(1500.00, 1000.00, 350.00, 0.00, 0.00, 24.00, 25.00, 895.00, 7000.00, 6105.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(300.00, 0.00, 75.00, 0.00, 0.00, 5.00, 5.00, 85.00, 2000.00, 1915.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(802.00, 420.00, 214.00, 0.00, 0.00, 10.00, 10.00, 620.00, 4000.00, 3380.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(1210.00, 600.00, 400.00, 0.00, 1.00, 12.00, 15.00, 1015.00, 8000.00, 6985.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(409.40, 200.00, 100.00, 0.00, 0.00, 5.00, 5.00, 305.00, 3000.00, 2695.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(700.00, 350.00, 52.40, 0.00, 0.00, 10.00, 15.00, 755.00, 4000.00, 3245.00, dateFormat.parse("2024-06-01"), 30),
                    new Statement(2502.03, 1251.00, 1258.99, 1.24, 0.00, 25.00, 32.56, 2555.00, 12000.00, 9445.00, dateFormat.parse("2024-06-01"), 30)
            );

            statementRepository.saveAll(statements);
        };
    }
}
