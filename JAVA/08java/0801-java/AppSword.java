import java.util.* ;
import java.io.* ;
public class AppSword{
	public static void main(String[] args) throws Exception{
		ArrayList<Sword> list = new ArrayList<>();
		try(
			FileInputStream fis = new FileInputStream("swordData.csv");
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr);
		){
			String line;
			while((line = br.readLine()) != null){
				String[] data = line.split(",");
				String name = data[0];
				int power = Integer.parseInt(data[1]);
				int price = Integer.parseInt(data[2]);
				list.add(new Sword(name,power,price));
			}
			for(Sword s : list){
				System.out.println(s);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		try(
			FileOutputStream fos = new FileOutputStream("swordData.csv");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
		){
			for(Sword s : list){
				bw.write(s.toString());
				bw.newLine();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
class Sword{
	String name;
	int power;
	int price;
	Sword(String name,int power,int price){
		this.name=name;
		this.power=power;
		this.price=price;
	}
	@Override
	public String toString(){
		return String.format("武器名:%s 攻撃力:%d 価格:%d",this.name,this.power,this.price); 
	}
}