class Exp26_1 {
    public static void main(String[] args) {
        // 各科目の点数（例として任意の点数を代入）
        int math = 85;
        int english = 82;
        int info = 75;

        // 判定処理
        if (math >= 80) {
			if (english >= 80) {
				if (info >= 80) {
				System.out.println("特待生です");
				}else {
					System.out.println("準特待生です");
				}
			}else {
				System.out.println("不合格です（英語が基準未満）");
			}
        }else {
        System.out.println("不合格です（数学が基準未満）");
        }
    }

}
