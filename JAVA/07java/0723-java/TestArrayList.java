import java.util.*;
public class TestArrayList{
	public static void main(String[] args){
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(3);
		num.add(9);
		num.add(5);
		System.out.println(num);
		num.add(2,2);
		System.out.println(num);
		if( num.contains(9) ){
			System.out.println("Ok");
		}
		num.remove(0);
		System.out.println(num);
		//最初に特定の要素が出てくる順番を表示
		System.out.println(num.indexOf(5));
		/*num.clear();*/
		Collections.sort(num);
		System.out.println(num);
	}
}