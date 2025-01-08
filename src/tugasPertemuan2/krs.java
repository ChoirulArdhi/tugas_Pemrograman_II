package tugasPertemuan2;
import java.util.Scanner;

public class krs {
    public static void main(String[] args) {
        //pemanggilan
        masterVariabel m=new masterVariabel();
        data d=new data();
                
        Scanner nilai=new Scanner(System.in);
        System.out.println("============================================================================================");
        System.out.println("                                        KRS");
        System.out.println("============================================================================================");
        
//untuk inputan
        int nomor,i,hari;
        
        System.out.println("LOGGIN : ");
        System.out.println("1. Masuk");
        System.out.println("2. Keluar");
        System.out.print("Masukkan : ");
        nomor=nilai.nextInt();
       
        if(nomor==1){
            System.out.println("============================================================================================");
            System.out.println("============================================================================================");
            System.out.println("  Mahasiswa           : "+d.nama);
            System.out.println("  Dosen Wali          : "+d.wali);
            System.out.println("  Fakultas            : "+d.fakultas +"        Data                : "+d.data);
            System.out.println("  Jurusan             : "+d.prodi);
            System.out.println("  Jenis Kelamin       : "+d.jk +"                NIDN Dosen          : "+d.nidn);
            System.out.println("  Kur / Smt / SKS     : "+d.smt +"                Batas SKS Diambil   : "+d.sks);
            System.out.println("============================================================================================");
            System.out.println("============================================================================================"); 
            
            System.out.println("Menu : ");
            System.out.println("1.Mata Kuliah");
            System.out.println("2.Dosen Matkul");
            System.out.println("3.Jadwal Hari");
            System.out.print("Pilih : ");
            i=nilai.nextInt();
            
            switch (i){
                case 1:
                    System.out.println("============================================================================================");
                    System.out.println("|| NO ||   Code   ||             Nama Matkul            ||  SKS  ||         Waktu         ||");
                    System.out.println("============================================================================================");
                    System.out.println("|| 1  ||"+m.code[0]+" || "+m.Matkul[0]+" ||   "+m.sks[0]+"   || "+m.waktu[0]+"  ||");
                    System.out.println("|| 2  ||"+m.code[1]+" || "+m.Matkul[1]+"                   ||   "+m.sks[1]+"   || "+m.waktu[1]+"  ||");
                    System.out.println("|| 3  ||"+m.code[2]+" || "+m.Matkul[2]+"                   ||   "+m.sks[2]+"   || "+m.waktu[2]+"  ||");
                    System.out.println("|| 4  ||"+m.code[3]+" || "+m.Matkul[3]+"                     ||   "+m.sks[3]+"   || "+m.waktu[3]+"   ||");
                    System.out.println("|| 5  ||"+m.code[4]+" || "+m.Matkul[4]+"                  ||   "+m.sks[4]+"   || "+m.waktu[4]+" ||");
                    System.out.println("|| 6  ||"+m.code[5]+" || "+m.Matkul[5]+"        ||   "+m.sks[5]+"   || "+m.waktu[5]+" ||");
                    System.out.println("|| 7  ||"+m.code[6]+" || "+m.Matkul[6]+"          ||   "+m.sks[6]+"   || "+m.waktu[6]+"  ||");
                    System.out.println("============================================================================================");
                    System.out.println("||      Total SKS yang Diambil                          ||   "+m.totalsks+"  ||                       ||");
                    System.out.println("============================================================================================");
                    break;
            
                case 2:
                    System.out.println("=========================================================================================================");
                    System.out.println("|| NO ||   Code   ||             Nama Matkul            ||  SKS  ||               Dosen                ||");
                    System.out.println("=========================================================================================================");
                    System.out.println("|| 1  ||"+m.code[0]+" || "+m.Matkul[0]+" ||   "+m.sks[0]+"   || "+m.dosen[6]);
                    System.out.println("|| 2  ||"+m.code[1]+" || "+m.Matkul[1]+"                   ||   "+m.sks[1]+"   || "+m.dosen[0]);
                    System.out.println("|| 3  ||"+m.code[2]+" || "+m.Matkul[2]+"                   ||   "+m.sks[2]+"   || "+m.dosen[1]);
                    System.out.println("|| 4  ||"+m.code[3]+" || "+m.Matkul[3]+"                     ||   "+m.sks[3]+"   || "+m.dosen[2]);
                    System.out.println("|| 5  ||"+m.code[4]+" || "+m.Matkul[4]+"                  ||   "+m.sks[4]+"   || "+m.dosen[5]);
                    System.out.println("|| 6  ||"+m.code[5]+" || "+m.Matkul[5]+"        ||   "+m.sks[5]+"   || "+m.dosen[4]);
                    System.out.println("|| 7  ||"+m.code[6]+" || "+m.Matkul[6]+"          ||   "+m.sks[6]+"   || "+m.dosen[3]);
                    System.out.println("=========================================================================================================");
                    System.out.println("        Total SKS yang Diambil                          ||   "+m.totalsks+"  ||                       ");
                    System.out.println("=========================================================================================================");
                    break;
                    
                case 3:
                    System.out.println("=========================================================================================================");
                    System.out.println("Pilih Hari Perkuliahan : ");
                    System.out.println("1. Senin"); System.out.println("2. Selasa");
                    System.out.println("3. Rabu"); System.out.println("4. Kamis");
                    System.out.println("5. Jum'at"); System.out.println("6. Sabtu");
                    System.out.print("Masukkan : ");
                    hari=nilai.nextInt();
                    System.out.println("=========================================================================================================");
                    
                    
                    switch (hari){
                        case 1:
                        System.out.println("Senin :");
                        System.out.println("Tidak Ada Jadwal");
                        break;
                        
                        case 2:
                        System.out.println("Selasa :");
                        System.out.println("1. "+m.Matkul[4]+" / "+m.waktu[4]+" / "+m.dosen[5]);
                        System.out.println("1. "+m.Matkul[5]+" / "+m.waktu[5]+" / "+m.dosen[4]);
                        break;
                        
                        case 3:
                        System.out.println("Rabu :");
                        System.out.println("1. "+m.Matkul[3]+" / "+m.waktu[3]+" / "+m.dosen[2]);
                        break;
                        
                        case 4:
                        System.out.println("Kamis :");
                        System.out.println("1. "+m.Matkul[2]+" / "+m.waktu[2]+" / "+m.dosen[1]);
                        System.out.println("1. "+m.Matkul[1]+" / "+m.waktu[1]+" / "+m.dosen[0]);
                        break;
                        
                        case 5:
                        System.out.println("Jum'at :");
                        System.out.println("1. "+m.Matkul[6]+" / "+m.waktu[6]+" / "+m.dosen[3]);
                        System.out.println("1. "+m.Matkul[0]+" / "+m.waktu[0]+" / "+m.dosen[6]);
                        break;
                        
                        case 6:
                        System.out.println("Sabtu :");
                        System.out.println("Tidak Ada Jadwal");
                        break;
                    }
            }     
           
        }
        
        else if(nomor==2){
            System.out.println("Selamat Tinggal dan Terima Kasih");
        }
        
        else{System.out.println("masukkan dengan tertera");}
           
    }
}
    
    

