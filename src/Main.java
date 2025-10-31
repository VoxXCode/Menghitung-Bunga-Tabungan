import java.util.Scanner;

public class Main {

    // Metode utama kini fokus pada I/O dan koordinasi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel yang lebih deskriptif
        double saldoAwal;
        double bungaTahunan; // Rename Variable: 'bunga' menjadi 'bungaTahunan'
        double durasiTahun;  // Rename Variable: 'lama' menjadi 'durasiTahun'

        // Memisahkan proses input ke metode lain (Extract Method) untuk kebersihan kode
        saldoAwal = ambilInputDouble(input, "Masukkan saldo awal: ");
        bungaTahunan = ambilInputDouble(input, "Masukkan bunga per tahun (%): ");
        durasiTahun = ambilInputDouble(input, "Masukkan lama menabung (tahun): ");

        // Membuat objek parameter
        DataInvestasi data = new DataInvestasi(saldoAwal, bungaTahunan, durasiTahun);

        // Inline Variable: Variabel 'saldoAkhir' dihilangkan dan perhitungan
        // langsung dipanggil dan dicetak.
        System.out.println("Saldo akhir Anda adalah: " + KalkulatorBunga.hitungSaldoAkhir(data));

        input.close();
    }

    /**
     * Teknik Refactoring: Extract Method.
     * Metode ini mengekstrak logika input berulang dari main.
     */
    private static double ambilInputDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }//
}