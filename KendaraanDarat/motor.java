/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KendaraanDarat;
public class motor extends KendaraanDarat {
   private String Roda_Dua;
   motor(String namaKendaraanX, String merekX, String jenis_kendaraanX,String WarnaX, String RodDuaX)
   { 
    super(namaKendaraanX, merekX, jenis_kendaraanX, WarnaX);
    Roda_Dua = RodDuaX;
    }
      public void viewMotor()
      {
          System.out.println("Tahun  :"+Roda_Dua);
   }
}


