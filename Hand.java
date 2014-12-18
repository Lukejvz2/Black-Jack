package blackjack;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;
	
	public Hand(){
		hand = new ArrayList<Card>();
	}
	
	public void addCard(Card card){
		hand.add(card);
	}
	
	public ArrayList<Card> getHand(){
		return hand;
	}
	@Override
	public String toString(){
		String result = "";
		for(int i = 0; i < hand.size(); i++){
			result = result + hand.get(i).toString() + " ";
		}
		return result.trim();
	}
	
	public void clear(){
		for(int i = 0; i < hand.size();){
			hand.remove(0);
		}
	}

}
