/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KendaraanDarat;
public class mobil extends KendaraanDarat {
  private String Roda_Empat;
  
   mobil(String namaKendaraanX,String merekX, String jenis_kendaraanX,String WarnaX, String RodempatX)
   { 
    super(namaKendaraanX, merekX, jenis_kendaraanX, WarnaX);
    Roda_Empat = RodempatX;
    }
      public void viewMobil()
      {
          System.out.println("tahun  :"+Roda_Empat);
   }    

    
}
