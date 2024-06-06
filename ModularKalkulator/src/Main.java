import java.util.Scanner;
import com.modular.system.operator.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kalkulator sederhana dengan penerapan modular function");
            System.out.print("Masukkan Angka pertama : ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan Angka kedua : ");
            int angka2 = scanner.nextInt();

            System.out.print("Pilih Operasi (+, - , *, /) : ");
            char operasi = scanner.next().charAt(0);

            int hasil;

            switch (operasi) {
                case '+':
                    hasil = Penjumlahan.hitung(angka1, angka2);
                    break;
                case '-':
                    hasil = Pengurangan.hitung(angka1, angka2);
                    break;
                case '*':
                    hasil = Perkalian.hitung(angka1, angka2);
                    break;
                case '/':
                    hasil = Pembagian.hitung(angka1, angka2);
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
                    return;

            }
            System.out.println("Hasil: " + hasil);
//            scanner.close();
            BersihLayar.main();


        }
    }
}