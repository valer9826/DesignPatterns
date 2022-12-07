package StrategyPattern.Behaviors;

import StrategyPattern.Interfaces.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Im flying with a rocket");
    }
}
