package Conditions;

public class Ex2 {
    public static void main(String[] args) {
        char category = 'C';  // Category can be 'A', 'B', 'C', or 'D'
        int quantity = 8;     // Quantity of items purchased

        // Calculate discount
        double discountPercentage = calculateDiscount(category, quantity);

        // Output the discount percentage
        System.out.println("Discount percentage for category " + category + " and quantity " + quantity + " is: " + discountPercentage + "%");
    }

    public static double calculateDiscount(char category, int quantity) {
        // Initialize discount percentage variable
        double discountPercentage = 0.0;

        // Determine discount based on category and quantity
        switch (category) {
            case 'A':
            case 'B':
            case 'C':
                if (quantity < 2) {
                    discountPercentage = 0.0;
                } else if (quantity <= 5) {
                    discountPercentage = 15.0;
                } else if (quantity <= 10) {
                    discountPercentage = 25.0;
                } else {
                    discountPercentage = 30.0;
                }
                break;
            case 'D':
                if (quantity > 50) {
                    quantity = 50;  // Maximum discount is capped at 50 items
                }
                discountPercentage = quantity * 1.0;  // 1% discount per item
                break;
            default:
                System.out.println("Invalid category.");
        }

        return discountPercentage;
    }
}
