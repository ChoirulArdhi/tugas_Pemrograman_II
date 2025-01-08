package pertemuanke3_3;

public class persegiPanjangStatic {
     public static void luasPersegiProsedur(int p, int l) {
        int luas = p * l;
        System.out.println("Luas persegi panjang = " + luas);
    }
    
     public static int kelilingPersegiFungsi (int p, int l){
        int keliling = 2 * (p+l);
        return keliling;
    }
    
    public static void main(String[] args) {
        luasPersegiProsedur(20, 5);
        luasPersegiProsedur(30, 10);
        System.out.println("Keliling = " + kelilingPersegiFungsi(9, 3));
        
        
    }
}
