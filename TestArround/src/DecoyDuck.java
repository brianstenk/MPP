import duck.behavior.CannotFly;
import duck.behavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		super();
		// TODO Auto-generated constructor stub
		setQb(new MuteQuack());
		setFb(new CannotFly());
	}

}
