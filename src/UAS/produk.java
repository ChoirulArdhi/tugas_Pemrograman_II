package UAS;

public class produk {
    private int id;
    private String nama;
    private float harga;
    private String tanggal;
    private byte[] gambar;
    
    public produk (int pid, String pnama, float pharga, String ptanggal, byte[] pgambar){
        this.id = pid;
        this.nama = pnama;
        this.harga = pharga;
        this.tanggal = ptanggal;
        this.gambar = pgambar;
}
    public int getid(){
        return id;
    }
    
    public String getname(){
        return nama;
    }
    
    public float getprice(){
        return harga;
    }
    
    public String getadddate(){
        return tanggal;
    }
    
    public byte[] getimage(){
        return gambar;
    }
}


