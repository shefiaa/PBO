
package BangunDatar;
public class segitiga extends BangunDatar{
   int alas;
   int tinggi;
   int sisi;
    
   //GETTER AND SETTER
    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public segitiga(int alas, int tinggi, int sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
   @Override
   public float luas(){
       return this.alas * this.tinggi;
   }
   @Override
   public float keliling()
   {
    return this.sisi+this.sisi+this.sisi;
   }
}
    

