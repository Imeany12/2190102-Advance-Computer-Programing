public class FingerprintModule {
    private String fingerprintSerialNumber;
    private String fingerprint;

    public FingerprintModule(String fingerprintSerialNumber){
        this.fingerprintSerialNumber = fingerprintSerialNumber;
    }

    public void registerFingerprint(String fingerprint){
        this.fingerprint = fingerprint;
    }

    public boolean checkFingerprint(String fingerprint){
        return this.fingerprint.equals(fingerprint);
    }

    public String getFingerprintSerialNumber() {
        return fingerprintSerialNumber;
    }

    public void setFingerprintSerialNumber(String fingerprintSerialNumber) {
        this.fingerprintSerialNumber = fingerprintSerialNumber;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    
}
