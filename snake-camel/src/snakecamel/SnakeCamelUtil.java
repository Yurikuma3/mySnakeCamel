package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) { // Snake→Camel
		String[] words = snake_case.split("_"); // snake_caseで渡された文字列を"_"で分ける
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) { // 分けた文字列の個数分 length-1→lengthに
			sb.append(capitalize(words[i])); // 文字列の１文字目を大文字にしてappend
		}
		return new String(sb);
	}
	public static String camelToSnakecase(String camelcase) { // Camel → Snake
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) { // 与えられた文字列の長さ
			char c = camelcase.charAt(i); // 一文字ずつ読む
			if (Character.isUpperCase(c)) { // 大文字だったら
				String s = camelcase.substring(j, i);
				if(s.length() > 0)
					sb.append(uncapitalize(s)); // 文字列のj番目〜i番目をunacpitalizeして追加
				if (sb.length() > 0) {
					sb.append("_");
				}
				j = i;
			}
		}
		sb.append(uncapitalize(camelcase.substring(j)));
		return new String(sb);
	}
	
	static String capitalize(String s) { // 文字列の最初の一字を大文字にする
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1); // 最初の一文字以外
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}