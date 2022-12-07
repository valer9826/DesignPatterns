package StrategyPattern.Models;

import StrategyPattern.Behaviors.FlyNoWay;
import StrategyPattern.Behaviors.Quack;
import StrategyPattern.Entities.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

}
