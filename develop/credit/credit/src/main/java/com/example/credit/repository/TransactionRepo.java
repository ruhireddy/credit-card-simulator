package com.example.credit.repository;

import com.example.credit.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepo extends MongoRepository<Transaction, String> {

}
