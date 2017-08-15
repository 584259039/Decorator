
public class Mocha extends ComdimentDecorator {
Beverage beverage;
	
public  Mocha (Beverage beverage){
	this.beverage =  beverage;
}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription ()+",Mocha";
	}
	public  double cost(){
		return 0.2+beverage.cost();
	}
}
