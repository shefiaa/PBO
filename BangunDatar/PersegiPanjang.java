
package BangunDatar;
public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;

    public PersegiPanjang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //GETTER AND SETTER
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float luas() {
        return this.panjang * this.lebar;
        
    }
    @Override
    public float keliling()
    {
       return 2*(this.panjang+this.lebar);
        
    }
}

    

