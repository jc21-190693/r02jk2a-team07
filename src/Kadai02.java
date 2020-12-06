
public class Kadai02 {

	/**
	 * 課題02
	 * 文字列の中に、指定されたアルファベットが何文字入っているかを返すメソッド
	 * @param s 文字列
	 * @param c 文字
	 * @return sの中に入っていたcの文字数
	 */
	int countString(String s,char c) {

		if(s == null) {
		return 0;
		}
		int count = 0;
	for(int i = 0;s.length()>i;i++) {
		if(s.charAt(s.length()-i-1)==c) {
			count++;
		}
	}
		return count;
	}
}
