class Ens54 {
	public static void main(String[] args) {
		String[] fruits = {"apple","banana","cherry","date","grape"};
		System.out.println("フィルタリング処理を開始します。");
		String skip = "b";
		for (int i = 0;i < fruits.length; i++) {
			if (fruits[i].startsWith(skip)) {
				System.out.println("スキップ対象：" + fruits[i]);
				continue;
			}
			System.out.println("処理中の文字列：" + fruits[i]);
		}
		System.out.println("フィルタリング処理を終了しました。");
	}
}