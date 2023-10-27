package task2;

public class App {
    public static void main(String[] args) {
        // Create Door objects
        Door D1 = new Door("D1");
        Door D2 = new Door("D2");
        Door D3 = new Door("D3");

        // Create a ControlCenter object
        ControlCenter controlCenter = new ControlCenter();

        // Register doors with the control center
        controlCenter.registerObserver(D1);
        controlCenter.registerObserver(D2);
        controlCenter.registerObserver(D3);

        // Manually open and close doors
        D1.open();
        D2.open();
        D1.close();

        // Use the control center to open and close all doors
        controlCenter.openAllDoors();
        controlCenter.closeAllDoors();

        // Add a new door and register it with the control center
        Door D4 = new Door("D4");
        controlCenter.registerObserver(D4);
        controlCenter.openAllDoors();
    }
}
