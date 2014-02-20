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
public interface CanNotFlyorQuackGroup extends Duck{

   public abstract void performFly();
   public abstract void setFlyBehavior(FlyStrategy fly);
   public abstract void performQuack();
   public abstract void setQuackBehavior(QuackStrategy quack);
   
}