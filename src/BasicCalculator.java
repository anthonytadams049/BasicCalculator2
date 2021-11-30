public class BasicCalculator {
    public BasicCalculator() {

    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args){
        BasicCalculator myCalculator = new BasicCalculator();
        System.out.println(myCalculator.add(5, 7));
    }

}
