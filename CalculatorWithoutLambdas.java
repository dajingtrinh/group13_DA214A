public class CalculatorWithoutLambdas {
    @FunctionalInterface
    interface Calculator {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        /** Create and run an anonymous class 
         * when Calculator object is created. */
        long startingTime = System.currentTimeMillis();
        Calculator addition = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        System.out.println(addition.calculate(1, 2)); // 3

        Calculator multiplication = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x * y;
            }
        };
        System.out.println(multiplication.calculate(1, 2)); // 2

        Calculator subtraction = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x - y;
            }
        };
        System.out.println(subtraction.calculate(1, 2)); // -1

        Calculator remainder = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x % y;
            }
        };
        System.out.println(remainder.calculate(1, 2)); // 1

        long endingTime = System.currentTimeMillis();

        double result = endingTime - startingTime;
        System.out.println(result + " ms");
    }
}