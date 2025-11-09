import java.util.Scanner;
    
    public class DiameterOfCircle {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Integer For Radius Of A Circle ");
        int radius = input.nextInt();

      float diameter = 2 * radius;
  
        final float PI = 3.141591;

        float circumference = 2 * PI * radius;

      float area = PI * radius * radius;
    
    System.out.printf("The Diameter Of The Circle is %f%nThe Circumference for The Circle is %f%nThe Area For The Circle is %f", diameter, circumference, area); 

    
        }
    }
