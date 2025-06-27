import java.io.*;

class Tenaosi
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("テストの点数を入力してください。(0で終了)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		double average = 0;
		double kaisu = 0;
		double hyoujun = 0;
		int tokuten = 0;
		sum = sum + tokuten;

		do {
			tokuten = Integer.parseInt(br.readLine());
			if(tokuten > 0){
				sum = sum + tokuten;
				kaisu++;
			}else{
				System.out.println("整数を入力してください。");
			}
		}while(tokuten != 0);
		
		average = sum / kaisu;

		System.out.println("合計点は" + sum + "点です。");
		System.out.println(String.format("平均点は%.1f点です。",average));
	}
}