package org.varun.designPatterns.Observer.impl;

import org.varun.designPatterns.Observer.intf.Observer;

public class SomeOtherScreen implements Observer<WeatherData> {
    @Override
    public void update(WeatherData data) {
        System.out.printf("[Some Other Screen] temperature is %f, humidity is %f, pressure is %f\n", data.temperature(), data.humidity(), data.pressure());

    }
}
