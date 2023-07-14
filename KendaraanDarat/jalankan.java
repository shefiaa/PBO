/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KendaraanDarat;
public class jalankan {
    public static void main(String[] args) {
        mobil mob = new mobil("Ahmad Riyaud","toyota","Mobil","Biru", "2020");
        motor mot = new motor("Siti Maysaroh","Beat","motor","Abu-Abu","2019");
        sepeda ped = new sepeda("indah mawar","Sepeda lipat United","sepeda","Hijau","2021");
        
        mob.view();
        mob.viewMobil();
        
        mot.view();
        mot.viewMotor();
        
        ped.view();
        ped.viewSepeda();
    }

}
