//1.Create a file named javafileOperation.txt if it doesn't already exist, and add some sample text content to it
//2.Rename the file to a user-specified name.
//3.Count the number of words in the renamed file and store the word count in a file called wordcount.txt.
//4.Copy the content from both the renamed file and the wordcount.txt to a new file called backup.txt.
//5.Delete the original files (javafileOperation.txt and wordcount.txt) after copying the content to backup.txt."
//============================================
package Task9.Question1;

import java.io.*;
import java.util.Scanner;

public class Q1 {
    static String path = System.getProperty("user.dir") + "\\src\\Task9\\Question1\\";

    public static void fileWriteOp(String fileName) {
        String newPath = path + fileName;

        File file = new File(newPath);
        try {
            if (file.createNewFile()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("Hello, This is the testing file\n");
                writer.write("Thank you\n");
                System.out.println(fileName + " is successfully created");

                writer.close();
            } else {
                System.out.println("File already exist");
            }

        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }


    public static String fileRename(String currentFileName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new file name (with extension):");
        String newFileName = sc.nextLine();

        String newPath = path + newFileName;

        File file = new File(path + currentFileName);

        File newFile = new File(newPath);

        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file");
        }
        sc.close();
        return newFileName;
    }

    public static void countWordsFromFile(String newFileName) {
        String filePath = path + newFileName;
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
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cnt;
    }


    public static void createBackup(String oldFileName) {
        String filePath = path + oldFileName;
        String wordCountPath = path + "wordcount.txt";
        String newFilePath = path + "backup.txt";
        File oldFile = new File(filePath);
        File wordCountFile = new File(wordCountPath);
        File backupFile = new File(newFilePath);

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(oldFile));
            BufferedReader wordCountReader = new BufferedReader(new FileReader(wordCountFile));
            BufferedWriter backupWriter = new BufferedWriter(new FileWriter(backupFile));
            String line;
            while ((line = fileReader.readLine()) != null) {
                backupWriter.write(line);
                backupWriter.newLine();
            }

            while ((line = wordCountReader.readLine()) != null) {
                backupWriter.write(line);
                backupWriter.newLine();
            }
            fileReader.close();
            wordCountReader.close();
            backupWriter.close();
            System.out.println("Successfully created backup file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteBothFile(String newFile) {
        String filePath = path + newFile;
        String wordCountPath = path + "wordcount.txt";
        File fileToDelete = new File(filePath);
        File wordCountFile = new File(wordCountPath);
        if (fileToDelete.delete() && wordCountFile.delete()) {
            System.out.println(newFile + " and " + "wordcount.txt were successfully deleted");
        }
    }


    public static void main(String[] args) {
        String initialFileName = "javafileOperation.txt";
        fileWriteOp(initialFileName);
        String newFileName = fileRename(initialFileName);
        countWordsFromFile(newFileName);
        createBackup(newFileName);
        deleteBothFile(newFileName);
    }
}

