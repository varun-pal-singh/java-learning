package org.varun.designPatterns.Strategy.Impl;

import org.varun.designPatterns.Strategy.Intf.FlyStrategy;
import org.varun.designPatterns.Strategy.Intf.QuackStrategy;

public abstract class Duck {
    protected FlyStrategy flyStrategy;
    protected QuackStrategy quackStrategy;

    public Duck(){}

    public void setFly(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setQuake(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    public void fly(){
        flyStrategy.fly();
    }

    public abstract void display();

    public void quack() {
        quackStrategy.quark();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
