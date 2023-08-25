
public class DoorTest {
    public static void main(String[] args) throws Exception {
        DoorWithDoorknob d1 = new DoorWithDoorknob("DoorID1");
        Doorknob dk1 = new Doorknob("DoorknobID1");
        d1.installDoorknob(dk1);
        d1.close();
        d1.lock();
        d1.unlock(new Key("DoorknobID1"));
        d1.open();
        d1.close();
        d1.open();
        d1.lock();
        d1.unlock(new Key("DoorknobID2"));
        d1.open();

        DoorWithFingerprint d2 = new DoorWithFingerprint("DoorID2");
        FingerprintModule f1 = new FingerprintModule("FingerprintSerial001");
        d2.installFingerprintModule(f1);
        d2.close();
        d2.open();
        d2.close("Finger of Somchai");
        d2.open("Finger of Somsak");
        d2.open("Finger of Somchai");
    }
}
