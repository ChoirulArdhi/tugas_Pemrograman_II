package pertemuanke3_3;

public class persegiPanjangParameter {
    public void luasPersegiProsedur(int p, int l) {
        int luas = p * l;
        System.out.println("Luas persegi = " + luas);
    }
    
     public int kelilingPersegiFungsi (int p, int l){
        int keliling = 2 * (p+l);
        return keliling;
    }
    
    public static void main(String[] args) {
        persegiPanjangParameter ppp = new persegiPanjangParameter ();
        ppp.luasPersegiProsedur(20, 5);
        ppp.luasPersegiProsedur(30, 10);
        System.out.println(ppp.kelilingPersegiFungsi(9, 3));
        ppp.kelilingPersegiFungsi(90, 8);
        
    }
}
