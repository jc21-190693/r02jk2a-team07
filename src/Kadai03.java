public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
char[] CharacterList(String s) {
	if(s==null) {
		return null;
	}

	boolean[] b = new boolean[26];
	int count = 0;

	for(int i=0;i<s.length();i++) {
		for(int n=0;n<26;n++) {
			if(s.charAt(i)=='a'+n) {
				b[n] = true;
			}
			if(s.charAt(i)=='A'+n) {
				b[n] = true;
			}
		}
	}
	for(int a=0;a<26;a++) {
		if(b[a]==true) {
			count++;
		}
	}

	char[] c = new char[count];
	int charcount = 0;
		for(int t=0;t<26;t++) {
			if(b[t]==true) {
				c[charcount] =(char) ('A'+t);
				charcount++;
			}
		}
		return c;
	}
}
