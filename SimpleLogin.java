/*
  No: 1525017
  Name: 椙山天斗
*/
class SimpleLogin {
    public static void main(String[] args) {
        // 許可されたユーザー名とパスワードのリスト
        String[] userNames = {"admin", "user1", "guest"};
        String[] passWords = {"pass123", "abcde", "password"};
		
		if (args.length < 2) {
			System.out.println("エラー: ユーザー名とパスワードを引数で指定してください。");
			System.out.println("使用方法: java SimpleLogin <ユーザー名> <パスワード>");
			return;
		}


// ここでArrayIndexOutOfBoundsExceptionの可能性あり
        String inputUsername = args[0]; 
        String inputPassword = args[1]; 

        boolean loggedIn = false;

        for (int i = 0; i < userNames.length; i++) {
			if (inputUsername.equals(userNames[i]) && inputPassword.equals(passWords[i])) {
					loggedIn = true;
					break;
			}
		}

        if (loggedIn) {
            System.out.println("ログイン成功！ようこそ、" + inputUsername + "さん！");
        } else {
            System.out.println("ログイン失敗。ユーザー名またはパスワードが正しくありません。");
        }
    }
}
