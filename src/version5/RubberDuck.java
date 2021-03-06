package version5;

public class RubberDuck implements CanQuackGroup {

    private QuackStrategy quackStrategy;

    public RubberDuck(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    public void setQuackBehavior(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }


    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

    @Override
    public void performQuack() {
        quackStrategy.quack();
                }
    @Override
    public void swim() {
        System.out.println("I am a rubber duck, I float");
    }

    

}
