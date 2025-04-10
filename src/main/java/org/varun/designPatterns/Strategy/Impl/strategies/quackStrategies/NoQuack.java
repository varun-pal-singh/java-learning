package org.varun.designPatterns.Strategy.Impl.strategies.quackStrategies;

import org.varun.designPatterns.Strategy.Intf.QuackStrategy;

public class NoQuack implements QuackStrategy {
    @Override
    public void quark() {
        System.out.println("Silence...");
    }
}
