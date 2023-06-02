package observer.weather.without.api;

import observer.weather.without.api.observer.CurrentConditionsDisplay;
import observer.weather.without.api.observer.ForecastDisplay;
import observer.weather.without.api.observer.HeatIndexDisplay;
import observer.weather.without.api.observer.StatisticsDisplay;
import observer.weather.without.api.subject.WeatherData;

public class WeatherStationWithoutApi {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
