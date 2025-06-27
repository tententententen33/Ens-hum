/*
  No: 1525017
  Name: 椙山天斗
*/
class PriceCalculator {
	public static void main(String[] args) {
		double[] regularPrice = {1000.0, 1500.0, 2000.0};
		double[] discountedPrices = new double[3];
		for (int i = 0;i < regularPrice.length;i++) {
			discountedPrices[i] = regularPrice[i] * 0.9;
		}
		System.out.println("--- 商品価格一覧 ---");
		for (int j = 0;j < regularPrice.length;j++) {
			System.out.println("商品" + j + 1 + "：定価" + regularPrice[j] + "円," + "割引価格" + discountedPrices[j] + "円");
		}
	}
}