import java.io.*;

public class BufferedVsUnbufferedCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String source = "sample.txt";      // e.g. 100MB file
        String unbufferedDest = "unbuffered_copy.dat";
        String bufferedDest = "buffered_copy.dat";

        copyUsingUnbufferedStreams(source, unbufferedDest);
        copyUsingBufferedStreams(source, bufferedDest);
    }

    //  Unbuffered Streams
    static void copyUsingUnbufferedStreams(String src, String dest) {
        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    //  Buffered Streams
    static void copyUsingBufferedStreams(String src, String dest) {
        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
