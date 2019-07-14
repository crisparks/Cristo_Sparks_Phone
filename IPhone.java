public class IPhone extends Phone implements Ringable
{
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        super(versionNumber, batteryPercentage, carrier, ringtone);
    }
    @Override
    public String ring() {
        String ring = getRingtone();
        return ring;
    }
    @Override
    public String unlock() {
        return "Unlocked and fingerprints sent to the FBI";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone Version: " + getVersionNumber() + " Carrier: " + getCarrier() + " Battery: " + getBatteryPercentage() + "%");
    }
}
