package finalproject.java;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		
		// use a traditional for loop
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
					player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		
		int round = 1;
		for (int i = 20; i < 26; i++) {
			// retrieve two cards first from player's hand
			int card1 = player1.flip().getCardValue();
			int card2 = player2.flip().getCardValue();
			
			if (card1 > card2) {
				player1.incrementScore();
				System.out.println(player1.getName() + " gained a point, total points = " + player1.getScore());
			} 
			else if (card1 < card2) {
				player2.incrementScore();
				System.out.println(player1.getName() + " gained a point, total points = " + player1.getScore());
			} else if (card1 == card2) { 
				System.out.println("This is WAR!!");
					if (card1 > card2) {
						player1.incrementScore();
						System.out.println(player1.getName() + " gained a point. Total points = " + player1.getScore());
					}
					if (card2 > card1) {
							player2.incrementScore();
							System.out.println(player2.getName() + "gained a point. Total points = " + player2.getScore());
					}
					else {
						System.out.println("It's a tie.");
					}
			}
			round += 1;
		}
		
		
		System.out.println(" THE RESULTS ARE IN");
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() +  " wins");
		} 
		else if(player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " wins.");
	
		}
		else {
			System.out.println("It's a tie. Play again.");
		}
	
	}
}
