package com.cs205activity.cards;

public class DeckDriver {

    public static void main(String[] args) {
        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        System.out.println("Shuffled: ");
        displayDeck(cards);

        System.out.println("\nTop card dealt:");
        System.out.println(cards.deal());

        System.out.println("\nCurrent deck state: ");
        displayDeck(cards);

        System.out.println("\nTop card displayed: ");
        System.out.println(cards.turnover());

        System.out.println("\nCurrent deck state: ");
        displayDeck(cards);

        System.out.println("\nCurrent deck state: ");
        displayDeck(cards);
    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}
