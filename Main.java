//accept input from user
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rect Length: ");
        int Length = input.nextInt();

        System.out.print("Enter The Rect Width: ");
        int width = input.nextInt();

        int Area = Length * width ;
        System.out.println("The Area is: " + Area);
    }
}
