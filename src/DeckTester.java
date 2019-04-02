/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Best", "worst"};
		int[] values = {2, 6, 4};
		Deck a = new Deck(ranks, suits, values);
		String[] suits2 = {"Hello"};
		Deck b = new Deck(ranks, suits2, values);
		String[] suits3 = {"Why", "How", "when"};
		Deck c = new Deck(ranks, suits3, values);

		System.out.println(a.size());
		System.out.println(b.size());
		System.out.println(c.size());

		System.out.println(b);
		b.deal();
		b.deal();
		b.deal();
		System.out.println(b);
		System.out.println(b.isEmpty());

	}
}
