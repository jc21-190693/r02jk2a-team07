public class Kadai05 {

	/**
	 * 課題05
	 * 引数として渡された配列の中で、最大値を返す
	 * @param  数値が入っている配列
	 * @return
	 * @return 配列の中の最大値
	 */
	
int getMax(int[] d) {
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < d.length; i++) {
		max = Math.max(d[i],max);
	}
	return max;
}

	
}
