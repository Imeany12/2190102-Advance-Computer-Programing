import java.util.ArrayList;

interface SensorObject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(int pm25);
}

class PM25Sensor implements SensorObject{
    private int pm25;
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int pm25) {
        for (Observer observer : observers) {
            observer.update(pm25);
        }
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
        notifyObservers(pm25);
    }
}


interface Observer {
    void update(int pm25);
}

class WebsiteObserver implements Observer {
    @Override
    public void update(int pm25) {
        System.out.println("PM2.5 data: " + pm25 + " on Website");
    }
}

class LCDObserver implements Observer {
    @Override
    public void update(int pm25) {
        System.out.println("PM2.5 data: " + pm25 + " on LCD Monitor");
    }
}

class SignageObserver implements Observer {
    @Override
    public void update(int pm25) {
        System.out.println("PM2.5 data: " + pm25 + " on Signage");
    }
}

public class App {

    public static void main(String[] args) {
        PM25Sensor sensor = new PM25Sensor();
        Observer websiteObserver = new WebsiteObserver();
        Observer lcdObserver = new LCDObserver();
        Observer signageObserver = new SignageObserver();

        sensor.registerObserver(new WebsiteObserver());
        sensor.registerObserver(new LCDObserver());

        sensor.setPm25(60);
        sensor.registerObserver(signageObserver);
        sensor.removeObserver(lcdObserver);

        sensor.setPm25(25);
        sensor.setPm25(60);
    }
}

