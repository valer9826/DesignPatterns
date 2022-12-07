package StrategyPattern.Entities;

import StrategyPattern.Interfaces.IQuackBehavior;
import StrategyPattern.Interfaces.IFlyBehavior;

public abstract class Duck {
    public IQuackBehavior quackBehavior;
    public IFlyBehavior flyBehavior;

    public void display(String type) {
        System.out.println("Im a " + type);
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
