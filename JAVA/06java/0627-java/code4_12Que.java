public class code4_12{
	public static void main(String[] args){
		
		int[] seq = new int[10];
		for( int i = 0 ; i < seq.length ; i++){
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		for( int i = 0 ; i < seq.length ; i++){
			String word = switch(seq[i]){
				case 0 -> "A";
				case 1 -> "T";
				case 2 -> "C";
				default -> "G";
			};
			System.out.printf("%s",word);
		}
		
	}
}