package com.example.l1a3.domain;

public class Card<CardContent> {
    private int id;
    private boolean isMatch;
    private boolean isFaceUp;
    private CardContent content;

    public Card(int id, boolean isMatch, boolean isFaceUp, CardContent content) {
        this.id = id;
        this.isMatch = isMatch;
        this.isFaceUp = isFaceUp;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public CardContent getContent() {
        return content;
    }

    public void setContent(CardContent content) {
        this.content = content;
    }
}