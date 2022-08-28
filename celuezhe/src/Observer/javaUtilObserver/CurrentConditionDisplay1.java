package Observer.javaUtilObserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay1 implements Observer {
    Observable  observable;
    private  float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay1(Observable  observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData1) {
            WeatherData1 weatherData = (WeatherData1) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    private void display() {
        System.out.println(" CurrentConditionDisplay " + temperature + humidity + pressure);
    }
}
