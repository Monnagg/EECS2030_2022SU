package eecs2030.lab6;

import java.util.Iterator;

public class CardDemo {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
//		deck.shuffle();
//		
//		//test
//		System.out.println(deck);
//		System.out.println(deck.size());
//		deck.shuffle();
//		System.out.println(deck);

		Iterator iter = deck.iterator();
		System.out.println(iter.hasNext());

		while(iter.hasNext()) {
			System.out.println(iter.next());

		}

		
		System.out.println("Drawing one card: " + deck.drawCard());
		//
		//System.out.println(deck.size());

		System.out.println("Deck size before drawing 5: " + deck.size());
		PokerHand hand = new PokerHand(deck.draw5Cards());
		System.out.println("Deck size  after drawing 5: " + deck.size());
		System.out.println(hand);
		
		//test1
		System.out.println("Deck size before drawing another 5: " + deck.size());
		deck.shuffle();
		PokerHand hand2 = new PokerHand(deck.draw5Cards());
		System.out.println("Deck size  after drawing 2  5: " + deck.size());
		System.out.println(hand2);
		
		System.out.println("Has a Flush: " + Poker.hasFlush(hand2));
		//test2
		PokerHand hand3 = new PokerHand(new Card(CardValue.TEN,CardSuit.CLUBS),new Card(CardValue.ACE,CardSuit.CLUBS),new Card(CardValue.EIGHT,CardSuit.CLUBS),new Card(CardValue.FIVE,CardSuit.CLUBS),new Card(CardValue.FOUR,CardSuit.CLUBS));
		System.out.println(hand3);
		System.out.println("Has a Flush: " + Poker.hasFlush(hand3));
		System.out.println("Has a 3 kind: " + Poker.hasThreeOfAKind(hand3));



		System.out.println();
		
		System.out.println("Searching for Three of a kind");
		int threeOfkindFound = 0;
		for (int i = 0; i < 10000; i++){
			deck = new CardDeck();
			deck.shuffle();
			hand = new PokerHand(deck.draw5Cards());
			if (Poker.hasThreeOfAKind(hand)){
				threeOfkindFound++;
				System.out.println("Three of a kind found: " + hand);
			}
		}
		System.out.println("Total three of a kind found: " + threeOfkindFound);
	}
}
