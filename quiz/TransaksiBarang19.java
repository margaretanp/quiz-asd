import java.util.ArrayList;

public class TransaksiBarang19 {
        private ArrayList<Barang19> barangs;

    public TransaksiBarang19() {
        this.barangs = new ArrayList<>();
    }

    public void tambahBarang(Barang19 barang) {
        this.barangs.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("=============================");
        System.out.println("        Daftar Barang");
        System.out.println("=============================");
        System.out.printf("%-40s %-15s %-15s %-15s \n", "Kode", "Nama", "Harga", "Stock");
        System.out.println("--------------------------------------------------------------------------");
        for (Barang19 barang : barangs) {
            System.out.printf("%-43s %-17s %-14s %-1s \n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }

    public void tampilkanPembelian() {
        System.out.println("=============================");
        System.out.println("        Daftar Pembelian");
        System.out.println("=============================");
        System.out.printf("%-40s %-15s %-15s %-15s \n", "Kode", "Nama", "Harga", "Stock");
        System.out.println("--------------------------------------------------------------------------");
        for (Barang19 barang : barangs) {
            System.out.printf("%-43s %-17s %-14s %-1s \n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }

    public void pembelian(String kode) {
        Barang19 barang = null;
        for (Barang19 b : barangs) {
            if (b.getKode().equals(kode)) {
                barang = b;
                break;
            }
        }

        if (barang != null) {
            if (barang.getStok() > 0) {
                barang.setStok(barang.getStok() - 1);
                System.out.println("Pembelian berhasil.");
            } else {
                System.out.println("Stok barang habis.");
            }
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

}
