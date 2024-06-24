package com.example.credit.controller;

import com.example.credit.model.CardInformation;
import com.example.credit.repository.CardInformationRepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CardInformationController {
    CardInformationRepo cardInformationRepo;

    public CardInformationController(CardInformationRepo cardInformationRepo) {
        this.cardInformationRepo = cardInformationRepo;
    }


    @GetMapping("/all-cards")
    public @ResponseBody List<CardInformation> getAllCards() {
        return cardInformationRepo.findAll();
    }

    @GetMapping("/api/card/{cardNumber}")
    public @ResponseBody CardInformation getCardInformation(@PathVariable String cardNumber) {
        return cardInformationRepo.findByCardNumber(cardNumber);
    }
}
