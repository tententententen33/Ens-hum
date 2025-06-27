class Darekagaogoreyo {
	public static void main(String[] args) {
		
		int day1kingaku = 3000 * 3;
		int day1amari = 200;
		int day1kaikei = day1kingaku - day1amari;
		double day1hitoriatari = day1kaikei / 3.0;
		
		int day2kingaku = 2000 * 3;
		int day2fusoku = 149;
		int day2kaikei = day2kingaku - day2fusoku;
		double day2hitoriatari = day2kaikei / 3.0;
		
		int amari = day1amari - day2fusoku;
		double amarihitoriatari = amari / 3.0;
		
		double hitoriatari = day1hitoriatari + day2hitoriatari - amarihitoriatari;
		
		System.out.println("2日間の一人当たりの使った金額は" + hitoriatari + "円です。");
	}
}