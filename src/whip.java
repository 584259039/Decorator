
public class whip extends ComdimentDecorator {
	Beverage beverage;
	public  whip (Beverage beverage){
		this.beverage =  beverage;
	}
	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public  double cost(){
		return 0.10+beverage.cost();
}
}