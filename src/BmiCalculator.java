import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight (kg): ");
        double weight = scanner.nextInt();
        System.out.println("Enter height (m): ");
        double height = scanner.nextInt();
        double bmi;
        bmi = weight / Math.pow(height,2);

        System.out.printf("%-20.2s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
