package pertemuan2;

public class luasLingkaranPbo {
    masterVariabel m = new masterVariabel();

    double luas = m.phi * m.r * m.r;
    public static void main(String[] args) {
        luasLingkaranPbo l = new luasLingkaranPbo();

        System.out.println("Luas lingkaran = "+l.luas);
    }
}