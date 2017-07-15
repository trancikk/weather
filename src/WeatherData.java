import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Trancikk on 14.07.2017.
 */
public class WeatherData extends Observable {
    //private ArrayList observers;
    private float temp;
    private float press;
    private float hum;

    public WeatherData() {
        //observers = new ArrayList();
    }

   // @Override
   // public void registerObserver(Observer observer) {
     //   observers.add(observer);

 //   }

  //// / @Override
  //  public void removeObserver(Observer observer) {
   //     int i = observers.indexOf(observer);
    //    if (i>=0){

      //  observers.remove(i);
   // }}

    //@Override
    //public void notifyObserver() {
        //Observer observer1;
        //observer1 = (Observer) observers.get(0);



    public float getTemp() {
        return temp;
    }

    public float getPress() {
        return press;
    }

    public float getHum() {
        return hum;
    }

    //  for ( Object observer : observers){
        //    Observer observer1 = (Observer) observer;
          //  observer1.update(temp,hum,press);
        //}}
        public void measureChanged(){
        setChanged();
        notifyObservers();


    }
    public void setMeasures(float temp, float hum, float press){
        this.temp=temp;
        this.hum=hum;
        this.press=press;
        measureChanged();

    }
}
