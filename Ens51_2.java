class Ens51_2 {
	public static void main(String[] args) {
		double sum = 0.0;
		if (args.length == 0) {
			System.out.println("数値が入力されていないため実行されません。");
			System.out.println("例：java Ens51_2 45 68 78 35 15");
			System.exit(1);
		}
		for (int i = 0; i < args.length; i++) {
			int num = Integer.parseInt(args[i]);
			System.out.println("入力された値：" + num);
			sum += num;
		}
		double average = sum / args.length;
		System.out.println("合計：" + (int)sum);
		System.out.printf("平均： %.2f\n" , average);
	}
}