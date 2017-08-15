
public class Soy extends ComdimentDecorator {
	Beverage beverage;
	public  Soy (Beverage beverage){
		this.beverage =  beverage;
	}
	@Override
	public String getDescription1() {
		// TODO Auto-generated method stub
		return beverage.getDescription1()+",Soy";
	}
	public  double cost(){
		return 0.15+beverage.cost();
}
}