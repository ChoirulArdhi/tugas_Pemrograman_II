package pertemuan6;

public class keyword_this {
    public static void main(String[] args){
        //Membuat objek dari kelas user
        User user = new User();
        
        user.setUsername("Ardhi");
        user.setPassword("45678");
        
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
