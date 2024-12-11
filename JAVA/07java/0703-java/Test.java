import java.util.*;
public class Test{
	public static void main(String[] args){
		
		int[][] number = new int[2][] ;
		//これだと外側の箱にしか配列を用意しない
		//{{},{}}←感覚これ
		number[0] = new int[5] ;
		//これで最初の{}に箱が作られる
		//{{,,,,},{}}←感覚これ
		number[1] = new int[]{10,9,11,39} ;
		//これで後ろの箱が作られてさらに数字が入れられる
		//{{,,,,},{10,9,11,39}}←感覚これ
		for( int[] nakami : number ){
			//たぶんこれでnumberの箱分{}←に入ってる{}の数分実行する
			//
			System.out.println(Arrays.toString(nakami));
		}
	}
}