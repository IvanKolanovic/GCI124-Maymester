package edu.rit.Unit1;

import java.io.*;

public class FileReading {

    private static void printFileInformation(File file2) {
        System.out.println("IsFile: " + file2.isFile());
        System.out.println("Get Path: " + file2.getAbsolutePath());
        System.out.println("Name: " + file2.getName());
        System.out.println("IsDirectory: " + file2.isDirectory());
        System.out.println("Length: " + file2.length());
    }

    public static void readFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        fileReader.close();
        reader.close();
    }

    public static void readFileWithHandling(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    public static void writeFileWithHandling(File file, String toWriteFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new PrintWriter(toWriteFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Writing into file: " + line);
                writer.write(line + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Ivan\\Desktop\\Maymester\\Unit 1\\Novo\\Unit1\\Text1.txt");
        File file2 = new File("Text2.txt");
        printFileInformation(file1);
        System.out.println();
        printFileInformation(file2);

//        readFile(file1);
//        System.out.println();
//        readFile(file2);

//        readFileWithHandling(file1);
//        System.out.println();
//        readFileWithHandling(file2);
        writeFileWithHandling(file1, "MyFile.txt");
    }

}
