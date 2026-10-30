class Calculator {
    int a;
    int b;
        Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int add() {
        return a + b;
    }
    int subtract() {
        return a - b;
    }
    int multiply() {
        return a * b;
    }
    float divide() {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
     }
        return (float) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(16, 4);  

        System.out.println("Add      : " + calc.add());
        System.out.println("Subtract : " + calc.subtract());
        System.out.println("Multiply : " + calc.multiply()); 
        System.out.println("Divide   : " + calc.divide());                     
    }
}

