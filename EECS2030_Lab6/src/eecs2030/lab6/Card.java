package eecs2030.lab6;

/**
 * This class implements a playing card with one of 52 possible values.
 * @author 
 */
public class Card {
	private final CardValue cardValue;
	private final CardSuit suit;
	/**
	 * Creates a new card with the specified Value (Rank) and Suit
	 * @param cardValue rank
	 * @param suit card suit
	 */
	public Card (CardValue cardValue, CardSuit suit)
	{
		//TODO
		this.cardValue = cardValue;
		this.suit = suit;
	}

	/**
	 * @return card value (rank)
	 */
	public CardValue getCardValue()
	{
		//TODO
		// composition?
		return cardValue;
	}

	/**
	 * @return card suit
	 */
	public CardSuit getSuit()
	{
		//TODO
		return suit;
	}

	@Override
	public String toString() {
		//TODO

		return cardValue +" "+ suit ;
	}

	
}
