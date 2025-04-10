package org.varun.designPatterns.Strategy.Impl.strategies.flyingStrategies;

import org.varun.designPatterns.Strategy.Intf.FlyStrategy;

public class LowFlying implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("Low flying!!");
    }
}
