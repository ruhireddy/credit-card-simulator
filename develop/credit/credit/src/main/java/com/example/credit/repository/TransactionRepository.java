package com.example.credit.repository;

import com.example.credit.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * UserRepository is a Spring Data repository interface for performing CRUD operations on User entities.
 * It extends JpaRepository which provides JPA related methods for accessing and manipulating data in the database.
 * JpaRepository<User, Long> specifies that the repository is for User entities with primary keys of type Long.
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}