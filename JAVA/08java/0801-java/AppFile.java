import java.io.*;
import java.util.* ;
public class AppFile{
	public static void main(String[] args){
		FileWriter fw = null ;
		try{
			fw = new FileWriter("data.txt");
			fw.write("Hello");
		}catch(IOException e){
			System.out.println("error:IOException");
		}finally{
			if( fw != null ){
				try{
					fw.close();
				}catch(IOException e){
					System.out.println("error:App can not close");
				}
			}
		}
		System.out.println("App end");
	}
}