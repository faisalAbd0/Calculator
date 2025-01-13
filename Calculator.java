public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            System.out.println("Division by zero is not allowed ! , 'a' can't be divided by zero");
        return a / b;
    }

}
