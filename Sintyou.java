import java.util.Scanner;

public class Sintyou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ban = 0;

        // 入力人数の取得
        while (true) {
            System.out.println("何人の身長を比較するか教えてください。");
            String input = scanner.nextLine();

            if (input.matches("\\d+")) {
                ban = Integer.parseInt(input);
                if (ban > 0) {
                    break;
                } else {
                    System.out.println("エラー：1人以上を入力してください。");
                }
            } else {
                System.out.println("エラー：現実的な身長(40㎝~210㎝)を入力してください。");
            }
        }

        double[] numbers = new double[ban]; // 元の配列（身長）
        double[] max = new double[ban];  // 並び替えた結果を格納する配列

        // 身長の入力
        System.out.println("比較する身長を入力してください。");
        for (int i = 0; i < numbers.length; ) {
            System.out.print((i + 1) + "人目の身長: ");
            String str = scanner.nextLine();

            if (str.matches("\\d+")) {
                double num = Double.parseDouble(str);
                if (num >= 40 && num <= 210) {
                    numbers[i] = num;
                    i++;
                } else {
                    System.out.println("エラー：現実的な身長(40㎝~210㎝)を入力してください。");
                }
            } else {
                System.out.println("エラー：現実的な身長(40㎝~210㎝)を入力してください。");
            }
        }

        // 最大値を順に取り出して sorted 配列に格納し、元の配列を0に更新
        for (int i = 0; i < max.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            max[i] = numbers[maxIndex];
            numbers[maxIndex] = 0;
        }

        // 結果表示
        System.out.println("\n--- 並び替えられた配列 ---");
        for (int i = 0; i < max.length; i++) {
            System.out.println((i + 1) + "番目: " + max[i] + " cm");
        }

        scanner.close();
    }
}
