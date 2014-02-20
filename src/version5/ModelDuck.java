package version5;

public class ModelDuck extends Duck {

    public ModelDuck(FlyStrategy flyBehavior, QuackStrategy quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

   

	
    @Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
