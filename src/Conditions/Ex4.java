package Conditions;

public class Ex4 {
    public static void main(String[] args) {
        int hours = 5;           // Number of hours parked
        int minutes = 45;        // Number of minutes parked
        int dayOfWeek = 6;       // Day of the week (0 for Monday, 1 for Tuesday, ..., 6 for Sunday)

        // Calculate parking fee
        double parkingFee = calculateParkingFee(hours, minutes, dayOfWeek);

        // Output the parking fee
        System.out.println("Parking fee for " + hours + " hours and " + minutes + " minutes on day " + dayOfWeek + " is: $" + parkingFee);
    }

    public static double calculateParkingFee(int hours, int minutes, int dayOfWeek) {
        double parkingFee ;
        int totalMinutes = hours * 60 + minutes;

        // Determine if it's a weekend (Saturday or Sunday)
        boolean isWeekend = (dayOfWeek == 0 || dayOfWeek == 6);

        if (!isWeekend) {
            // Weekday parking rules
            if (totalMinutes < 180) {
                parkingFee = 0.0;       // Less than 3 hours (free)
            } else if (totalMinutes <= 209) {
                parkingFee = 4.0;       // 3 hours to 3 hours 29 minutes
            } else if (totalMinutes <= 239) {
                parkingFee = 7.0;       // 3 hours 30 minutes to 3 hours 59 minutes
            } else if (totalMinutes <= 269) {
                parkingFee = 11.0;      // 4 hours to 4 hours 29 minutes
            } else if (totalMinutes <= 299) {
                parkingFee = 16.0;      // 4 hours 30 minutes to 4 hours 59 minutes
            } else if (totalMinutes <= 329) {
                parkingFee = 22.0;      // 5 hours to 5 hours 29 minutes
            } else if (totalMinutes <= 359) {
                parkingFee = 30.0;      // 5 hours 30 minutes to 5 hours 59 minutes
            } else {
                parkingFee = 40.0;      // 6 hours or more
            }
        } else {
            // Weekend parking rules (flat rate $4 per 30 minutes)
            int halfHours = totalMinutes / 30;
            parkingFee = halfHours * 4.0;
        }

        return parkingFee;
    }
}
