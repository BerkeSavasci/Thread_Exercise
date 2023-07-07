import java.io.IOException;

public class ThreadTest {
    public static void main(String[] args) {
        char sign = 'a';
        try {
            while(true) {
                System.in.read();
                System.out.println("Taste gedrückt, neue Thread wurde gestartet.");

                WriterThread writer = new WriterThread(sign, 200);
                Thread t = new Thread(writer);
                t.start();
                sign++;
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}