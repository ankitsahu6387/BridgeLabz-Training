import java.io.*;

public class SimplePiped {

    public static void main(String[] args) {

        try {
            PipedOutputStream writePipe = new PipedOutputStream();
            PipedInputStream readPipe = new PipedInputStream(writePipe);

            // Writing thread
            Thread writerThread = new Thread(() -> {
                try {
                    String msg = "Data sent from writer thread";
                    writePipe.write(msg.getBytes());
                    writePipe.close();
                } catch (IOException e) {
                    System.out.println("Writer error");
                }
            });

            // Reading thread
            Thread readerThread = new Thread(() -> {
                try {
                    int ch;
                    while ((ch = readPipe.read()) != -1) {
                        System.out.print((char) ch);
                    }
                    readPipe.close();
                } catch (IOException e) {
                    System.out.println("Reader error");
                }
            });

            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            System.out.println("Pipe connection failed");
        }
    }
}
