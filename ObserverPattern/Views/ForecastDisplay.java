package ObserverPattern.Views;

import ObserverPattern.Entities.WeatherData;
import ObserverPattern.Interfaces.IDisplayElement;
import ObserverPattern.Interfaces.IObserver;

public class ForecastDisplay implements IObserver, IDisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
            System.out.println("===========================================");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
            System.out.println("===========================================");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
            System.out.println("===========================================");
        }

    }

}
