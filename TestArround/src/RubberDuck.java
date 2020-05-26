import duck.behavior.CannotFly;
import duck.behavior.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super();
		// TODO Auto-generated constructor stub
		setQb(new Squeak());
		setFb(new CannotFly());
	}

}
