import java.util.* ;
public class AppMap{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<>();
		map.put("月", "Lunes(ルネス)");
		map.put("火", "Martes(マルテス)");
		map.put("水", "Miercoles(ミエルコレス)");
		map.put("木", "Jueves(フエベス)");
		map.put("金", "Viernes(ビエルネス)");
		map.put("土", "Sabado(サバド)");
		map.put("日", "Domingo(ドミンゴ)");
		while(true){
			System.out.println("月-日まで入力＞＞");
			String key = new Scanner(System.in).next();
			if( map.containsKey(key) ){
				System.out.printf("%sは%sです",key,map.get(key));
			}else{
				break;
			}
		}
	}
}