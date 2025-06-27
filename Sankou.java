import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Sankou {
	public static void main(String[] args) throws IOException {
		
		System.out.println("数字を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		double sum = 0;
		sum += Double.parseDouble(str1);
		sum += Double.parseDouble(str2);
		sum += Double.parseDouble(str3);

		// BigDecimal にしてスケール4で切り捨て
		BigDecimal bd = new BigDecimal(sum);
		bd = bd.setScale(4, RoundingMode.DOWN);

		System.out.println("3つの数の合計（小数点以下4桁で切り捨て）は " + bd.toPlainString() + " です。");
	}
}
