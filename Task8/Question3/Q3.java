////3. Write a method that opens a file and reads its content. Ensure that the file is properly closed using a finally block, even if an exception occurs.
////==========================================================

package Task8.Question3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {
    public static void readFile(String fileName) {
        Scanner sc = null;
        try {
            String path = System.getProperty("user.dir");
            path += "\\src\\Task8\\Question3\\" + fileName;
            File myFile = new File(path);
            sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
                System.out.println("Scanner closed.");
            }
        }
    }

    public static void main(String[] args) {
        readFile("samkfkfple.txt");
    }
}

