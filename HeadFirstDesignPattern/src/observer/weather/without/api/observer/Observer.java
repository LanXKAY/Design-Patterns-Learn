package observer.weather.without.api.observer;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
