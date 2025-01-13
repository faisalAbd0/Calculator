public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Error: Division by zero");
        return a / b;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: Factorial of a negative number is undefined");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) 
            result *= i;
        return result;
    }

}
