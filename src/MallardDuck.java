import Quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        //flyBehavior = new Flying.FlyWithWings();
    }
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}