
import java.util.Arrays;

public class Check {
	//引数として最初の値と最後の値を受け取り、その範囲を要素とする配列を返却するメソッド
	static int[] mekeArrFirstToLast(int first,int last){
		//絶対値を使って要素数をもとめ配列をnewする。
		int[] retArr=new int[Math.abs(first-last)+1];
		for(int i=0;i<retArr.length;i++){
			retArr[i]=first<last ? first++:first--;
		}
		return retArr;
	}

	public static void main(String[] args) {
		int[] arr=mekeArrFirstToLast(3,3);
		System.out.println(Arrays.toString(arr));
	}
}
