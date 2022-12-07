package StrategyPattern.Behaviors;

import StrategyPattern.Interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("I cant fly");
    }
}
