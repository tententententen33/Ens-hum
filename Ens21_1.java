class Ens21_1 {
	public static void main(String[] args) {
		int frame1 = 8;
		int frame2 = 10;
		int frame3 = 9;
		int frame4 = 7;
		int frame5 = 6;
		int total = frame1 + frame2 + frame3 + frame4 + frame5;
		double average = (double)total / 5;
		int seisu = (int)average;
		System.out.println("平均スコアは" + seisu + "点です。");
	}
}