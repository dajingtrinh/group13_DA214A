public class CalculatorWithLambdas {
    @FunctionalInterface
    interface Calculator {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        long startingTime = System.currentTimeMillis();
        Calculator addition = (x, y) -> x + y;
        System.out.println(addition.calculate(1, 2)); // 2

        Calculator subtraction = (x, y) -> x - y;
        System.out.println(subtraction.calculate(1, 2)); // -1

        Calculator multiplication = (x, y) -> x * y;
        System.out.println(multiplication.calculate(1, 2)); // 2

        Calculator remainder = (x, y) -> x % y;
        System.out.println(remainder.calculate(1, 2)); // 1
        long endingTime = System.currentTimeMillis();

        double result = endingTime - startingTime;
        System.out.println(result + "ms");
    }
}



