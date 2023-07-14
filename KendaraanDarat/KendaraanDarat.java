
package KendaraanDarat;

public class KendaraanDarat{
    protected String namaKendaraan;
    protected String merek;
    protected String jenis_kendaraan;
    protected String Warna;
    
    //Membuat Konstruktor
     KendaraanDarat(String namaKendaraanX, String merekX, String jenis_kendaraanX, String WarnaX)
    {
        namaKendaraan = namaKendaraanX;
        merek  = merekX;
        jenis_kendaraan =  jenis_kendaraanX;
        Warna = WarnaX;
        
    }
     
    public void view ()
    {
       System.out.println("Nama Pemilik :  "+namaKendaraan);
       System.out.println(" Merek :  "+merek);
       System.out.println("Jenis Kendaraan : "+jenis_kendaraan);
       System.out.println("Warna Kendaraan: "+Warna);


    }
}
