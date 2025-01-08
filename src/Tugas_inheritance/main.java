package Tugas_inheritance;

public class main {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Ayam a = new Ayam();
        Singa s = new Singa();
        a.nama = "Ayam";
        System.out.println("Saya " + a.nama);
        a.makan();
        a.Omnivora();
        a.kaki = 2;
        
    }   
}
