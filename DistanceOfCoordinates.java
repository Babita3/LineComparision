package LineComparision;
import java.util.Scanner;
public class DistanceOfCoordinates {

        public static void main(String[] args) {

            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the value of X1");
            int x1 = Sc.nextInt();
            System.out.println("Enter the value of Y1");
            int y1 = Sc.nextInt();
            System.out.println("Enter the value of X2");
            int x2 = Sc.nextInt();
            System.out.println("Enter the value of Y2");
            int y2 = Sc.nextInt();

            double Dist = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
            System.out.println("The Distance between X and Y coordinate is :" + Dist);

        }
    }

