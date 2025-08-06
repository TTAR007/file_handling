import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

    static int i;

    public static void main(String[] args) {

        //File Reader
        try (FileReader r = new FileReader("FileWriter.txt")) {  

            // return Unicode representing characters
            while ((i = r.read()) != -1) {
                System.out.print((char) i); // cast int to char
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Bufferred Reader
        try (BufferedReader br = new BufferedReader(new FileReader("BufferredWriter.txt"))) {

            System.out.println("\n");
            
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}