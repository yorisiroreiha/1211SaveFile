import java.util.*;
import java.io.*;
public class AppToDo{
	static Scanner sca = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		ArrayList<ToDo> list = new ArrayList<>();
		int select = 0 ;
		while(select != 4 ){
			if( list.size() == 0 ){				System.out.println("Todoは1件もありません。");			}
			System.out.println("--操作を入力してください。--");
			System.out.print("1/登録 2/重要度変更 3/削除 4/終了>");
			select = sca.nextInt();/*Line消し*/sca.nextLine();
			switch(select){
				case 1 :
					registration(list);
					break;
				case 2 :
					overWriteImportance(list);
					break;
				case 3 :
					deleteToDo(list);
					break;
				default :
					break;
			}
			showAllToDo(list);
		}
		System.out.println("アプリケーションを終了します。");
	}
	/*生み出すよ*/
	public static void registration(ArrayList<ToDo> list){
		System.out.println("新規Todoを作成します。");
		System.out.print("Todo内容を入力してください>");
		String schedule = sca.nextLine();
		System.out.print("重要度を1~10(最大)で入力してください>");
		int importance = sca.nextInt();/*Line消し*/sca.nextLine();
		ToDo td = new ToDo(schedule,importance);
		list.add(td);
		System.out.println("1件追加しました。");
	}
	/*書き換えるよ*/
	public static void overWriteImportance(ArrayList<ToDo> list){
		System.out.printf("重要度を変更します。番号を入力してください。0~%d>",list.size());
		int target = sca.nextInt();/*Line消し*/sca.nextLine();
		System.out.print("重要度を再設定してください。>");
		int overWrite = sca.nextInt();/*Line消し*/sca.nextLine();
		list.get(target).setImportance(overWrite);
		System.out.println("重要度を変更しました。");
	}
	/*消すよ*/
	public static void deleteToDo(ArrayList<ToDo> list){
		System.out.printf("Todoを削除します。番号を入力してください。0~%d>",list.size());
		int target = sca.nextInt();/*Line消し*/sca.nextLine();
		list.remove(target);
		System.out.println("1件削除しました。");
	}
	/*全部表示するよ*/
	public static void showAllToDo(ArrayList<ToDo> list){
		Collections.sort(list,(l1,l2) -> -(l1.getImportance() - l2.getImportance()) );
		for( int i = 0 ; i < list.size() ; i++ ){
			System.out.printf("%d%s%n",i,list.get(i).display());
		}
	}
}
//Object
class ToDo{
	private String schedule;
	private int importance;
	public ToDo(String schedule,int importance){
		this.schedule = schedule ;
		this.importance = importance ;
	}
	public String display(){		return String.format("・・・%s/重要度:%d",this.schedule,this.importance);}
	public void setImportance(int importance){		this.importance = importance ;	}
	public int getImportance(){		return this.importance ;	}
}