import java.util.Random;

class WeatherApp {
    public static void main(String[] args) {
        Random random = new Random();
        
        // 1週間（7日間）分の気温を格納する配列
        int[] temperatures = new int[7]; 

        // 曜日表示のための配列
        String[] daysOfWeek = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};

        System.out.println("--- 1週間分の天気予報 ---");

        // --- 1. ランダムな気温データの生成と配列への格納 ---
        // 以下に実装してください。
        // ヒント：
        // 1. forループを使用して、7回繰り返します。（曜日）
        // 2. ループ内で、気温をランダムに生成し、temperatures[i]に代入
        //    - 気温: random.nextInt(16) + 20; (20～35の範囲)
        // 3. もし生成された気温が15℃未満の場合、その日の予報はスキップし、次の日の処理に進みます。
        //    スキップの際は「〇曜日: 気温が異常なため、予報をスキップします。」と表示し、continue文を使用します。
        // 4. 生成した気温を「〇曜日: XX℃」の形式で表示します。
		for (int i = 0; i < daysOfWeek.length; i++) {
			temperatures[i] = random.nextInt(16) + 20;
			if (temperatures[i] < 15) {
				System.out.println(daysOfWeek[i] + ":気温が異常なため、予報をスキップします。");
				continue;
			}else {
				System.out.println(daysOfWeek[i] + ":" + temperatures[i] + "℃");
			}
		}

        System.out.println("\n--- 気温データの並び替え ---");

        // --- 2. 気温のバブルソート（昇順） ---
        // 1. temperatures配列をバブルソート（昇順）で並び替えます。
        // 2. 外側のforループ（例: int i = 0; i < temperatures.length - 1; i++）
        // 3. 内側のforループ（例: int j = i + 1; j < temperatures.length; j++）を使用
        // 4. 内側のループ内で、temperatures[i]とtemperatures[j]を比較
        //    temperatures[i]がtemperatures[j]より大きい場合に値を交換
        
        // --- 3. ソート後の気温の表示 ---
		
		String sortOrder = "asc";
		String sortOrderDisplay = "昇順";
		
		if (args.length > 0) {
			if (args[0].equals("desc")) {
				sortOrder = "desc";
				sortOrderDisplay = "降順";
			}else if (args[0].equals("asc")) {
				sortOrder = "asc";
				sortOrderDisplay = "昇順";
			}else {
				System.out.println("ソート順が指定されなかったか、無効な値のため、昇順でソートします。");
			}
		}else {
			System.out.println("ソート順が指定されなかったか、無効な値のため、昇順でソートします。");
		}
		System.out.println(sortOrderDisplay + "ソートします。");
		
		boolean swapped;
		
		for (int i = 0; i < temperatures.length-1; i++) {
			swapped = false;
			for (int j = 0; j < temperatures.length-1; j++) {
				if (sortOrder.equals("asc")) {
					if (temperatures[j] > temperatures[j+1]) {
						int temp = temperatures[j];
						temperatures[j] = temperatures[j+1];
						temperatures[j+1] = temp;
						swapped = true;
					}
				}else {
					if (temperatures[j] < temperatures[j+1]) {
						int temp = temperatures[j];
						temperatures[j] = temperatures[j+1];
						temperatures[j+1] = temp;
						swapped = true;
					}
				}
			}
			if (!swapped) {
				break;
			}
		}
		/*		
				if (temperatures[j] > temperatures[j+1]) {
					int temp = temperatures[j];
					temperatures[j] = temperatures[j+1];
					temperatures[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		*/			
        System.out.print("気温（" + sortOrderDisplay + "）：[");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i]);
            if (i < temperatures.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

