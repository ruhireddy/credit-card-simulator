package com.example.credit.repository;

import com.example.credit.model.Statement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatementRepo extends MongoRepository<Statement, String> {

}
