/**
 * Created by Trancikk on 14.07.2017.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();

}
