// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
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
        //double squareArea = square.calculateArea();
        //System.out.println("Area of square: " + squareArea);
        System.out.println("Area of sq1: " + sq1.calculateArea());
        System.out.println("Area of sq2: " + sq2.calculateArea());
    }
}