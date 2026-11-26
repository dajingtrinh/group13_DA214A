public class PerformanceWithoutLambdas {
    @FunctionalInterface // Optional
    interface Calculator {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
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

        Calculator subtraction = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x - y;
            }
        };

        Calculator remainder = new Calculator() {
            @Override 
            public int calculate(int x, int y) {
                return x % y;
            }
        };

        System.out.println(subtraction.calculate(1, 2)); // -1
        System.out.println(remainder.calculate(1, 2)); // 1
        System.out.println(add.calculate(1, 2)); // 3
        System.out.println(multiply.calculate(1, 2)); // 2


        long end = System.currentTimeMillis();
        double sum = end - start;

        System.out.println(sum + " ms");
    }
}

