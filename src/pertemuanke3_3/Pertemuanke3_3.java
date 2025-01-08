package pertemuanke3_3;

public class Pertemuanke3_3 {
    int s = 20;
    
    public void luasPersegiProsedur () {
        int luas = s*s;
        System.out.println("sisi = " + s);
        System.out.println("Luas persegi = " + luas);
    }
    
    public int kelilingPersegiFungsi (){
        int keliling = 4*s;
        return keliling;
    }

    public static void main(String[] args) {
        Pertemuanke3_3  a = new Pertemuanke3_3 ();
        System.out.println(a.kelilingPersegiFungsi ());
        a.luasPersegiProsedur();
    }
    
}
