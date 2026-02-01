class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }
}

public class it25300054 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int mul1 = calculator.multiply(3, 4);
        int mul2 = calculator.multiply(5, 7);
        int sum1 = calculator.add(mul1, mul2);
        int result1 = calculator.square(sum1);

        int sum2a = calculator.add(4, 7);
        int sq1 = calculator.square(sum2a);

        int sum2b = calculator.add(8, 3);
        int sq2 = calculator.square(sum2b);

        int result2 = calculator.add(sq1, sq2);

        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
