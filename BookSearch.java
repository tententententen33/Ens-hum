/*
  No: 1525017
  Name: 椙山天斗
*/
import java.util.Scanner;

class BookSearch {
	public static void main(String[] args) {
		String[] bookTitles = {"Java入門","Python基礎","C＃プログラミング"};
		int[] bookPrices = {2500,2200,2800};
		
		System.out.print("検索したい本のタイトルを入力してください：");
		Scanner scanner = new Scanner(System.in,"Shift-JIS");
		String searchTitle = scanner.nextLine();
		boolean isFind = false;
		
		for (int i = 0; i < bookTitles.length;i++) {
			if (bookTitles[i].equals(searchTitle)) {
				isFind = true;
				System.out.print("タイトル" + bookTitles[i] + ",価格：" + bookPrices[i] + "円");
			}
		}
		if (!isFind) {
			System.out.println("該当する本はありません。");
		}
		scanner.close();
	}
}
		
		