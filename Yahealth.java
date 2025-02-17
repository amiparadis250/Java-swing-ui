public class Yahealth {
    public static void main(String[] args) {

        printMessage("Welcome to Yahealth platforms");
        calculate(10,20);
        int product = Multiply(2, 2);
        System.out.println(product);
    }
    public static void printMessage(String message){
        System.out.println(message);
    }
    public static void calculate(int a, int b){
        System.out.println(a+b);
    }
    public static int Multiply(int a, int b){
        return a*b;
    }
}
