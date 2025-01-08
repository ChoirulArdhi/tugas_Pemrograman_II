package pertemuan2;
import javax.swing.JOptionPane;

public class luaslingkaran {

    
    public static void main(String[] args) {
        double phi = 3.14;
        String r = JOptionPane.showInputDialog("Masukkan Input jari-jari");
        double luas = phi * Double.parseDouble(r) * Double.parseDouble(r) ;
        
        System.out.println(luas);
    }
    
};
