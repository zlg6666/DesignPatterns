package Observer.javaUtilObserver;

import java.util.Observable;

public class WeatherData1 extends Observable {
    private  float temperature;
    private float humidity;
    private float pressure;

    public WeatherData1() {}

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature =temperature;
        this.pressure = pressure;
        measurementsChanges();

    }

    private void measurementsChanges() {
        setChanged();
        notifyObservers();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
