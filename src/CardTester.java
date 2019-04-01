/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Queen", "Clubs", 12);
		Card c = new Card("Queen", "Clubs", 12);

		System.out.println(a.rank());
		System.out.println(b.suit());
		System.out.println(c.pointValue());
		System.out.println(a.matches(b));
		System.out.println(b.matches(c));
		System.out.println(a);
		System.out.println(b);
	}
}
