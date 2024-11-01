import java.util.Scanner;

/**
 * Program untuk menghitung gaji bersih karyawan setelah potongan pajak, potongan asuransi, dan penambahan tunjangan.
 */
public class HitungGajiKaryawan {

    /**
     * Metode utama yang meminta input gaji pokok, persentase pajak, tunjangan, dan potongan asuransi,
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

        // Input persentase asuransi
        System.out.print("Masukkan persentase potongan asuransi (contoh: 2 untuk 2%): ");
        double persentaseAsuransi = scanner.nextDouble();

        // Menghitung potongan pajak
        double potonganPajak = gajiPokok * (persentasePajak / 100);

        // Menghitung potongan asuransi
        double potonganAsuransi = gajiPokok * (persentaseAsuransi / 100);

        // Menghitung gaji bersih
        double gajiBersih = gajiPokok - potonganPajak - potonganAsuransi + tunjangan;

        // Menampilkan hasil
        System.out.println("\nGaji Pokok: Rp " + gajiPokok);
        System.out.println("Potongan Pajak (" + persentasePajak + "%): Rp " + potonganPajak);
        System.out.println("Potongan Asuransi (" + persentaseAsuransi + "%): Rp " + potonganAsuransi);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);

        scanner.close();
    }
}