public class Main {
    public static void main(String[] args) {
        printNumberBackward(9);
    }
    public static void printNumberBackward(int n) {
        if (n >= 1) {
            System.out.println(n);
            printNumberBackward(n - 1);
        }
    }
}