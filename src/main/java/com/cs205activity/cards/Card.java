package com.cs205activity.cards;

public class Card {

    private Suit suit;
    private FaceValue value;

    private Card() {
    }

    public Card(Suit suit, FaceValue faceValue){
        this.suit = suit;
        this.value = faceValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public FaceValue getValue() {
        return this.value;
    }


    public int compareTo(Card card) {

        if (this.getSuit().ordinal() > card.getSuit().ordinal()) {
            return 1;
        } else if (this.getSuit().ordinal() < card.getSuit().ordinal()) {
            return -1;
        } else {

            if (this.suit == Suit.HEARTS || this.suit == Suit.CLUBS) {

                // ascending sort
                if (this.getValue().ordinal() > card.getValue().ordinal()) {
                    return 1;
                } else if (this.getValue().ordinal() < card.getValue().ordinal()) {
                    return -1;
                } else {
                    return 0;
                }

            } else {

                // descending sort
                if (this.getValue().ordinal() < card.getValue().ordinal()) {
                    return 1;
                } else if (this.getValue().ordinal() > card.getValue().ordinal()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        }
    }

    @Override
    public int hashCode() {
        int result = suit != null ? suit.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Card card = (Card) o;

        if (suit != card.suit)
            return false;
        return value == card.value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Card{");
        sb.append("suit=").append(suit);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
