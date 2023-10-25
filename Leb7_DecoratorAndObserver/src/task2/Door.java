package task2;

public class Door {
    public String doorName;
    public boolean isOpen;

    public Door(String doorName) {
        this.isOpen = false;
        this.doorName = doorName;
    }

    public void open() {
        isOpen = true;
        System.out.println("Door " + doorName + " opened");
    }

    public void close() {
        isOpen = false;
        System.out.println("Door " + doorName + " closed");
    }

}
