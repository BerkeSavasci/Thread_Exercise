/**
 * @author berkesavasci
 * 27.06.23
 * project: ThreadsUeben
 */
public class WriterThread implements Runnable{
    private final char c;
    private final int waitTime;
    public WriterThread(char c, int waitTime){
        this.c = c;
        this.waitTime = waitTime;
    }
    @Override
    public void run() {
        int i = 0;
        while(i<100) {
            System.out.print(this.c);
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException e) {
                System.err.println("Error in runnable");
                Thread.currentThread().interrupt();
            }
            i++;
        }
    }
}
