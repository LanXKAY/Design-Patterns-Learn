package observer.weather.with.api;

import observer.weather.with.api.observer.CurrentConditionsDisplay;
import observer.weather.with.api.observer.ForecastDisplay;
import observer.weather.with.api.observer.HeatIndexDisplay;
import observer.weather.with.api.observer.StatisticsDisplay;
import observer.weather.with.api.subject.WeatherData;

public class WeatherStationWithApi {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
