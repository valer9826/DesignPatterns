package ObserverPattern.Views;

import ObserverPattern.Entities.WeatherData;
import ObserverPattern.Interfaces.IDisplayElement;
import ObserverPattern.Interfaces.IObserver;

public class HeatIndexDisplay implements IObserver, IDisplayElement {

    float heatIndex = 0.0f;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
        System.out.println("===========================================");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temp, humidity);

        display();
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                        (rh * rh * rh))
                + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

}