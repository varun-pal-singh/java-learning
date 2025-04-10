package org.varun.designPatterns.Strategy;

import org.varun.designPatterns.Strategy.Impl.Duck;
import org.varun.designPatterns.Strategy.Impl.ducks.MallardDuck;
import org.varun.designPatterns.Strategy.Impl.ducks.PlasticDuck;
import org.varun.designPatterns.Strategy.Impl.strategies.flyingStrategies.LowFlying;
import org.varun.designPatterns.Strategy.Impl.strategies.quackStrategies.LoudQuack;

public class Main {
    public static void main(String[] args) {
        Duck plasticDuck = new PlasticDuck();

        plasticDuck.display();
        plasticDuck.fly();
        plasticDuck.quack();
        plasticDuck.swim();
        plasticDuck.setQuake(new LoudQuack());
        plasticDuck.quack();

        System.out.println();

        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        plasticDuck.swim();
        mallardDuck.setFly(new LowFlying());
        mallardDuck.fly();
    }
}
