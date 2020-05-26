package duck.behavior;
import duck.IBehavior.FlyBehavior;

public class CannotFly implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Can not Fly");
		
	}
	
}
