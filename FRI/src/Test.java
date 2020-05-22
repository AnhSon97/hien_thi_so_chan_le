public class Test {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThead evenThead = new EvenThead();

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThead.start();
    }
}
