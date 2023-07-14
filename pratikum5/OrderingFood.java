import java.util.Scanner;
class Restoran{
    String NamaMenu;
    double harga = 0, PPN, totalharga, totalbayar, kembalian;
    int pilihan;
}
public class OrderingFood {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        Restoran order = new Restoran();
        System.out.println("SELAMAT DATANG DI RESTAURANT DAPUR LARISA");
        System.out.println("DISINI MENYEDIAKAN ANEKA MENU\n");
        int pilih;

        System.out.print("\n 1. AYAM BAKAR");
        System.out.print("\n 2. PECEL LELE");
        System.out.print("\n 3. SEAFOOD (KERANG - KERANGAN, KEPITING, UDANG) SAUS PADANG");
        System.out.print("\n 4. NASI GORENG AYAM");
        System.out.print("\n 5. NASI GORENG SEAFOD");
        System.out.print("\n 6. MIE GORENG SPESIAL");
        System.out.print("\n PILIHAN MENU");
        System.out.print("Pilih Menu : ");
        pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                order.NamaMenu = "AYAM BAKAR ";
                order.harga = 25000;
                break;

            case 2:
                order.NamaMenu = "PECEL LELE ";
                order.harga = 18000;
                break;

            case 3:
                order.NamaMenu = "SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG)SAUS PADANG ";
                order.harga = 80000;
                break;

            case 4:
                order.NamaMenu = "NASI GORENG AYAM ";
                order.harga = 20000;
                break;

            case 5:
                order.NamaMenu = "NASI GORENG SEAFOOD ";
                order.harga = 28000;
                break;

            case 6:
                order.NamaMenu = "MIE GORENG SPESIAL ";
                order.harga = 30000;
                break;
        }

        order.PPN = order.harga * 0.10;
        order.totalharga = order.harga + order.PPN;
        System.out.println("\nJumlah Harga : Rp " + order.harga);
        System.out.println("\nPPN : Rp " + order.PPN);
        System.out.println("\nTotal Harga : Rp " + order.totalharga);
        System.out.print("\nTotal Bayar : Rp ");
        order.totalbayar = scan.nextInt();
        order.kembalian = order.totalbayar - order.totalharga;
        System.out.println("\nKembalian : Rp " + order.kembalian);
    }
    
}