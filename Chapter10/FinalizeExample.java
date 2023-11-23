package Chapter10;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;
        for (int i = 1; i <= 50; i++) {
            counter = new Counter();

            counter = null;
            System.gc();
        }
    }
}
