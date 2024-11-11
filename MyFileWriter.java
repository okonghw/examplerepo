
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {

    private static void printFileSize(String fileName) {
        File file = new File (fileName);
        System.out.println ("File Size of " + fileName + ": " + file.length());
    }

    public static void createHiddenFile() {
        File secretFile = new File(".secretpassword.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(secretFile))) {
            writer.write ("idkwhattouseaspassword");
            writer.close();
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public static void createFileInHiddenFolder() throws IOException {
        File hiddenFolder = new File (".classified");
        hiddenFolder.mkdir();

        File f = new File(".classified", "confidential.dat");
        BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        writer.write("top secret data");
        writer.close();
    }

    public static void main(String[] args) {

        // printFileSize("README.md");

        // String data = "Hello, World!";
        // String fileName1 = "exampleNameChange.txt";
        // String fileName2 = "example2.txt";
        // String fileName3 = "example3.txt";
        // String fileName4 = "example4.txt";
        // String fileName5 = "example5.txt";

        createHiddenFile();
        createHiddenFile();;

        // // 1. Using FileWriter
        // try (FileWriter writer = new FileWriter(fileName1)) {
        //     writer.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 2. Using BufferedWriter
        // try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
        //     bufferedWriter.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 3. Using FileOutputStream
        // try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
        //     outputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 4. Using BufferedOutputStream
        // try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName4))) {
        //     bufferedOutputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

    }
}