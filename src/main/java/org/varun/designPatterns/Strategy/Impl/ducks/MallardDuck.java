package org.varun.designPatterns.Strategy.Impl.ducks;

import org.varun.designPatterns.Strategy.Impl.Duck;
import org.varun.designPatterns.Strategy.Impl.strategies.flyingStrategies.FlyWithWings;
import org.varun.designPatterns.Strategy.Impl.strategies.quackStrategies.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyStrategy = new FlyWithWings();
        quackStrategy = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
