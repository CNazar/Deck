package ua.task1;

class Card {

	private final Rank rank;

	private final Suite suite;

	public Card(Rank rank, Suite suite) {
		this.rank = rank;
		this.suite = suite;
	}

	public Rank getRank() {
		return rank;
	}

	public Suite getSuite() {
		return suite;
	}

	public String getUnicodeSign() {
		String unicode = "1f0" + suite.getUnicode() + rank.getUnicode();
		int hex = Integer.parseInt(unicode, 16);
		return String.valueOf(Character.toChars(hex));
	}

	public String toString() {
		return "\n" + rank + "of" + suite;
	}

	public void printSign() {
	}
}
