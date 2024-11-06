//1.Create a file named javafileOperation.txt if it doesn't already exist, and add some sample text content to it
//2.Rename the file to a user-specified name.
//3.Count the number of words in the renamed file and store the word count in a file called wordcount.txt.
//============================================
package Task9.Question1;

import java.io.*;
import java.util.Scanner;

public class Q1_Testing {
    static String path = System.getProperty("user.dir") + "\\src\\Task9\\Question1\\";

    static String staticFileName;

    public static void fileWriteOp(String fileName) {
        String newPath = path + fileName;
        staticFileName = fileName;
//        staticFileName = fileName;
//        System.out.println(staticFileName);

        File file = new File(newPath);
        try {
            if (file.createNewFile()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("Hello, This is the testing file\n");
                writer.write("Thank you\n");
                writer.close();
            } else {
                System.out.println("File already exist");
            }

        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }


    public static void fileRename(String currentFileName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new file name (with extension):");
        String newFileName = sc.nextLine();
        staticFileName = newFileName;


        String newPath = path + newFileName;

        File file = new File(path + currentFileName);

        File newFile = new File(newPath);

        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file");
        }
        System.out.println("Recent :"+staticFileName);
        sc.close();
//        return newFileName;
    }

    public static void countWordsFromFile() {
        System.out.println(staticFileName);
        String filePath = path + staticFileName;
        File file = new File(filePath);
        int wordCount = countWords(file);
        try {
            File newFile = new File(path + "wordcount.txt");
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.write(Integer.toString(wordCount));
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static int countWords(File file) {
        int cnt = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                cnt += words.length;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }


    public static void main(String[] args) {

//        fileWriteOp("javafileOperation.txt");
//        fileRename("javafileOperation.txt");
        countWordsFromFile();


    }
}
