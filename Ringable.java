public interface Ringable
{
    public default String ring() {
        return "ring ring ring...";
    }
    public default String unlock() {
        return "Phone Unlocked";
    }
}
