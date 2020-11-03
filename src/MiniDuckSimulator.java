import Flying.FlyWithWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();


        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
    }

    }


