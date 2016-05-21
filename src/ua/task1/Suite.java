package ua.task1;

import java.util.*;

public class Suite {
	private int position;
	private String sign;
	private String text;
	private String unicode;

	private static final Map<Integer, Map<String, String>> DATA_MAP;
	private static List<Suite> SUITES;

	static {
		String[] signs = { "♠", "♥", "♦", "♣" };
		String[] texts = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] unicode = { "A", "B", "C", "D" };

		DATA_MAP = new HashMap<Integer, Map<String, String>>();
		for (int i = 0; i < signs.length; i++) {
			Map<String, String> suite = new HashMap<String, String>();
			suite.put("sign", signs[i]);
			suite.put("text", texts[i]);
			suite.put("unicode", unicode[i]);
			DATA_MAP.put(i, suite);
		}
	}

	private Suite(int position, String sign, String text, String unicode) {
		this.position = position;
		this.sign = sign;
		this.text = text;
		this.unicode = unicode;
	}

	public static List<Suite> getAllSuites() {
		if (SUITES == null) {
			SUITES = new ArrayList<Suite>();
			for (Map.Entry<Integer, Map<String, String>> entry : DATA_MAP.entrySet()) {
				Map<String, String> data = entry.getValue();
				int position = entry.getKey();
				String sign = data.get("sign");
				String text = data.get("text");
				String unicode = data.get("unicode");
				Suite suite = new Suite(position, sign, text, unicode);
				SUITES.add(suite);
			}
		}
		return SUITES;
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
