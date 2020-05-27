import duck.behavior.FlyWithWings;
import duck.behavior.Quack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		//super();
		// TODO Auto-generated constructor stub
		setQb(new Quack());
		setFb(new FlyWithWings());
	}
}
