import java.io.*;

class Keisan {

    public static void main(String[] args) throws IOException {

        System.out.println("テストの受験者数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
		if(num <= 0){
			System.out.println("0以上を入力してください。プログラムを終了します。");
			return;
		}
		/*
		if (1048575996 <= num || num <= 0) { //1,048,575,996人がMAX
            System.out.println("受験者がいないので終了します。");
            return;
        }
		*/
        
		int[] test = new int[num];
        double sum = 0;
        double average = 0.0;
   
        double hnum = 0.0;
		double bsum = 0.0;
		double bunsan = 0;
		double hyoujunhensa = 0.0;
		int max = -1;
		int min = 101;
		
		int tokutenMax = 100;
		int tokutenMin = 0;

        System.out.println(num + "人の点数を入力してください。");
		
		int kaisu = 0;

		do{
			int tokuten = Integer.parseInt(br.readLine());
			
            if (tokuten >= tokutenMin && tokuten <= tokutenMax) {
                test[kaisu] = tokuten;
                sum += test[kaisu];
				if (test[kaisu] > max) {
                    max = test[kaisu];
                }
                if (test[kaisu] < min) {
                    min = test[kaisu];
				}
                kaisu++;
            } else {
                System.out.println("整数を入力してください。");
            }

        }while (kaisu < num);

        average = sum / kaisu;

        for (int i = 0; i < num; i++) {
            hnum = test[i] - average;
            bsum += hnum * hnum;
        }

        bunsan = bsum / kaisu;
        hyoujunhensa = Math.sqrt(bunsan);

        System.out.println("合計点は" + (int)sum + "点です。");
        System.out.println(String.format("平均点は%.1f点です。", average));
        System.out.println(String.format("標準偏差は%.2fです。", hyoujunhensa));
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
    }
}