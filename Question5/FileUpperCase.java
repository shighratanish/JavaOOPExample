import java.io.*;

public class FileUpperCase {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("products.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
