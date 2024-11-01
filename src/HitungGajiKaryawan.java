import java.util.Scanner;

/**
 * Program untuk menghitung gaji bersih karyawan setelah potongan pajak dan penambahan tunjangan.
 */
public class HitungGajiKaryawan {

    /**
     * Metode utama yang meminta input gaji pokok, persentase pajak, dan tunjangan,
     * lalu menghitung dan menampilkan gaji bersih.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();

        // Input persentase pajak
        System.out.print("Masukkan persentase potongan pajak (contoh: 10 untuk 10%): ");
        double persentasePajak = scanner.nextDouble();

        // Input tunjangan
        System.out.print("Masukkan tunjangan: ");
        double tunjangan = scanner.nextDouble();

        // Menghitung potongan pajak
        double potonganPajak = gajiPokok * (persentasePajak / 100);

        // Menghitung gaji bersih
        double gajiBersih = gajiPokok - potonganPajak + tunjangan;

        // Menampilkan hasil
        System.out.println("\nGaji Pokok: Rp " + gajiPokok);
        System.out.println("Potongan Pajak (" + persentasePajak + "%): Rp " + potonganPajak);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);

        scanner.close();
    }
}