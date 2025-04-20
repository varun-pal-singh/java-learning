package org.varun.designPatterns.Observer;

import org.varun.designPatterns.Observer.impl.MobileObserver;
import org.varun.designPatterns.Observer.impl.SomeOtherScreen;
import org.varun.designPatterns.Observer.impl.WeatherData;
import org.varun.designPatterns.Observer.impl.WeatherStation;
import org.varun.designPatterns.Observer.intf.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer<WeatherData> mobileObserver = new MobileObserver();
        Observer<WeatherData> someOtherObserver = new SomeOtherScreen();

        weatherStation.register(mobileObserver);
        weatherStation.register(someOtherObserver);

        weatherStation.setMeasurements(1, 2, 3);
        weatherStation.setMeasurements(2, 23, 5);
    }
}
