package org.varun.designPatterns.Observer.impl;

import org.varun.designPatterns.Observer.intf.Observable;
import org.varun.designPatterns.Observer.intf.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable<WeatherData> {
    List<Observer<WeatherData>> observers;
    float temperature, humidity, pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        temperature = 0f;
        humidity = 0f;
        pressure = 0f;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure    = pressure;
        this.humidity    = humidity;
        notifyObservers(new WeatherData(temperature, humidity, pressure));
    }

    @Override
    public void register(Observer<WeatherData> ob) {
        observers.add(ob);
    }

    @Override
    public void unregister(Observer<WeatherData> ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers(WeatherData data) {
        for (Observer<WeatherData> observer: observers) {
            observer.update(data);
        }
    }
}

