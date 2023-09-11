public class Computation2 {
    public static void main(String[] args) {
        // Define the fixed costs (fc1, fc2, fc3) in dollars
        double fc1 = 2000.0;
        double fc2 = 4000.0;
        double fc3 = 6000.0;

        // Define the variable costs (vc1, vc2, vc3) in dollars
        double vc1 = 10000.0;
        double vc2 = 8000.0;
        double vc3 = 7000.0;

        // Define the original sales (s1, s2, s3) in dollars
        double s1 = 16000.0;
        double s2 = 17000.0;
        double s3 = 8000.0;

        // Increase the sales of product C by 50%
        double updatedS3 = s3 * 1.5; // 50% increase

        // Calculate the new profit for product C with the increased sales
        double p3 = updatedS3 - (fc3 + vc3);

        // Display the new profit for product C
        System.out.println("New Profit for Product C (p3) with 50% increased sales: $" + p3);
    }
}
