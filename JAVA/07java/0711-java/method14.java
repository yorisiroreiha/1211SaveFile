import java.util.*;
public class method14{
	public static void main(String[] args){
		int[] number = makeArray(2,4) ;
		int[] list = makeArray(2,-1) ;
		int[] test = makeArray(4,-2) ;
		System.out.println(Arrays.toString(number));//
		System.out.println(Arrays.toString(list));//
		System.out.println(Arrays.toString(test));
	}
	public static int[] makeArray(int start,int end){
		int[] made;
		if( start == end ){
			made = new int[1] ;
			made[1] = start ;
		}else if( start > end ){
			made = new int[start-end+1] ;
			for( int i = 0 ; i < made.length ; i++ ){
				made[i] = start ;
				start-- ;
			}
		}else{
			made = new int[end-start+1] ;
			for( int i = 0 ; i < made.length ; i++ ){
				made[i] = start ;
				start++ ;
			}
		}
		return made ;
	}
}