/*
	No:1525017
	Nome:椙山天斗
*/
class Ens58_2 {
	public static void main(String[] args) {
		int[][] originalArray = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		System.out.println("--- 元の配列 ---");
		for (int i = 0; i < originalArray.length; i++) {
			for (int j = 0; j < originalArray[i].length; j++) {
				System.out.print(originalArray[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < originalArray.length; i++) {
			for (int j = 0; j < originalArray[i].length-1; j++) {
				for (int k = j + 1; k < originalArray[i].length; k++) {
					if (originalArray[i][j] < originalArray[i][k]) {
						int temp = originalArray[i][j];
						originalArray[i][j] = originalArray[i][k];
						originalArray[i][k] = temp;
					}
				}
			}
		}
		System.out.println();
		System.out.println("--- 左右反転表示 ---");
			for (int i = 0; i < originalArray.length; i++) {
			for (int j = 0; j < originalArray[i].length; j++) {
				System.out.print(originalArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}