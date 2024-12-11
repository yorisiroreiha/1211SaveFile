public class ArrLesson02{
	public static void main(String[] args){
		
		int[] data;
		data = new int[5];
		System.out.println(data[0]);
		System.out.println(data.length);
		data[0] = 100 ;
		//data[4] = 150 ;
		data[data.length-1] = 150 ;
		data[2] = 120 ;
		data[1] = data[1] - data[0] ;
		System.out.println(data[1]);
		
	}
}