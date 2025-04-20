package org.varun.designPatterns.Observer.intf;

public interface Observable<T> {
    void register(Observer<T> ob);
    void unregister(Observer<T> ob);
    void notifyObservers(T data);
}
