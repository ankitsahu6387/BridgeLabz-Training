package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor processor;
    String filename = "testfile.txt";

    @BeforeEach
    void setUp() {
        processor = new FileProcessor();
    }

    @AfterEach
    void cleanUp() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }

    // Test writing & reading content
    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello JUnit");
        String content = processor.readFromFile(filename);
        assertEquals("Hello JUnit", content);
    }

    // Test file existence after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test");
        File file = new File(filename);
        assertTrue(file.exists());
    }

    // Test IOException when file does not exist
    @Test
    void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}