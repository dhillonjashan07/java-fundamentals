import java.util.Scanner;

public class calSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        double simpleInterest = (p * r * t) / 100;

        
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}