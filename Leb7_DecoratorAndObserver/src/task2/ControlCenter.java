package task2;

import java.util.ArrayList;

public class ControlCenter implements Observer{
    public ArrayList<Door> doors;

    public ControlCenter() {
        this.doors = new ArrayList<Door>();
    }

    public void registerObserver(Door door) {
        this.doors.add(door);
    }

    public void openAllDoors() {
        for (int i = 0; i < doors.size(); i++) {
            doors.get(i).open();
        }
        
    }

    public void closeAllDoors() {
        for (int i = 0; i < doors.size(); i++) {
            doors.get(i).close();
        }
    }

    @Override
    public void updateDoorOpen(Door door) {
        // TODO Auto-generated method stub
        door.open();
    }

    @Override
    public void updateDoorClose(Door door) {
        // TODO Auto-generated method stub
        door.close();
    }

}
