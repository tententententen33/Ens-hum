class Ens59_1 {
	public static void main(String[] args) {
		int[][] studentGrades = {{85,90},{70,60,95},{92},{80,75,88,93}};
		
		System.out.println("--- 学生の科目別成績集計 ---");
		System.out.println();
		for (int i = 0; i < studentGrades.length; i++) {
			int sum = 0;
			System.out.println("学生:" + (i + 1));
			
			for (int j = 0; j < studentGrades[i].length; j++) {
				sum += studentGrades[i][j];
			}
			
			double average = (double)sum / studentGrades[i].length;
			System.out.println("　受講科目数:" + studentGrades[i].length + "科目");
			System.out.println("　合計点:" + sum);
			System.out.printf("　平均点:%.2f",average);
			System.out.println();
			System.out.println();
		}
	}
}