public class AppAnimal{
	public static void main(String[] args){
		Animal animalDog = new Dog() ;
		if( animalDog instanceof Dog dog ){
			dog.bark() ;
		}else{
			System.out.println(" Error : animalDog is not dog ");
		}
	}
}
//成功条件はanimalDogがDog型で初期化されていること
//失敗条件はanimalDogがDog型以外で初期化されていること例えばAnimal型とか作ってないけどCat型とか