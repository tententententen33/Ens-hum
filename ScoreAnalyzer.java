import java.io.File;
import java.util.Scanner;

class ScoreAnalyzer {
	public static void main(String[] args) throws Exception{
		File file = new File("scores.csv");
		Scanner scanner = new Scanner(file);
		
		scanner.useDelimiter(",|\\R");
		while (scanner.hasNext()) {
			int sum = 0;
			int count = 0;
			String data1 = scanner.next();
			while (scanner.hasNextInt()) {
				int data = scanner.nextInt();
				sum += data;
				count++;
			}
			double average = (double)sum / count;
			System.out.printf("%s さんの平均点：%.2f%n",data1,average);
		}
	}
}