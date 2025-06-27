class ReMain {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 2; i++) {
			while (count <= i) {
				System.out.println("Count:" + count);
				count++;
			}
		}
	}
}