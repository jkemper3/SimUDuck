package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        CanFlyAndQuackGroup mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.smiw();

        CanQuackGroup rubber = new RubberDuck(new Squeak());
        rubber.display();
        rubber.performQuack();
        rubber.smiw();
        
        
    }

}
