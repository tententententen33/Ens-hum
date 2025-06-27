/*
  No: 1525017
  Name: 椙山天斗
*/
class SummarizeNumbers {
	public static void main(String[] args) {
		if ( args.length == 0) {
			System.out.println("数値を1つ以上入力してください。");
			System.exit(1);
		}
		double sum = 0;
		
		for ( int i = 0; i < args.length; i++) {
		double num = Double.parseDouble(args[i]);
		sum += num;
		}
		double average = sum / args.length;
		System.out.printf("合計: %.2f%n",sum);
		System.out.printf("合計: %.2f%n",average);
	}
}