/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5;

/**
 *
 * @author jkemper3
 */
public class FlyAndQuackGroup implements FlyStrategy, QuackStrategy{

    FlyStrategy flyBehavior;
    QuackStrategy quackBehavior;

    public FlyAndQuackGroup(FlyStrategy flyBehavior, QuackStrategy quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    @Override
    public void fly() {
       
    }

    @Override
    public void quack() {
       
    }
}
