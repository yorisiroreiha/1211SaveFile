import java.util.*;
public class AppSouvenir{
	public static void main(String[] args){
		Map<String,List<String>> data = new HashMap<>();
		List<String> tokyoItems=new ArrayList<>();
		tokyoItems.add("切子");
		tokyoItems.add("佃煮");
		tokyoItems.add("寿司");
		tokyoItems.add("のり");
		data.put("東京",tokyoItems);
		List<String> kyotoItems=new ArrayList<>();
		kyotoItems.add("織物");
		kyotoItems.add("人形");
		kyotoItems.add("漬物");
		kyotoItems.add("陶器");
		data.put("京都",kyotoItems);
		
		for(String key : data.keySet()){
			System.out.printf("%s:%s%n",key,data.get(key));
		}
	}
}