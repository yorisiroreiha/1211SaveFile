public interface SolodFigure{
	String displayAreaInfo();
}
class Cube implements SolodFigure{
	double len;
	public Cube(double len){
		this.len = len ;
	}
	public String displayAreaInfo(){
		double volume = Math.pow(this.len,3) ;
		double surface = Math.pow(this.len,2)*6 ;
		return String.format("立方体の１辺の長さ:%.2f、体積:%.2f表面積%.2f",this.len,volume,surface);
	}
}
class Sphere implements SolodFigure{
	double radius;
	public Sphere(double radius){
		this.radius = radius ;
	}
	public String displayAreaInfo(){
		double volume = Math.pow(this.radius,3) * 4 / 3 * Math.PI ;
		double surface = Math.pow(this.radius,2) * 4 * Math.PI ;
		return String.format("球 半径= %.2f  体積 = %.2f  表面積= %.2f",this.radius,volume,surface);
	}
}