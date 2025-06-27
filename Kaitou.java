import java.io.*;

class Kaitou {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください。");

        // リソースを自動的に閉じるために try-with-resources を使用
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            // 入力の形式を検証する例
            if (str.matches("[a-zA-Z0-9]+")) {
                System.out.println(str + "が入力されました。");
            } else {
                System.out.println("無効な文字列です。英数字のみ入力してください。");
            }
        } catch (IOException e) {
            // 入力時のエラーをキャッチ
            System.out.println("入力エラーが発生しました: " + e.getMessage());
        }
    }
}