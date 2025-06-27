class Ens19_1 {
	public static void main(String[] args) {
		double height = 1.70;
		double weight = 65.0;
		double bmi = weight / (height * height);
		int bmiValue = (int)(weight / (height * height));
		System.out.println("あなたのBMIは" + bmiValue + "です。");
	}
}