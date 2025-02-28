import java.util.Scanner;
import java.lang.Math;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("The area of circle is: " + area);
    
        sc.close();
    }
}