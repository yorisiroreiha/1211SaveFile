import java.util.* ;
public class AppSet{
	public static void main(String[] args){
		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("red");
		System.out.println("色の種類は"+colors.size()+"です");
	}
}