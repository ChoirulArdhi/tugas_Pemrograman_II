package pertemuan8;

public class methodgetterandsetter {
    public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("Ardhi");
        user.SetPassword("45678");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Psswordnya = " + user.GetPassword());
    }
}
