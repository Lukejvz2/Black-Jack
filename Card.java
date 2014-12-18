package blackjack;

public class Card {
	
	private final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private final String suit;
	private final int rank;
	
	public Card(int suit, int rank){
		this.suit = suits[suit];
		this.rank = rank;
	}
	@Override
	public String toString(){
		String result = "";
		switch(rank){
		case 1: result += "A of ";
		case 11: result += "J of ";
		case 12: result += "Q of ";
		case 13: result += "K of ";
		default:
			result = result + rank + " of ";
		}
		switch(suit){
		case "Clubs": return result += "c";
		case "Diamonds": return result += "d";
		case "Hearts": return result += "h";
		case "Spades": return result += "s";
		default:
			return null;
		}
	}
	public String getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}
}
