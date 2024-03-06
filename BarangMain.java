import java.util.Scanner;
public class BarangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang barang1 = new Barang("K01", "Sabun", 1000, 5);
        Barang barang2 = new Barang("K02", "Pasta Gigi", 2000, 10);
        Barang barang3 = new Barang("K03", "Biore", 3000, 23);
        Barang barang4 = new Barang("K04", "Sampo", 4000, 55);
        Barang barang5 = new Barang("K05", "Sikat Gigi", 5000, 65);

        TransaksiBarang transaksi = new TransaksiBarang();
        transaksi.barangs[transaksi.jml++] = barang1;
        transaksi.barangs[transaksi.jml++] = barang2;
        transaksi.barangs[transaksi.jml++] = barang3;       
        transaksi.barangs[transaksi.jml++] = barang4;
        transaksi.barangs[transaksi.jml++] = barang5;       

        while (true) {
            System.out.println("============================");
            System.out.println("       TOKO ROHMANALKA      ");
            System.out.println("============================");
            System.out.println("            MENU            ");
            System.out.println("============================");
            System.out.println("1. TAMPILKAN BARANG");
            System.out.println("2. BELI");
            System.out.println("3. TAMPILKAN BARANG BELI");   
            System.out.println("4. Keluar");
            System.out.println("============================");
            System.out.print("PILIH MENU: ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    transaksi.tampilkanBarang();
                    break;
                case "2":
                    System.out.print("Masukkan kode barang yang ingin dibeli: ");
                    String kodeBeli = sc.nextLine();
                    transaksi.melakukanPembelian(kodeBeli);
                    break;
                case "3":
                    transaksi.tampilkanBarangPembelian();
                    break;
                case "4":
                    System.out.println("TERIMAKASIH SUDAH BERBELANJA");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
    }
}