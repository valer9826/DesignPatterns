package StrategyPattern.Models;

import StrategyPattern.Behaviors.FlyWithWings;
import StrategyPattern.Behaviors.Quack;
import StrategyPattern.Entities.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

}
