class RestaurantOrderCheck {
    public static void main(String[] args) {
        boolean isOrder = true;
        int menu = 2;
        boolean addDrink = true;

        if (isOrder) {
            if (menu == 1) {
                System.out.println("ステーキを注文しました");
            } else if (menu == 2) {
                System.out.println("パスタを注文しました");
            } else if (menu == 3) {
                System.out.println("サラダを注文しました");
			} else if (menu == 4) {
                System.out.println("ステーキとパスタを注文しました。");
            } else if (menu == 5) {
                System.out.println("パスタとサラダを注文しました");
            } else if (menu == 6) {
                System.out.println("ステーキとサラダを注文しました");
            } else if (menu == 7) {
                System.out.println("ステーキとパスタとサラダを注文しました");
            }
                System.out.println("無効なメニューです");
            }

            if (addDrink) {
                System.out.println("ドリンクも追加されました");
            }
        } else {
            System.out.println("注文はありません");
        }
    }
}
