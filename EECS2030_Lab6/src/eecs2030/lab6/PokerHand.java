package eecs2030.lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Implements a poker hand containing exactly 5 distinct cards 
 * @author 
 *
 */
public class PokerHand implements Iterable <Card>{
	
	private ArrayList<Card> hand =  new ArrayList<Card>();

	/**
	 * Creates a new hand from a collection of 5 cards
	 * the hand must contain exactly 5 cards, and they must be distinct
	 * @param hand
	 * @throws IllegalArgumentException if the conditions above a violated
	 */

	public PokerHand(Collection<Card> hand) {
		//TODO
		ArrayList<Card> h = (ArrayList<Card>) hand;
		if(hand.size() != 5) {
			throw new IllegalArgumentException("must be 5 cards!");

		}
		for(int i = 0; i < h.size(); i++) {
			for(int j = i + 1; j < h.size(); j++) {
			if(h.get(i).getCardValue().equals(h.get(j).getCardValue()) && h.get(i).getSuit().equals(h.get(j).getSuit()) ) {
				throw new IllegalArgumentException("5 cards must be distinct!");
			}
		}
		
	}
		this.hand = h;
	}

	/**
	 * Creates a new hand from 5 separate card objects
	 * there should be exactly 5 parameters, and they must be distinct
	 * @param hand 5 card objects
	 * @throws IllegalArgumentException if the conditions above a violated
	 */
	public PokerHand(Card... hand) {
		//TODO
		if(hand.length != 5) {
			throw new IllegalArgumentException("must be 5 cards!");

		}
		for(int i = 0; i < hand.length; i++) {
			for(int j = i + 1; j < hand.length; j++) {
			if(hand[i].getCardValue().equals(hand[j].getCardValue()) && hand[i].getSuit().equals(hand[j].getSuit())) {
				
				throw new IllegalArgumentException("5 separate card must be distinct!");
			}
		}
		
	}
		for(int i = 0; i < hand.length; i++) {
			this.hand.add(hand[i]);
		}
	}
	

	/**
	 * @return a list of cards currently held
	 */
	public List <Card> getHand (){
		//TODO
		return hand;
	}

	

	@Override
	public String toString() {
		return  ""+ hand;
	}

	@Override
	public Iterator <Card> iterator() {
		//TODO
		return this.hand.iterator();
	}

}
