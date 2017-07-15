import java.util.*;

/**
 * Created by Trancikk on 14.07.2017.
 */
public class CurrentDisplay implements  Displya, java.util.Observer {
    Observable observable;
    private  float temp;
    private float hum;
    private float press;

    public CurrentDisplay(Observable observable) {
        this.observable = observable;
        //observable.registerObserver(this);
        observable.addObserver(this);
    }

    private Subject weatherData;
    @Override
    public void display() {
        System.out.println("displaysss " + temp + " hum: " + hum);
    }
/**
    @Override
    public void update(float temp, float hum, float press) {
        this.temp=temp;
        this.hum=hum;
        display();

    }
*/
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData  weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.hum = weatherData.getHum();
            display();

        }


    }
}
