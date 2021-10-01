public class SpeedConverter {

    public static long  toMilesPerHour(double kilometersPerHours) {

        if(kilometersPerHours < 0 ) {
            return -1;
        }

        return Math.round(kilometersPerHours / 1.609);
    }
}
