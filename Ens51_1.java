class Ens51_1 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("因数は年齢と飲酒経験の有無(yes/no)で入力してください。");
			System.out.println("例：20 yes");
			System.exit(1);
		}
		int age = Integer.parseInt(args[0]);
		String alcExperience = args[1];
		if (age >= 20 && alcExperience.equals("yes")) {
			System.out.println("適量を守って楽しみましょう。");
		}else if (age >= 20 && alcExperience.equals("no")) {
			System.out.println("初めての飲酒は量に気を付けましょう。");
		}else if (age < 20) {
			System.out.println("未成年の飲酒は禁止されています。");
		}
	}
}