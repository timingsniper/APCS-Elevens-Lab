import java.util.ArrayList;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[]ranks = {"A" , "B" , "C" , "D"};
		String[]suits = {"Heart" , "Clover" , "Spade" , "Diamond"};
		int[]values = {4 , 6, 7 , 9};
		
		String[]ranks1 = {};
		String[]suits1 = {};
		int[]values1 = {};
		
		String[]ranks2 = {"J" , "Q" , "K"};
		String[]suits2 = {"Diamond"};
		int[]values2 = {1, 3, 5};
		
		
		
		Deck d1 = new Deck(ranks, suits, values);
		Deck d2 = new Deck(ranks1, suits1, values1);
		Deck d3 = new Deck(ranks2, suits2, values2);
		
		//d1 test
		System.out.println("d1: " + d1);
		d1.deal();
		System.out.println("\nAfter dealing d1: " + d1);
		System.out.println("Is d1 empty?: " + d1.isEmpty());
		System.out.println("Current size of d1?: " + d1.size());
		
		//d2 test
		System.out.println("\nd2: " + d2);
		d2.deal();
		System.out.println("\nAfter dealing d2: " + d2);
		System.out.println("Is d2 empty?: " + d2.isEmpty());
		System.out.println("Current size of d1?: " + d2.size());
		
		//d3 test
		System.out.println("\nd3: " + d3);
		d3.deal();
		System.out.println("\nAfter dealing d3: " + d3);
		System.out.println("Is d3 empty?: " + d3.isEmpty());
		System.out.println("Current size of d3?: " + d3.size());

		int randomnum = (int)(Math.random()*5);
		System.out.println(randomnum);
		
		
		
		
	}
}
