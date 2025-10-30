package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 card1 = new Card1("Ace", "Hearts", 1);
		Card1 card2 = new Card1("King", "Diamonds", 10);
		Card1 card3 = new Card1("Ace", "Hearts", 1);
		card1.toString();
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card1.pointValue());
		System.out.println(card2.pointValue());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));

	}
}
