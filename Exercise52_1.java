class Exercise52_1 {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 20, 3, 12};

        // 小さい順にソートする(昇順ソート)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        
        System.out.println("--- ソート後（小さい順）---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
