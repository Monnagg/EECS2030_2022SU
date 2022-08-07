package eecs2030.lab6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void test1() {
		PokerHand hand3 = new PokerHand(new Card(CardValue.TEN,CardSuit.CLUBS),new Card(CardValue.ACE,CardSuit.CLUBS),new Card(CardValue.EIGHT,CardSuit.CLUBS),new Card(CardValue.FIVE,CardSuit.CLUBS),new Card(CardValue.FOUR,CardSuit.CLUBS));
		System.out.println(hand3);
		System.out.println("Has a Flush: " + Poker.hasFlush(hand3));
		System.out.println("Has a 3 kind: " + Poker.hasThreeOfAKind(hand3));

	}
	@Test
	void test2() {
		PokerHand hand = new PokerHand(new Card(CardValue.TEN,CardSuit.CLUBS),new Card(CardValue.TEN,CardSuit.CLUBS),new Card(CardValue.EIGHT,CardSuit.CLUBS),new Card(CardValue.FIVE,CardSuit.CLUBS),new Card(CardValue.FOUR,CardSuit.CLUBS));
		System.out.println(hand);
		assertTrue(Poker.hasFlush(hand));
		System.out.println("Has a Flush: " + Poker.hasFlush(hand));
		System.out.println("Has a 3 kind: " + Poker.hasThreeOfAKind(hand));

	}
	
	@Test
	void test3() {
		PokerHand hand2 = new PokerHand(new Card(CardValue.TEN,CardSuit.CLUBS),new Card(CardValue.ACE,CardSuit.CLUBS),new Card(CardValue.EIGHT,CardSuit.CLUBS),new Card(CardValue.FIVE,CardSuit.CLUBS),new Card(CardValue.FOUR,CardSuit.CLUBS));
		System.out.println(hand2);
		Iterator iter = hand2.iterator();
		System.out.println(iter.hasNext());

		while(iter.hasNext()) {
			System.out.println(iter.next());

		}
		System.out.println("Has a Flush: " + Poker.hasFlush(hand2));
		System.out.println("Has a 3 kind: " + Poker.hasThreeOfAKind(hand2));

	}
}
