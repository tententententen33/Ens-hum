class FruitCounter {
	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Orange", "Apple", "Grape", "Apple", "Banana"};
		int appleCount = 0;
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("Apple")) {
				appleCount++;
			}
		}
		
		System.out.println("Appleの数:" + appleCount);
	}
}