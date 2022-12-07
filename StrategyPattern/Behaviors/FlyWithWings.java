package StrategyPattern.Behaviors;

import StrategyPattern.Interfaces.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Flying");
    }
}