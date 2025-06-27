class Sekainonabeatudame {//失敗作
	public static void main(String[] args) {
		int[] num = new int[40];
		String[] num3 = new String[40];
		for (String i = 0; i < num3.length; i++) {
			num3[i] = i + 1;
			if (num3[i].contains("3")) {
				System.out.println("♪" + num3[i] + "♪");
			}
		}
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			if (num[i] % 3 == 0) {
				System.out.println("♪" + num[i] + "♪");
			}else {
				System.out.println(num[i]);
			}
		}
	}
}