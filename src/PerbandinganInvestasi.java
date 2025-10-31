import java.text.DecimalFormat;

/**
 * Kelas {@code PerbandinganInvestasi} digunakan untuk membandingkan dua
 * skenario investasi berbeda — baik dari segi bunga, durasi, atau saldo awal.
 * <p>
 * Kelas ini memperluas fungsionalitas agar pengguna dapat melihat
 * perbedaan hasil akhir antar dua investasi dengan format tabel rapi.
 *
 * <p><b>Contoh penggunaan:</b>
 * <pre>{@code
 * DataInvestasi a = new DataInvestasi(10000000, 3, 5);
 * DataInvestasi b = new DataInvestasi(10000000, 4, 5);
 * PerbandinganInvestasi.bandingkan(a, b, true);
 * }</pre>
 */
class PerbandinganInvestasi {

    /** Formatter untuk menampilkan nilai rupiah. */
    private static final DecimalFormat FORMAT_RUPIAH = new DecimalFormat("Rp #,###.00");

    /**
     * Membandingkan dua data investasi dan menampilkan hasil perbandingan.
     *
     * @param data1   investasi pertama
     * @param data2   investasi kedua
     * @param majemuk true jika bunga majemuk, false jika bunga sederhana
     */
    public static void bandingkan(DataInvestasi data1, DataInvestasi data2, boolean majemuk) {
        double hasil1 = majemuk
                ? KalkulatorBunga.hitungSaldoMajemuk(data1)
                : KalkulatorBunga.hitungSaldoAkhir(data1);

        double hasil2 = majemuk
                ? KalkulatorBunga.hitungSaldoMajemuk(data2)
                : KalkulatorBunga.hitungSaldoAkhir(data2);

        System.out.println("\n=== PERBANDINGAN INVESTASI ===");
        System.out.printf("%-25s%-20s%-20s%n", "Parameter", "Investasi 1", "Investasi 2");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-25s%-20.2f%-20.2f%n", "Saldo Awal", data1.saldoAwal, data2.saldoAwal);
        System.out.printf("%-25s%-20.2f%-20.2f%n", "Bunga Tahunan (%)", data1.bungaTahunan, data2.bungaTahunan);
        System.out.printf("%-25s%-20.2f%-20.2f%n", "Durasi (tahun)", data1.durasiTahun, data2.durasiTahun);
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-25s%-20s%-20s%n", "Saldo Akhir",
                FORMAT_RUPIAH.format(hasil1), FORMAT_RUPIAH.format(hasil2));

        double selisih = hasil2 - hasil1;
        System.out.println("\nPerbedaan hasil akhir: " + FORMAT_RUPIAH.format(selisih));
        System.out.println(selisih > 0
                ? "Investasi 2 memberikan hasil yang lebih tinggi."
                : "Investasi 1 memberikan hasil yang lebih tinggi atau sama.");
    }
}
