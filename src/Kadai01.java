
public class Kadai01 {

	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返すメソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */
	String ReverseString(String s) {
		//TODO プログラムをここに作成する
		if(s==null) {
		return s;
		}
		String r = "";
		for(int i = 0;s.length()>i;i++){
			r = r + s.charAt(s.length()-i-1);

		}

		return r;
	}
}
