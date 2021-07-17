package finalproject.java;

import java.util.ArrayList;
import java.util.List;
//where to use the scanner to have name input??//
public class Player {
	private List<Card> hand = new ArrayList <Card>();
	private int score;
	private String name;
	
	public Player() {}
	
	public Player(String name) {
		this.name=name;
	}
	
//describe player and describe hand
	public void describe(Card cards) {
		System.out.print("Player's name is: " + this.name );
		System.out.println("Card info: ");
		for (Card card: hand) {
			card.describe();
		}
	}
//flip removes and returns
public Card flip() {
	return hand.remove(0);
	
}
//draw 1.argument than call it
public void draw(Deck deck) {
	hand.add(deck.draw());
}
//score card
public void incrementScore() {
	this.score +=1;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



}
