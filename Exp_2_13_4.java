class Exp_2_13_4 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = num1++;
		int num3 = ++num1;
		int ans1 = ++num1 + num2 + num3;
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		System.out.println("num3:" + num3);
		System.out.println("ans1:" + ans1);
	}
}