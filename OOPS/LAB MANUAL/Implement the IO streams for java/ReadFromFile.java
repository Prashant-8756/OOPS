import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("output.txt")) {
            int content;
            System.out.println("Reading data from file:");

            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println(); 
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
