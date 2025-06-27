/*
  No: 1525017
  Name: 椙山天斗
*/
/*
	前に順番を変えてしまったため、削除う機能が”４”、
	今日の目標を設定が”５”、今日の目標を確認するが”６”になっています。
	チェックがやりにくくなってしまうと思います。申し訳ありません。
*/
import java.util.Scanner;

class ConsoleTodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Shift_JIS");
        int choice;
    
        int maxTodos = 5;

        String[] todos = new String[maxTodos];
        boolean[] todoStatuses = new boolean[maxTodos];

        int nextTodoIndex = 0;

        int maxGoals = 3;
        String[] goals = new String[maxGoals];
        int nextGoalIndex = 0;

        System.out.println("ToDoアプリへようこそ!");
        do{
            System.out.println("\n=== メニュー ===");
            System.out.println("1. ToDoを登録");
            System.out.println("2. ToDoを完了");
            System.out.println("3. ToDoを確認");
            System.out.println("4. ToDoを削除");
            System.out.println("5. 今日の目標を設定");
            System.out.println("6. 今日の目標を確認する");
			System.out.println("7. 終了");
            System.out.print("番号を選択してください (1-7)");

            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine(); 
                
                
                switch(choice){
                    case 1 -> {
                        if(nextTodoIndex < maxTodos){
                            System.out.print("登録するToDoを入力してください:");
                            String newTodo = scanner.nextLine();

                            todos[nextTodoIndex] = newTodo;
                            todoStatuses[nextTodoIndex] = false;
                            System.out.println("ToDo「" + newTodo + "」を登録しました。");
                            nextTodoIndex++;
                        }else{
                            System.out.println("ToDoリストがいっぱいです。これ以上登録できません。");
                        }
                    }
                    case 2 -> { 
                        if (nextTodoIndex == 0) {
                            System.out.println("ToDoが登録されていません。\n完了にするToDoがありません。");
                        } else {
                            System.out.println("\n--- 完了するToDoを選択してください ---");
                            for (int i = 0; i < nextTodoIndex; i++) {
                                System.out.println((i + 1) + ". " + todos[i] + (todoStatuses[i] ? " (完了済み)" : " (未完了)"));
                            }
                            System.out.print("完了にするToDoの番号を入力してください (1-" + nextTodoIndex + "): ");
                            if (scanner.hasNextInt()) {
                                int inputNum = scanner.nextInt();
                                scanner.nextLine();

                                if (inputNum > 0 && inputNum <= nextTodoIndex) {
                                    int targetIndex = inputNum - 1;

                                    if (!todoStatuses[targetIndex]) { 
                                        todoStatuses[targetIndex] = true;
                                        System.out.println("ToDo「" + todos[targetIndex] + "」を完了にしました！");
                                    } else {
                                        System.out.println("ToDo「" + todos[targetIndex] + "」は既に完了済みです。");
                                    }
                                } else {
                                    System.out.println("無効な番号です。1から" + nextTodoIndex + "の間で入力してください。");
                                }

                            } else {
                                System.out.println("番号を数字で入力してください。");
                                scanner.nextLine();
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("\n=== 今日のToDo一覧 ===");
                        if(nextTodoIndex == 0){
                            System.out.println("今日のToDoは登録されていません。");
                        }else{
                            for(int i = 0; i < nextTodoIndex; i++){
                                String status = todoStatuses[i] ? "完了" : "未完了";
                                System.out.println((i+1) + ". " + todos[i] + " (" + status + ")");
                            }
                        }
                        System.out.println("---------------------");
                    }
					case 4 -> {
						if (nextTodoIndex == 0) {
							System.out.println("削除するToDoは登録されていません。");
						} else {
							System.out.println("\n--- 削除するToDoを選択してください。 ---");
							System.out.println("\n--- 登録済みToDo一覧 ---");
							for (int i = 0; i < nextTodoIndex; i++) {
								System.out.println((i + 1) + ". " + todos[i] + (todoStatuses[i] ? " (完了)" : " (未完了)"));
							}

							System.out.print("削除するToDoの番号を入力してください (1-" + nextTodoIndex + "): ");
							if (scanner.hasNextInt()) {
								int deleteIndex = scanner.nextInt() - 1;
								scanner.nextLine(); 

								if (deleteIndex >= 0 && deleteIndex < nextTodoIndex) {
									String deletedTodo = todos[deleteIndex];

									for (int i = deleteIndex; i < nextTodoIndex - 1; i++) {
										todos[i] = todos[i + 1];
										todoStatuses[i] = todoStatuses[i + 1];
									}

									todos[nextTodoIndex - 1] = null;
									todoStatuses[nextTodoIndex - 1] = false;
									nextTodoIndex--;

									System.out.println("ToDo「" + deletedTodo + "」を削除しました。");
								} else {
									System.out.println("選択したToDoがありません");
								}
							} else {
								System.out.println("数字を入力してください。");
								System.out.println("数字を入力されなかったため、メニューに戻ります");
								scanner.nextLine(); 
							}
						}
					}
					case 5 -> { 
                        if (nextGoalIndex < maxGoals) {
                            System.out.print("設定する目標を入力してください: ");
                            String newGoal = scanner.nextLine();
                            goals[nextGoalIndex] = newGoal;
                            System.out.println("目標「" + goals[nextGoalIndex] + "」を設定しました。");
                            nextGoalIndex++;
                        } else {
                            System.out.println("目標リストがいっぱいです。これ以上設定できません。(" + maxGoals + "個まで)");
                        }
                    }
					case 6 -> { 
                        System.out.println("\n--- 今日の目標一覧 ---");
                        if (nextGoalIndex == 0) { 
                            System.out.println("今日の目標は設定されていません。");
                        } else {
                               for (int i = 0; i < nextGoalIndex; i++) { 
									System.out.println((i + 1) + ". " + goals[i]);
                                }
                        }
                        System.out.println("--------------------");
                    }
                    case 7 -> { 
                        System.out.println("終了処理中...");
                    }
                    default -> { 
                        System.out.println("無効な選択です。メニューの番号を入力してください。");
                    }
                    
                }
                
                
            }else { 
                System.out.println("数字でメニュー番号を入力してください。");
                scanner.nextLine(); 
                choice = 0; 

            }


        } while (choice != 7);

        System.out.println("アプリを終了します。");
        System.out.println("ご利用ありがとうございました。");
        System.out.println("プログラムを終了しました。");
		scanner.close();
    }
}
