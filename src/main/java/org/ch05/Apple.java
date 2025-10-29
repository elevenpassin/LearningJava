package org.ch05;

public class Apple {
    float mass;
    float diameter = 1.0f;
    int x, y;
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

    static float gravAccel = 9.8f;

    boolean isTouching(Apple other) {
        double xdiff = other.x - this.x;
        double ydiff = other.y - this.y;

        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return distance < diameter / 2 + other.diameter / 2;
    }

    public void printDetails() {
        System.out.println("  mass: " + mass);
        System.out.println("  diameter: " + diameter);
        System.out.println("  position: (" + x + ", " + y + ")");
    }

    public void moveTo(int x, int y) {
        System.out.println("Moving apple to " + x + ", " + y);

        this.x = x;

        if (y > diameter) {
            this.y = y;
        } else {
            this.y = (int)diameter;
        }
    }

    public static String[] getAppleSizes() {
        return new String[] { "SMALL", "MEDIUM", "LARGE" };
    }-
}
