package observer.weather.without.api.subject;

import observer.weather.without.api.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
