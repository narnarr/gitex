package com.example.gitex.card;

import com.example.gitex.user.User;

public class Card {
    private String cardCompany;
    private String cardNumber;
    private User owner;

    public Card(String cardCompany, String cardNumber, User owner) {
        this.cardCompany = cardCompany;
        this.cardNumber = cardNumber;
        this.owner = owner;
    }
}