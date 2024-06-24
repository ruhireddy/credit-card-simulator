package com.example.credit.repository;

import com.example.credit.model.AccountHolder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountHolderRepo extends MongoRepository<AccountHolder, String> {
    AccountHolder findByPhoneNumber(String phoneNumber);
}
