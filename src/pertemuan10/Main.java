package pertemuan10;

public class Main {
    public static void main(String[] args) {
        BangunDatar BangunD = new BangunDatar();
        Persegi persegi = new Persegi(5);
        Segitiga segitiga = new Segitiga(5, 10);
        Lingkaran lingkaran = new Lingkaran(10);
        
        //Panggil method luas dan keliling
        BangunD.luas();
        BangunD.keliling();
        
        System.out.println("Luas persegi : " + persegi.luas());
        System.out.println("Keliling persegi : " + persegi.keliling());
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
}
