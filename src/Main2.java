public class Main2 {
    public static void main(String[] args) {

        printNumber(9);
    }

    public static void printNumber(int n) {
        if (n >= 1) {
            printNumber(n - 1);
            System.out.println(n);
        }
    }

}

