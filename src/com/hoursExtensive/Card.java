package com.hoursExtensive;

public class Card {
    private String face;
    private String suit;

    public Card(String cardFace,String cardSuit){
        face=cardFace;
        suit=cardSuit;
    }

    @Override
    public String toString() {
        return face  +" of " + suit;
    }
}
