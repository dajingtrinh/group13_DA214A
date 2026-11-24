public class CalculatorWithoutLambdas {
    @FunctionalInterface
    interface Calculator {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        System.out.println(add.calculate(1, 2)); // 3

        Calculator multiply = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x * y;
            }
        };

        System.out.println(multiply.calculate(1, 2)); // 2
    }
}