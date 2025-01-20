package pertemuan10;

public class Segitiga extends BangunDatar{
    int alas;
    int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
        return (1/2 * this.alas) * this.tinggi;
    }
}
