package com.hoursExtensive;

import java.util.Random;

public class DeckofCards {
    private Card deck[];
    private int currentCard;
    private final int NUMBER_OF_CARDS=52;
    private Random randomNumbers;

    public DeckofCards(){
        String faces[]={"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Queen","Jack","King"};
        String suits[]={"Diamonds","Spades","Hearts","Clubs"};

        deck=new Card[NUMBER_OF_CARDS];
        currentCard=0;
        randomNumbers=new Random();

        for(int count=0;count<deck.length;count++){
            deck[count]=new Card(faces[count % 13],suits[count / 13]);
        }
    }
    public void shuffleDeck(){
        currentCard=0;
        for(int first=0;first<deck.length;first++){
            int second=randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else{
            return null;
        }
    }
//    shuffle card test
    public static void main(String[] args){
        DeckofCards obj=new DeckofCards();
        obj.shuffleDeck();

        for(int i=0;i<13;i++){
            System.out.printf("%-20s%-20s%-20s%-20s\n",obj.dealCard(),obj.dealCard(),obj.dealCard(),obj.dealCard());
        }
    }
}
