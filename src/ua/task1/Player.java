package ua.task1;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> cards;

	public Player(String name) {
		this.cards = new ArrayList<Card>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void obtainCard(Card card) {
		cards.add(card);
	}

	public void showCards() {
		System.out.println();
		System.out.println("\n [Player] " + this.getName() + " Taking a Card: ");
		for (Card card : cards) {
			System.out.print(card.getUnicodeSign());
		}
	}

	@Override
	public String toString() {
		return name;
	}
}
