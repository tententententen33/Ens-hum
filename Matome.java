import java.io.*;

class Matome {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("テストの受験者数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] test = new int[num];
		int tokuten = 0;
		int sum = 0;
		double kaisu = 0;
		double average = 0;
		
		System.out.println(num + "人の点数を入力してください。");
		
		do {
			tokuten = Integer.parseInt(br.readLine());
			if(tokuten > 0) {
				sum = sum + tokuten;
				kaisu++;
			}else{
				System.out.println("整数を入力してください。");
			}
		}while(kaisu < num);
		
		average = sum / kaisu;
		
		System.out.println("合計点は" + sum + "です。");
		System.out.println(String.format("平均点は%.1f点です。",average));
	}
}
		