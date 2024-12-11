import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//totalLeg
        int b = sc.nextInt();//totalhead
        int c = sc.nextInt();//A has leg
        int d = sc.nextInt();//B has leg
        int count = 0 ;
        int c_head = 0 ;
        for( int i = 1 ; i <= b ; i++ ){
            int leg = 0;
            leg = a - (i * c) ;
						System.out.print(leg+":");
            for( int j = 1 ; j <= b ; j++ ){
                int number = leg ;
                number = leg - (j * d) ;
								System.out.print(number+",");
                if( number == 0 ){
                    count++;
                    c_head = i ;
                }else{
                    
                }
            }
				System.out.println();
        }
        if(count == 1){
            int d_head = b - c_head ;
            System.out.printf("%d %d",c_head,d_head);
        }else{
            System.out.println("miss"+count);
        }
    }
}