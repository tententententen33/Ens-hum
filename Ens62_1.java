class Ens62_1 {
	public static void main(String[] args) {
		int[][] students = {
			{90,85,88},
			{70,60,65},
			{50,45,55}
		};
		for (int i = 0; i < students.length; i++) {
			int sum = 0;
			double average = 0;
			for (int j = 0; j < students[i].length; j++) {
				sum += students[i][j];
			}
			average = (double)sum / students[i].length;
			System.out.println("学生" + (i+1) + "の平均点：" + (int)average);
		}
	}
}