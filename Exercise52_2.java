/*
	No：1525017
	Name：椙山天斗
*/

class Exercise52_2 {
	public static void main(String[] args) {
		int[] numbers = {40,70,30,60,20};
		System.out.println("--- ソート前 ---");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("--- ソート後（大きい順） ---");
		for (int j = 0; j < numbers.length; j++) {
			for (int k = j + 1; k < numbers.length; k++) {
				if (numbers[k] > numbers[j]) {
					int temp = numbers[k];
					numbers[k] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int l = 0; l < numbers.length; l++) {
			System.out.print(numbers[l] + " ");
		}
		System.out.println();
	}
}