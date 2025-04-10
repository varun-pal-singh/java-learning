package org.varun.designPatterns.Strategy.Impl.ducks;

import org.varun.designPatterns.Strategy.Impl.Duck;
import org.varun.designPatterns.Strategy.Impl.strategies.flyingStrategies.NoFlying;
import org.varun.designPatterns.Strategy.Impl.strategies.quackStrategies.NoQuack;

public class PlasticDuck extends Duck {

    public PlasticDuck() {
        flyStrategy = new NoFlying();
        quackStrategy = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("Plastic duck...");
    }
}
