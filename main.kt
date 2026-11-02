
class Kasir {
    public var namaBarang = "Buku"
    public var harga = 5000
    private var jumlah = 2

    public fun ubahJumlah(jumlahBaru: Int) {
        jumlah = jumlahBaru
    }

    public fun hitungTotal() {
        val total = harga * jumlah

        println("=== PROGRAM KASIR ===")
        println("Nama Barang: $namaBarang")
        println("Harga: Rp$harga")
        println("Jumlah: $jumlah")
        println("Total Bayar: Rp$total")
    }
}

fun main() {
    val transaksi = Kasir()

    transaksi.namaBarang = "Pensil"
    transaksi.harga = 3000
    transaksi.ubahJumlah(5)

    transaksi.hitungTotal()
}
