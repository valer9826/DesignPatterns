package StrategyPattern;

import StrategyPattern.Models.MallardDuck;
import StrategyPattern.Models.ModelDuck;
import StrategyPattern.Behaviors.FlyRocketPowered;
import StrategyPattern.Entities.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display("MallardDuck");
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display("ModelDuck");
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
