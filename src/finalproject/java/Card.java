package finalproject.java;

public class Card {
//set as private so no one can change declarations
	private int cardValue;
	private String cardName;
	
	public Card() {
	}
	
	public Card(int cardValue, String cardName) {
		super();
		this.cardValue = cardValue;
		this.cardName = cardName;
	}
	public int getCardValue() {
		return cardValue;
	}
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public void describe() {
		System.out.println("This card: " + cardName + "has a value of " + cardValue);
		
	}
	
	
		
	}

