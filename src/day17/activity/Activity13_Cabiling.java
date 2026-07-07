
package day17.activity;


public class Activity13_Cabiling {
    public static void main(String[] args) {
        Character exedy = new Character("Exedy" , "Gunner");
        Character fionah = new Character("Fionah" , "Support");
        exedy.basicAttack();
        exedy.recall();
        fionah.useSkill(1);
    }
}
