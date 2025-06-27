class Ens58_1 {
	public static void main(String[] args) {
		int[][] numbers = new int[2][3];
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[1][0] = 40;
		numbers[1][1] = 50;
		numbers[1][2] = 60;
		System.out.println("--- 配列の全要素 ---");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
		/*
		System.out.println("numbers[0][1]の要素" + numbers[0][1]);
		System.out.println("numbers[1][2]の要素" + numbers[1][2]);
		*/