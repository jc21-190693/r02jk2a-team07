
public class Kadai04 {

	/**
	 * 課題04
	 * 文字列の中に含まれるアルファベットの中で、一番多く使われている文字を返す
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char getMaxString(String s) {
		char c=' ';
		s.toUpperCase();
		int[] a =new int[26];

		for(int i=0;i<s.length();i++) {
			for(int w=0;w<26;w++) {
				if(s.charAt(i)=='a'+w) {
					a[w] ++;
				}
				if(s.charAt(i)=='A'+w) {
					a[w] ++;
				}

			}

		}
		int max =0;
		int soeji=0;
		for(int i=0;i<26;i++) {
			if(max<a[i]) {
				max=a[i];
				soeji = i;
			}
			c =(char) ('A'+soeji);
		}
		return c;
	}
}
