package ua.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rank {

	private int position;
	private String sign;
	private String text;
	private String unicode;

	private static final Map<Integer, Map<String, String>> DATA_MAP;
	private static List<Rank> RANKS;

	static {
		String[] signs = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] texts = { "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };
		String[] unicode = { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "D", "E", "1" };

		DATA_MAP = new HashMap<Integer, Map<String, String>>();
		for (int i = 0; i < signs.length; i++) {
			Map<String, String> rank = new HashMap<String, String>();
			rank.put("sign", signs[i]);
			rank.put("text", texts[i]);
			rank.put("unicode", unicode[i]);
			DATA_MAP.put(i, rank);
		}
	}

	private Rank(int position, String sign, String text, String unicode) {
		this.position = position;
		this.sign = sign;
		this.text = text;
		this.unicode = unicode;
	}

	public static List<Rank> getAllRanks() {
		if (RANKS == null) {
			RANKS = new ArrayList<Rank>();
			for (Map.Entry<Integer, Map<String, String>> entry : DATA_MAP.entrySet()) {
				Map<String, String> data = entry.getValue();
				int position = entry.getKey();
				String sign = data.get("sign");
				String text = data.get("text");
				String unicode = data.get("unicode");
				Rank rank = new Rank(position, sign, text, unicode);
				RANKS.add(rank);
			}
		}
		return RANKS;
	}

	public int getPosition() {
		return position;
	}

	public String getSign() {
		return sign;
	}

	public String getText() {
		return text;
	}

	public String getUnicode() {
		return unicode;
	}
}
