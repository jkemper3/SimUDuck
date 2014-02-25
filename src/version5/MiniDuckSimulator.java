package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        CanFlyAndQuackGroup mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        CanQuackGroup rubber = new RubberDuck(new Squeak());
        rubber.display();
        rubber.performQuack();
        rubber.swim();
        
        Duck vehicle = new WisconsinDellsDuck(new FourWheelDrive());
        vehicle.display();
        vehicle.swim();
        vehicle.drive();
        
    }

}
