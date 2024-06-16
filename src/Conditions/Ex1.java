package Conditions;

public class Ex1 {
    public static void main(String[] args) {
        // Example inputs
        String courseEnrolled = "UG";  // Can be "UG", "UG (Hons)", or "PG"
        int creditPointsCompleted = 80;  // Number of credit points completed

        // Determine eligibility
        boolean isEligible = checkEligibility(courseEnrolled, creditPointsCompleted);

        // Output the result
        if (isEligible) {
            System.out.println("Congratulations! You are eligible to graduate.");
        } else {
            System.out.println("Sorry, you are not eligible to graduate yet.");
        }
    }

    public static boolean checkEligibility(String courseEnrolled, int creditPointsCompleted) {
        // Convert courseEnrolled to lowercase for case-insensitive comparison
        String course = courseEnrolled.toLowerCase();

        // Check eligibility based on the conditions
        if (course.equals("ug") && creditPointsCompleted >= 72) {
            return true;
        } else if (course.equals("ug (hons)") && creditPointsCompleted >= 96) {
            return true;
        } else return course.equals("pg") && creditPointsCompleted >= 48;
    }
}
