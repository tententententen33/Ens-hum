/*
  No: 1525017
  Name: 椙山天斗
*/
class Average {
	public static void main(String[] args) {
		System.out.println("数学・国語・英語の点数を計算します。");
		int math = Integer.parseInt(args[0]);
		System.out.println("数学の点数	" + math);
		int japanese = Integer.parseInt(args[1]);
		System.out.println("国語の点数	" + japanese);
		int english = Integer.parseInt(args[2]);
		System.out.println("英語の点数	" + english);
		double average = (double)((math + japanese + english) / 3.0);
		System.out.println("3教科の平均点 :" + average);
	}
}	