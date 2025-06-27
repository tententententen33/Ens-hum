/*
	氏名：椙山天斗
	学生番号：1525017
*/
import java.util.Scanner;
class Ens53_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください(0を入力すると終了):");
		int sum = 0;
		int count = 0;
		while (true) {
			System.out.print(">");
			int num = scanner.nextInt();
			sum += num;
			if (num == 0) {
				break;
			}
			count++;
		}
		System.out.println("入力受付を終了します。");
		System.out.println("合計値：" + sum);
		System.out.println("入力回数：" + count);
		scanner.close();
	}
}