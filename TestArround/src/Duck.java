import duck.IBehavior.FlyBehavior;
import duck.IBehavior.QuackBehavior;

public class Duck {

	FlyBehavior fb;
	QuackBehavior qb;

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying");
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		fb.fly();
		
	}
	
	public void quack() {
		qb.quack();
	}

	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Swimming");
		
	}
	
	public void setFb(FlyBehavior fb) {
		this.fb = fb;
	} 

	public void setQb(QuackBehavior qb) {
		this.qb = qb;
	}

}
