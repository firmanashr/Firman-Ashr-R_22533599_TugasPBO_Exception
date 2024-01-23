import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nomor: ");
            String str = scanner.next();
            int number = Integer.parseInt(str); 
            System.out.println("Nomor yang dimasukkan: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: String tidak dapat diubah menjadi nilai numerik.");
        } finally {

            scanner.close();
        }
    }
}

