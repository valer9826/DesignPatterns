package StrategyPattern.Behaviors;

import StrategyPattern.Interfaces.IQuackBehavior;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("Quack");
    }
}
