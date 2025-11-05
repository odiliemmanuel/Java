import java.util.Scanner;
    public class GeometryArea {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

    System.out.print("Enter value for lenght of pentagon ");
        double lenghtPent = input.nextDouble();

        double lenghtSquare = lenghtPent * lenghtPent;
    System.out.println("The Square of the Lenght is " + lenghtSquare);

        double pie;
        pie = 3.142;
    System.out.println("The value for pie is " + pie);

        double sideLenght;
        sideLenght = 2 * lenghtPent * Sin * pie/2;
    System.out.println("The lenght of the side is " + sideLenght);

        double area;
        area = 5 * sideLenght * sideLenght / 4 * Tan * pie/5;
    System.out.println("The Area is " + area);


        }

    }
