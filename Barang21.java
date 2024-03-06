class Barang {
    String kode;
    String nama;
    int harga;
    int stok;
    int stokAwal;

    public Barang(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        stokAwal = stokAwal;
    }
}

class TransaksiBarang {
    Barang[] barangs = new Barang[5];
    int jml = 0;

    public void tampilkanBarang() {
        System.out.println("Daftar Barang:");
        for (int i = 0; i < jml; i++) {
            Barang barang = barangs[i];
            System.out.println("Kode: " + barang.kode + ", Nama: " + barang.nama + ", Harga: " + barang.harga + ", Stok: " + barang.stok);
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("BARANG YANG TELAH DIBELI:");
        for (int i = 0; i < jml; i++) {
            Barang barang = barangs[i];
            if (barang.stok < barang.stokAwal) {
                System.out.println("Kode: " + barang.kode + ", Nama: " + barang.nama + ", Harga: " + barang.harga);
            }
        }
    }

    public void melakukanPembelian(String kodeBeli) {
        for (int i = 0; i < jml; i++) {
            Barang barang = barangs[i];
            if (barang.kode.equals(kodeBeli)) {
                if (barang.stok > 0) {
                    barang.stok--;
                    System.out.println("Anda telah membeli " + barang.nama);
                } else {
                    System.out.println("Stok " + barang.nama + " habis.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kodeBeli + " tidak ditemukan.");
    }
}