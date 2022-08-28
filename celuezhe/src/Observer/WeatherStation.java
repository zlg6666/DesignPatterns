package Observer;

import Observer.javaUtilObserver.CurrentConditionDisplay1;
import Observer.javaUtilObserver.WeatherData1;

public class WeatherStation {
    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
//        weatherData.setMeasurements(80,65,30.4f);

        WeatherData1 weatherData1 = new WeatherData1();
        CurrentConditionDisplay1 currentConditionDisplay1 = new CurrentConditionDisplay1(weatherData1);
        weatherData1.setMeasurements(40,70,80);
    }
}
