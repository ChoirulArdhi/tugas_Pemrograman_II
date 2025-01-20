package pertemuan7;

public class Userparameter {
    public String username;
    public String password;
    
    public Userparameter(String username, String password){
        this.username = username;
        this.password = password;
    }

    Userparameter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

class DemoConstructor{
    public static void main(String[] args){
        Userparameter petani = new Userparameter("petanikode","kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
}
}
