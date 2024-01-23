import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama file: ");
            String fileName = scanner.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("Isi file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: Terjadi kesalahan saat membaca file.");
        } finally {

            scanner.close();
        }
    }
}
