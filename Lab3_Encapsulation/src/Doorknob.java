public class Doorknob {
    private String doorknobID;

    public Doorknob(String doorknobID) {
        this.doorknobID = doorknobID;
    }

    public boolean canUnlock(Key key) {
        return doorknobID.equals(key.getKeyID());
    }

    public String getDoorknobID() {
        return doorknobID;
    }

    public void setDoorknobID(String doorknobID) {
        this.doorknobID = doorknobID;
    }

}
