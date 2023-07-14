
package KendaraanDarat;
public class sepeda extends KendaraanDarat {
    private String Roda_dua;
  
   sepeda(String namaKendaraanX, String merekX, String jenis_kendaraanX,String WarnaX, String RodduaX)
   { 
    super(namaKendaraanX, merekX, jenis_kendaraanX, WarnaX);
    Roda_dua = RodduaX;
    }
      public void viewSepeda()
      {
          System.out.println("Tahun  :"+Roda_dua);
   }    
}

