package version5;

public class RubberDuck extends Duck {

    FlyStrategy flyBehavior;
    QuackStrategy quackBehavior;

    public RubberDuck(FlyStrategy flyBehavior, QuackStrategy quackBehavior) {
        super(flyBehavior, quackBehavior);
    }


    public void setFlyBehavior(FlyStrategy flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackStrategy quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

   

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
