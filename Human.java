public class Human {
    public String name;
    boolean wearWatch;
    int age;

    public Human(String theName, boolean isWearingWatch, int theAge) {
        name = theName;
        wearWatch = isWearingWatch;
        age = theAge;
    }

    public String callName() {
        return "Yes, I'm " + name;
    }
}
