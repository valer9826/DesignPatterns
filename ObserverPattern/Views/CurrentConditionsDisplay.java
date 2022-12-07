package ObserverPattern.Views;

import ObserverPattern.Entities.WeatherData;
import ObserverPattern.Interfaces.IDisplayElement;
import ObserverPattern.Interfaces.IObserver;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
        System.out.println("===========================================");
    }

}
