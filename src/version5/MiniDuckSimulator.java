package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        FlyAndQuackGroup mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

//		mallard.performFly();
//                mallard.setFlyBehavior(new FlyRocketPowered());
//                mallard.setQuackBehavior(new Squeak());
//		Duck model = new ModelDuck();
//		model.display();
//		model.performFly();
//		model.setFlyBehavior( new FlyRocketPowered() );
//		model.performFly();
    }

}
