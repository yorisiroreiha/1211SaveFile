import java.util.* ;
public class AppEat{
	public static void main(String[] args){
		String dataCSV ="タコ,イクラ,マグロ,トロ,イクラ,ウニ,ホタテ,マグロ,トロ,マグロ,エビ,イカ";
		String[] ateData = dataCSV.split(",");
		Set<String> menu = new LinkedHashSet<>();
		for( int i = 0 ; i < ateData.length ; i++ ){
			System.out.println(ateData[i]);
			menu.add(ateData[i]);
		}
		System.out.println(menu);
	}
}