public class PerformanceWithLambdas {
    @FunctionalInterface
    interface Calculator {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // Using lambdas expressions.
        Calculator add = (x, y) -> x + y;
        Calculator subtract = (x, y) -> x - y;
        Calculator multiply = (x, y) -> x * y;
        Calculator remainder = (x, y) -> x % y;

        System.out.println(add.calculate(1, 2)); // 3
        System.out.println(subtract.calculate(1, 2)); // -1
        System.out.println(multiply.calculate(1, 2)); // 2
        System.out.println(remainder.calculate(1, 2)); // 1

        long end = System.currentTimeMillis();
        double sum = end - start;

        System.out.println(sum + " ms");
    }
}