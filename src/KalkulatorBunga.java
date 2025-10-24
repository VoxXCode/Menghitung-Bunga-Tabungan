/**
 * Kelas ini berfungsi untuk menampung semua logika perhitungan.
 */
class KalkulatorBunga {
    // Replace Magic Number: 100 diganti dengan konstanta.
    private static final double PERSEN_DIVISOR = 100.0;

    /**
     * Menghitung saldo akhir menggunakan data yang dikelompokkan.
     * Metode ini dipindahkan (Move Method) dari kelas Main.
     * * @param data Objek yang berisi saldo awal, bunga, dan durasi.
     * @return Saldo akhir.
     */
    public static double hitungSaldoAkhir(DataInvestasi data) {
        // Rumus Bunga Sederhana: SaldoAkhir = SaldoAwal + (SaldoAwal * Bunga / 100 * Lama)
        return data.saldoAwal + (data.saldoAwal * data.bungaTahunan / PERSEN_DIVISOR * data.durasiTahun);
    }
}