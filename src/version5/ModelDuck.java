package version5;

public class ModelDuck implements Duck {

    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
    @Override
    public void swim() {
        System.out.println("I float");
    }
}