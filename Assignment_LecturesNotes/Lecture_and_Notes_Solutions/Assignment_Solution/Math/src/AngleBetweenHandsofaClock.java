public class AngleBetweenHandsofaClock {
    public static void main(String[] args) {

        int h=12;
        int m=30;
        System.out.println(angleClock(h,m));

    }
    public static double angleClock(int hour, int minutes) {
        double hourToMinutes = (hour % 12 + minutes / (60.0)) * 5;
        double alpha = hourToMinutes / 60.0 * 360;
        double beta = minutes / 60.0 * 360;
        double angle = Math.abs(beta - alpha);
        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;
    }
}
