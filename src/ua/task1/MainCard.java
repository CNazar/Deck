package ua.task1;

public class MainCard {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player("Mike");
		Player p2 = new Player("Leo");
		deck.shuffle();
		deck.showDeck();

		for (int i = 0; i < 6; i++) {
			Card card = deck.takeCard();
			p1.obtainCard(card);
			Card card2 = deck.takeCard();
			p2.obtainCard(card2);
		}
		p1.showCards();
		p2.showCards();

		// while (deck.hasCard()) {
		// Card card = deck.takeCard();
		// System.out.print("\n№" + deck.deckSize() + " сard: " +
		// card.getUnicodeSign());
		// }
	}
}
