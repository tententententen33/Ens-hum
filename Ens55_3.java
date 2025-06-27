class Ens55_3 {
	public static void main(String[] args) {
		System.out.println("〇〇〇漢字50題テスト結果〇〇〇");
		int[] scores = {86,72,48,90,77,66};
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] % 2 == 1) {
				System.out.println("不正なデータを検出しました。");
				break;
			}else if (scores[i] >= 60) {
				System.out.println("合格者出席番号：" + (i + 1));
			}else {
				continue;
			}
		}
	}
}