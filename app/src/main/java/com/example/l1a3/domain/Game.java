package com.example.l1a3.domain;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Handler;

public class Game<CardContent> {
    Random random = new Random();
    private final List<Card<CardContent>> cards = new ArrayList<>();


    public Game(List<CardContent> cardContents) {// 2 , 3 , 4
        for (int i = 0; i < cardContents.size(); i++) {
            cards.add(new Card<>(i + 1, false, false, cardContents.get(i)));
            cards.add(new Card<>((i + 1) * 2, false, false, cardContents.get(i)));
        }
        Collections.shuffle(cards);
    }

    public void CardClick(Card<CardContent> currentCard) {
        currentCard.setFaceUp(!currentCard.isFaceUp());

        for (Card<CardContent> anotherCard : cards) {
            if (currentCard.isFaceUp() && anotherCard.isFaceUp()) {
                if (currentCard.getContent().equals(anotherCard.getContent())
                        && currentCard.getId() != anotherCard.getId()) {
                    currentCard.setMatch(true);
                    anotherCard.setMatch(true);
                    Log.d("tag", "MATCH!");
                } else if (!currentCard.equals(anotherCard)) {

                    currentCard.setFaceUp(false);
                    anotherCard.setFaceUp(false);
                    Log.d("tag", "NOT MATCH!");
                }
            }
        }
        remove();

    }

    private void remove() {
        List<Card<CardContent>> resultCards = new ArrayList<>(cards);
        for (Card<CardContent> c : cards) {
            if (c.isMatch()) {
                resultCards.remove(c);
            }
        }
        cards.clear();
        cards.addAll(resultCards);
    }

    public List<Card<CardContent>> getCards() {
        return cards;
    }
}
