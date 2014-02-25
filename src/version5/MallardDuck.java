package version5;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */
public class MallardDuck implements CanFlyAndQuackGroup{

    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;


    public MallardDuck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }
    
    @Override
    public void performFly() {
       flyStrategy.fly();
    }

    @Override
    public void setFlyBehavior(FlyStrategy fly) {
       this.flyStrategy = flyStrategy;
    }
   
    @Override
    public void setQuackBehavior(QuackStrategy quack) {
        this.quackStrategy = quackStrategy;
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
    @Override
    public void swim() {
        System.out.println("I am Swiming");
    }

    @Override
    public void performQuack() {
        quackStrategy.quack();
    }

}