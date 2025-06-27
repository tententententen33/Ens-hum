class Ens55_1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("3と4の最小公倍数は" + i);
				break;
			}
			System.out.println(i + "は最小公倍数ではありません。");
		}
	}
}