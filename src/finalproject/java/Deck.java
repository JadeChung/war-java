package finalproject.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//make the deck use a list...or map? changed <Card> after importing???

	private List<Card> cards = new ArrayList<Card>();

	String[] suits = { "Club", "Diamond", "Spade", "Heart" };

//map to create deck and value?
//switched from Character to a String...??
	public Deck() {
		for (int rank = 2; rank <=14; rank++) {
			for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {
				cards.add(new Card (rank, suits[suitIndex]));
			}
		}
	}



	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(0);

	}
}
