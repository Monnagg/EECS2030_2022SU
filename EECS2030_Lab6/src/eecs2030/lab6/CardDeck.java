package eecs2030.lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/** 
 * Implements a deck of 52 cards, e.g., for a poker game
 * @author 
 *
 */
public class CardDeck implements Iterable <Card>{
	/**
	 * Creates a new deck of cards. The deck will contain 52 distinct cards.
	 * the deck may or may not be shuffled
	 */
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public CardDeck ()
	{
		//TODO

		for(int i = 0; i  < CardSuit.values().length; i ++) {
			for(int j = 0; j< CardValue.values().length; j ++) {
				list.add(new Card(CardValue.values()[j],CardSuit.values()[i]));
			}
		}
	}

	/**
	 * Shuffles the deck
	 */
	public void shuffle(){
		//TODO
		Collections.shuffle(list);
	}

	/**
	 * returns a collection of 5 cards taken from the top of deck.
	 * After the operation those 5 cards should be removed from the deck
	 * and its size is decreased by 5.
	 * @return a collection of 5 cards taken from the top of deck
	 */
	public Collection<Card> draw5Cards (){
		//TODO
		ArrayList<Card> draw5 = new ArrayList<Card>( list.subList(0, 5));
		list.removeAll(draw5);
		
		return draw5;
	}

	/**
	 * After the operation this card should be removed from the deck
	 * and its size is decreased by 1.
	 * @return a card from the top of the deck
	 */
	public Card drawCard (){
		//TODO
		Card card =list.get(0);
		list.remove(0);

		
		return card;
	}

	/**
	 * @return current deck size, a value between 0 and 52 inclusive
	 */
	public int size(){
		//TODO
		return list.size();
	}

	

	@Override
	public String toString() {
		//TODO
		return ""+list;
	}

	@Override
	public Iterator <Card> iterator() {
		//TODO
		return this.list.iterator();
	}

}
