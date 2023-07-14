
package BangunDatar;
public class jalankan {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        PersegiPanjang PersegiPanjang = new PersegiPanjang(4, 5);
        segitiga segitiga = new segitiga(6, 3, 4);
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println("Luas persegiPanjang: " + PersegiPanjang.luas());
        System.out.println("keliling persegiPanjang: " + PersegiPanjang.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("keliling segitiga: " + segitiga.keliling());
       
        
       
    }
}

       
        
       
        
    

