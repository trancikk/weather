/**
 * Created by Trancikk on 14.07.2017.
 */
public class WeatherStation  {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        weatherData.setMeasures(10,20,30);
        weatherData.setMeasures(1,2,3);
        weatherData.setMeasures(100,200,300);

    }
}
