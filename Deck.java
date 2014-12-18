package blackjack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

/**
 * 
 *  @author Davor Civsa, Luke Vande Zande
 * 
 * A Deck class simulating a standard 52-card deck
 **/
public class Deck {
	
	private ArrayList<Card> discard;
	private ArrayList<Card> deck;
	private final Random rand;
	
	public Deck(){
		discard = new ArrayList<Card>();
		//creates and adds 52 new cards to discard
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				Card newCard = new Card(i, j+1);
				discard.add(newCard);
			}
		}
		rand = new Random(1);
		deck = new ArrayList<Card>();
		shuffle();
	}
	
	public void shuffle(){
		//if there are cards in the deck, shift them to discard
		if(deck.size() > 0){
			for(int i = 0; i < deck.size();){
				discard.add(deck.get(0));
				deck.remove(0);
			}
		}
		//picks a random card to add to the deck
		while(discard.size() > 0){
			int r = rand.nextInt(discard.size());
			deck.add(discard.get(r));
			discard.remove(r);
		}
	}
	
	public Card draw(){
		if(deck.size() == 0){
			System.out.println("The deck is empty!");
			return null;
		}
		else{
			Card card = deck.get(0);
			System.out.println("You drew: " + card.toString());
			discard.add(deck.get(0));
			deck.remove(0);
			return card;
		}
	}
	
	public int size(){
		return deck.size();
	}
	
	
	
	
}
