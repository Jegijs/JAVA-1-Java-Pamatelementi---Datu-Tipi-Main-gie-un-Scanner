import java.util.Scanner;

public class Main {
    // Function to calculate age in days
    static int calculate_age_in_days(int daysInYear, int age) {
        return daysInYear * age;
    }

    // Function to convert height in meters to cm
    static double calc_height_in_cm(double cmInM, double height) {
        return cmInM * height;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Tavs vārds: ");
        String name = scan.nextLine();

        System.out.println("Tavs vecums: ");
        int age = scan.nextInt();

        System.out.println("Tavs garums (m): ");
        double height = scan.nextDouble();

        System.out.println("Vai Patīk programmēt: (True/False) ");
        boolean likesProgramming = scan.nextBoolean();

        scan.close();

        // Print Student Card
        System.out.println("\n===== Student Card =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Likes Programming: " + (likesProgramming ? "Yes" : "No"));

        // Calculate age in days
        int ageInDays = calculate_age_in_days(365, age);
        System.out.println("Age in days: " + ageInDays);

        // Convert height to cm
        double heightInCm = calc_height_in_cm(100, height); // Removed incorrect syntax
        System.out.println("Height in cm: " + heightInCm);
    }
}
