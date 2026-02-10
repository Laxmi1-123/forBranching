public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Add: " + add(3, 2));
        System.out.println("Sub: " + sub(5, 2));
        System.out.println("Mul: " + mul(4, 3));
        System.out.println("Div: " + div(10, 2));

    }
}
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator Project - Team Version");
        System.out.println("Team members will add operations using branches.");
    }
}


