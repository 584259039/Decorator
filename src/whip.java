
public class whip extends ComdimentDecorator {
	Beverage beverage;
	public  whip(Beverage beverage){
		this.beverage =  beverage;
	}
	@Override
	public String getDescription1() {
	
		return beverage.getDescription1()+",whip";
	}
	public  double cost(){
		return 0.10+beverage.cost();
}
}