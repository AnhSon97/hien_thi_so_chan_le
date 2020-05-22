public class EvenThead extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0;i  < 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
