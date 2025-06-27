class Ens45_2 {
	public static void main(String[] args) {
		int[] calories = {450,700,630};
		String[] time = {"朝","昼","夜"};
		for (int i = 0; i < calories.length; i++) {
			if (calories[i] > 600) {
				System.out.println(time[i] + ": カロリー高めです");
			}else {
				System.out.println(time[i] + ": 適切なカロリーです");
			}
		}
	}
}