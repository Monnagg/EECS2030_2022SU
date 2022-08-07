package eecs2030.lab6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements poker game-related methods
 * @author 
 *
 */
public class Poker {
	private Poker(){};

	/**
	 * Checks if a hand contains a Three of a kind: https://en.wikipedia.org/wiki/List_of_poker_hands#Three_of_a_kind
	 * @param hand
	 * @return true if the hand contains three cards of one rank and two cards of two other ranks 
	 * NOTE: Four of a kind is excluded, https://en.wikipedia.org/wiki/List_of_poker_hands#Four_of_a_kind; 
	 * so is Full House: three cards of one rank and two cards of another rank)
	 * 
	 */
	public static boolean hasThreeOfAKind(PokerHand hand){
		//TODO
		ArrayList<Card> h= (ArrayList<Card>) hand.getHand();

		int[] num = new int[5];
		
		for(int i = 0; i < h.size(); i++) {
			int n = 0;
			for(int j = 0; j < h.size(); j++) {
				if(h.get(i).getCardValue().equals(h.get(j).getCardValue())) {
					n++;
				}
			}
			num[i] = n;
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 3) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Checks if a hand contains a Flush: https://en.wikipedia.org/wiki/List_of_poker_hands#Flush
	 * @param hand
	 * @return true if the hand contains five cards all of the same suit, not all of sequential rank
	 * NOTE: Straight flush https://en.wikipedia.org/wiki/List_of_poker_hands#Straight_flush  
	 * are to be excluded
	 */
	public static boolean hasFlush(PokerHand hand){
		//TODO
		
		ArrayList<Card> h= (ArrayList<Card>) hand.getHand();

		int n = 0;

		for(int i = 0; i < h.size(); i++) {
			if(h.get(0).getSuit().equals(h.get(i).getSuit())) {
				n++;
			}
		}
		
		if(n == 5) {
			return true;
		}

	
		return false;
	}

}
