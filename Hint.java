import java.io.*;

class Hint {

    public static void main(String[] args) throws IOException {

        System.out.println("テストの受験者数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] test = new int[num];
        int sum = 0;
        double average = 0;
        double kaisu = 0;
        double hnum = 0;
		double bsum = 0;
		double bunsan = 0;
		double hyoujunhensa = 0;

        System.out.println(num + "人の点数を入力してください。");

        for (int tokuten = 0; tokuten < num;) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp > 0) {
                test[tokuten] = tmp;
                sum = sum + test[tokuten];
                tokuten++;
                kaisu++;
            } else {
                System.out.println("整数を入力してください。");
            }
        }

        average = sum / kaisu;

        for (int ten = 0; ten < num; ten++) {
            hnum = test[ten] - average;
            bsum += hnum * hnum;
        }

        bunsan = bsum / kaisu;
        hyoujunhensa = Math.sqrt(bunsan);

        System.out.println("合計点は" + sum + "です。");
        System.out.println(String.format("平均点は%.1f点です。", average));
        System.out.println(String.format("標準偏差は%.2fです。", hyoujunhensa));
    }
}
