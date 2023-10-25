package BuiltInObserver;

import java.util.Observable;
import java.util.Observer;

// Custom data class representing PM2.5 data
class PM25Data {
    private int pm25;

    public PM25Data(int pm25) {
        this.pm25 = pm25;
    }

    public int getPM25() {
        return pm25;
    }
}

// Subject (Observable) class
class PM25Sensor extends Observable {
    private PM25Data data;

    public void setPM25Data(int pm25) {
        data = new PM25Data(pm25);
        setChanged(); // Marks this object as "changed"
        notifyObservers(data); // Notifies all observers
    }
}

// Observers
class WebsiteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof PM25Data) {
            PM25Data data = (PM25Data) arg;
            System.out.println("PM2.5 data: " + data.getPM25() + " on Website");
        }
    }
}

class LCDObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof PM25Data) {
            PM25Data data = (PM25Data) arg;
            System.out.println("PM2.5 data: " + data.getPM25() + " on LCD Monitor");
        }
    }
}

class WarningSignageObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof PM25Data) {
            PM25Data data = (PM25Data) arg;
            System.out.println("PM2.5 data: " + data.getPM25() + " on Signage");
        }
    }
}

 class ObserverPatternExample {
    public static void main(String[] args) {
        PM25Sensor sensor = new PM25Sensor();
        Observer websiteObserver = new WebsiteObserver();
        Observer lcdObserver = new LCDObserver();
        Observer signageObserver = new WarningSignageObserver();

        sensor.addObserver(websiteObserver);
        sensor.addObserver(lcdObserver);
        sensor.addObserver(signageObserver);

        sensor.setPM25Data(50); // Notify all observers

        // Simulating a change in PM2.5 data
        sensor.setPM25Data(80); // Notify all observers
    }
}
public class BuiltInObserver {
    
    
}
