/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		//3 Card Objects
		Card c1 = new Card("A" , "Heart" , 5);
		Card c2 = new Card("A" , "Heart" , 5);
		Card c3 = new Card("B" , "Clover" , 6);
		
		//Test c1
		System.out.println("Card 1 Equals Card 2? : " + c1.matches(c2));
		System.out.println("Card 1 Rank?: " + c1.rank());
		System.out.println("Card 1 Suit?: " + c1.suit());
		System.out.println("Card 1 Point value?: " + c1.pointValue());
		System.out.println(c1);
		System.out.println();
		
		//Test c2
		System.out.println("Card 2 Equals Card 3? : " + c2.matches(c3));
		System.out.println("Card 2 Rank?: " + c2.rank());
		System.out.println("Card 2 Suit?: " + c2.suit());
		System.out.println("Card 2 Point value?: " + c2.pointValue());
		System.out.println(c2);
		System.out.println();
		
		//Test c3
		System.out.println("Card 3 Equals Card 1? : " + c3.matches(c1));
		System.out.println("Card 3 Rank?: " + c3.rank());
		System.out.println("Card 3 Suit?: " + c3.suit());
		System.out.println("Card 3 Point value?: " + c3.pointValue());
		System.out.println(c3);
		System.out.println();
		
		
	}
}
