import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(LocalDate.now());
        System.out.println("Hello it's me");

        // Press Maiusc+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 5; i <= 10; i++) {
            // Press Maiusc+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            {
                if (i%2 == 0)
                System.out.println(i + " is even");
                else
                    System.out.println(i + " is odd");
            }
        }
        Circle ci = new Circle(2);
        double circleArea = ci.calculateArea();
        System.out.println("Area of circle: " + circleArea);
        Square sq1 = new Square(5);
        Shape sq2 = new Square(6);
        Rectangle r1 = new Rectangle(2.5,8);
        //double squareArea = square.calculateArea();
        //System.out.println("Area of square: " + squareArea);
        System.out.println("Area of sq1: " + sq1.calculateArea());
        System.out.println("Area of sq2: " + sq2.calculateArea());
        System.out.println("Area of r1:  " + r1.calculateArea());
        //using the Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String st1 = sc.nextLine();
        System.out.println("string = " + st1);
        // Get the current date
        //LocalDate currentDate = LocalDate.now();
        // Get the current year as an integer
        //int year = currentDate.getYear();
        //int yr = LocalDate.now().getYear();
        //System.out.println("Current year: " + yr);
        System.out.print("What year were you born? ");
        int birth = sc.nextInt();
        int age = LocalDate.now().getYear()-birth;
        sc.nextLine();
        System.out.println("You were born in "+birth+" so you're "+age);
        System.out.println("Enter another string:");
        String st2 = sc.nextLine();
        System.out.println("string = " + st2);

    }
}