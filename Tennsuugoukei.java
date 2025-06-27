import java.io.*;

class Tennsuugoukei
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("テストの点数を入力してください。(0で終了)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int i = Integer.parseInt(str);
		
		int sum = 0;
		
		while(i != 0) {
			
			sum += i;
			
			if(i == 0) {
				break;
			}
			
		}
		
		System.out.println("合計点は" + sum + "点です。");
	}
}