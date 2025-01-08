package Inheritance;

public class main {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        pocong hantuPocong = new pocong();
        zombie zombi = new zombie();
        burung garuda = new burung();
        
        garuda.attack();
        garuda.hp = 100;
        hantuPocong.hp = 90;
        zombi.hp = 80;
        int php = hantuPocong.hp;
        int ghp = garuda.hp;
        int zhp = zombi.hp;
        
        garuda.name = "phinx";
        zombi.name = "John";
        zombi.attack();
        System.out.println("garuda hp = " + ghp);
        System.out.println("Pocong hp = " + php);
        System.out.println("zombi hp = " + zhp);
    }
}
