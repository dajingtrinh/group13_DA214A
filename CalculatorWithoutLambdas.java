public class CalculatorWithoutLambdas {
    @FunctionalInterface // Optional
    interface Calculator {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        /** Create and run an anonymous class 
         * when Calculator object is created. */
        Calculator add = new Calculator() {
            @Override // Optional
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        Calculator multiply = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x * y;
            }
        };

        System.out.println(add.calculate(1, 2)); // 3
        System.out.println(multiply.calculate(1, 2)); // 2

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
    }
}

