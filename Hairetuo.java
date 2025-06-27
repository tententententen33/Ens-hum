import java.io.*;

class Hairetuo {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("テストの受験者数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] test = new int[num];
		
		System.out.println(num + "人の点数を入力してください。");
		
		for(int i=0; i<num; i++) {
			test[i] = Integer.parseInt(br.readLine());
		}
		
		for(int s=0; s<num; s++) {
			for(int t=s+1; t<num; t++) {
				if(test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int j=0; j<num; j++) {
			System.out.println( (j+1) + "番目の人の点数は" + test[j] + "です。");
		}
	}
}