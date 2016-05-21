package ua.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck() {

		for (Rank rank : Rank.getAllRanks()) {
			for (Suite suite : Suite.getAllSuites()) {
				cards.add(new Card(rank, suite));
			}
		}
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void shuffle() {
		System.out.println("\n [Deck]Shuffling cards: ");
		Collections.shuffle(cards);
	}

	public Card takeCard() {
		if (cards.isEmpty()) {
			return null;
		} else {
			return cards.remove(0);
		}
	}

	public boolean hasCard() {
		return cards.size() > 0;
	}

	public int deckSize() {
		return cards.size();
	}

	public void showDeck() {
		for (Card Card : cards) {
			System.out.print(Card.getUnicodeSign());
		}
	}

	public void printSize() {
		System.out.println("\n [Deck]All Cards : " + deckSize());
	}
}
