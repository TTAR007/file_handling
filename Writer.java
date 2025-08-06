import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer {

    public static void main(String[] args) {


        File fileWriter = new File("FileWriter.txt");
        File bufferedWriter = new File("BufferredWriter.txt");
        
        try (FileWriter w = new FileWriter(fileWriter)) {
            
            w.write("I want to learn Javascript");
            w.write("\nI want to learn Python");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(bufferedWriter))) {

            bw.write("I want to learn C#");
            bw.write("\nI want to learn CSS");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // BufferedWriter writer = new BufferedWriter();
}