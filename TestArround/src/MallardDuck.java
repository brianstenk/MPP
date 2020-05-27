import duck.behavior.FlyWithWings;
import duck.behavior.Quack;

public class MallardDuck extends Duck {

	
	public MallardDuck() {
		//super();
		// TODO Auto-generated constructor stub
		setQb(new Quack());
		setFb(new FlyWithWings());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
		
	}

}
