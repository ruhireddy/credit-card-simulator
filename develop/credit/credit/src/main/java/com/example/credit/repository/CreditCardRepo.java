package com.example.credit.repository;

import com.example.credit.model.CreditCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditCardRepo extends MongoRepository<CreditCard, String> {

    CreditCard findByCardNumber(String cardNumber);

}
