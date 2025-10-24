/**
 * Kelas ini berfungsi sebagai Parameter Object untuk mengelompokkan
 * semua data yang diperlukan untuk perhitungan bunga.
 */
class DataInvestasi {
    public final double saldoAwal;
    public final double bungaTahunan;
    public final double durasiTahun; // Rename Variable: 'lama' menjadi 'durasiTahun'

    public DataInvestasi(double saldoAwal, double bungaTahunan, double durasiTahun) {
        this.saldoAwal = saldoAwal;
        this.bungaTahunan = bungaTahunan;
        this.durasiTahun = durasiTahun;
    }
}