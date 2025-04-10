package org.varun.designPatterns.Strategy.Impl.strategies.flyingStrategies;

import org.varun.designPatterns.Strategy.Intf.FlyStrategy;

public class NoFlying implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("Sorry I can't fly...");
    }
}
