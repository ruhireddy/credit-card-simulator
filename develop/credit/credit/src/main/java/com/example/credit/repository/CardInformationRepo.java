package com.example.credit.repository;

import com.example.credit.model.CardInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardInformationRepo extends MongoRepository<CardInformation, String> {
    CardInformation findByCardNumber(String cardNumber);
}
