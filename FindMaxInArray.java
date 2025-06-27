/*
  No: 1525017
  Name: 椙山天斗
*/
import java.util.Scanner;

class FindMaxInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[5];
		int max = -1;
		System.out.println("5つの数字を半角整数で入力してください。");
		
		for (int i = 0;i > num.length;i++) {
			System.out.print((i + 1) + "番目の整数を入力してください：");
			int ban = scanner.nextInt();
		}
		
		for (int j = 0;j > num.length;j++) {
			if (num[j] > max) {
			max = num[j];
			}
		}
		System.out.println("入力された数値の最大値は：" + max);
		
		scanner.close();
	}
}
		