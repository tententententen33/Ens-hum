class Exp17_1 {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = num1;
		num1++;
		num1++;
		int num3 = num1;
		num1++;
		int ans1 = num1 + num2 + num3;
		System.out.println("num1:" + num1);
		System.out.println("num1:" + num2);
		System.out.println("num1:" + num3);
		System.out.println("num1:" + ans1);
	}
}