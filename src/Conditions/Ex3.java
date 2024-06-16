package Conditions;

public class Ex3 {
    public static void main(String[] args) {
        int hours = 4;      // Number of hours parked
        int minutes = 45;   // Number of minutes parked

        // Calculate parking fee
        double parkingFee = calculateParkingFee(hours, minutes);

        // Output the parking fee
        System.out.println("Parking fee for " + hours + " hours and " + minutes + " minutes is: $" + parkingFee);
    }

    public static double calculateParkingFee(int hours, int minutes) {
        double parkingFee ;

        // Convert total time to minutes
        int totalMinutes = hours * 60 + minutes;

        // Determine parking fee based on totalMinutes
        if (totalMinutes < 180) {  // Less than 3 hours (180 minutes)
            parkingFee = 0.0;      // Free parking
        } else if (totalMinutes <= 209) {
            parkingFee = 4.0;      // 3 hours to 3 hours 29 minutes
        } else if (totalMinutes <= 239) {
            parkingFee = 7.0;      // 3 hours 30 minutes to 3 hours 59 minutes
        } else if (totalMinutes <= 269) {
            parkingFee = 11.0;     // 4 hours to 4 hours 29 minutes
        } else if (totalMinutes <= 299) {
            parkingFee = 16.0;     // 4 hours 30 minutes to 4 hours 59 minutes
        } else if (totalMinutes <= 329) {
            parkingFee = 22.0;     // 5 hours to 5 hours 29 minutes
        } else if (totalMinutes <= 359) {
            parkingFee = 30.0;     // 5 hours 30 minutes to 5 hours 59 minutes
        } else {
            parkingFee = 40.0;     // 6 hours or more
        }

        return parkingFee;
    }
}
