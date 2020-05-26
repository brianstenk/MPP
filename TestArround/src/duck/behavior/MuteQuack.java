package duck.behavior;
import duck.IBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Can not quack");
		
	}
	
}
