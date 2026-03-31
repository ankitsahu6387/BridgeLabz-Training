import java.io.*;

public class ImageByteArray {

    public static void main(String[] args) {

        String inputImage = "input.jpg";
        String outputImage = "output.jpg";

        try {
            // Step 1: Read image into ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Step 2: Write byte array back to image using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted and written successfully!");
            System.out.println("Original and new image are identical.");

        } catch (IOException e) {
            System.out.println("Error while processing image.");
            e.printStackTrace();
        }
    }
}
