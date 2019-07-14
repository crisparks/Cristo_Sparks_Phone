public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        super(versionNumber, batteryPercentage, carrier, ringtone);
    }
    @Override
    public String ring() {
        String ring = getRingtone();
        return ring;
    }
    @Override
    public String unlock() {
    	return "Unlocked with webcam, picture sent to the FBI.";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy Version: " + getVersionNumber() + " Carrier: " + getCarrier() + " Battery: " + getBatteryPercentage() + "%");
    }
}