
public class Mocha extends ComdimentDecorator {
Beverage beverage;
	
public  Mocha(Beverage beverage){
	this.beverage =  beverage;
}

	@Override
	public String getDescription1() {

		return beverage.getDescription1()+",Mocha";
	}
	public  double cost(){
		return 0.2+beverage.cost();
	}
}
