package com.example.l1a3.presentation;

import com.example.l1a3.domain.Card;
import com.example.l1a3.domain.Game;
import java.util.ArrayList;
import java.util.List;

public class EmojiGame {

    private  final  Game<String> game;
    List<String> cardContent = new ArrayList<>();
    public EmojiGame(){
         cardContent.add("\uD83D\uDC17");
         cardContent.add("\uD83D\uDC35");
         cardContent.add("\uD83D\uDC36");
         cardContent.add("\uD83D\uDC3C");
         cardContent.add("\uD83D\uDC26");
         cardContent.add("\uD83D\uDD77");
        game = new Game<>(cardContent);
    }
    public void cardClick(Card<String> card){
         game.CardClick(card);
}

     public List<Card<String>> getCards(){
        return game.getCards();
     }

}
