package blackjack;

public class Card {
	
	private final String[] suits = {"c", "d", "h", "s"};
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
		case 1: result += "A"; break;
		case 11: result += "J"; break;
		case 12: result += "Q"; break;
		case 13: result += "K"; break;
		default:
			result = result + rank + "";
		}
		switch(suit){
		case "c": return result += "c"; 
		case "d": return result += "d"; 
		case "h": return result += "h"; 
		case "s": return result += "s";
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
