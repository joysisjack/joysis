
package day17.activity;

public class Character {
    String name, classType;
    int level;
    double coins;
    
    public Character(String name, String classType){
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.coins = 100;
        System.out.println("Character created successfully!");
    }
    
    public void basicAttack(){
        System.out.println(name + " is attacking!");
    }
    public void recall(){
        System.out.println(name + " is recalling!");
    }
    public void useSkill(int skill){
        switch(skill){
            case 1:
                System.out.println(name + " is using skill 1");
                break;
            case 2:
                System.out.println(name + " is using skill 2");
                break;
            case 3:
                System.out.println(name + " is using ultimate skill");
                break;
            default:
                System.out.println("Invalid action!");
                break;  
        }
    }
}
