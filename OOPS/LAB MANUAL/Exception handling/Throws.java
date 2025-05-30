import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt"); 
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
    }
}
