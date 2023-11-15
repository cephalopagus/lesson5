import templates.Boss;
import templates.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(100, 250, "Levitation");
        Hero hero2 = new Hero(999, 1000);

        System.out.println("Здоровье героя - " + hero.getHealth() + "\tУрон героя - " + hero.getDamage() + "\tСуперспособность героя - " + hero.getSuperpower());
        System.out.println("Здоровье героя - " + hero2.getHealth() + "\tУрон героя - " + hero2.getDamage());


        Boss boss = new Boss();
        boss.setHealth(100000);
        boss.setDamage(999999999);
        boss.setProtection("Protective Barrier");

        System.out.println("\nЗдоровье главного босса - " + boss.getHealth() + "\tУрон главного босса - " + boss.getDamage() + "\nЗащита главного босса - " + boss.getProtection()+"\n");

        createHero();
    }
    public static Hero[] createHero(){

        Hero[] massive_hero = new Hero[3];


        massive_hero[0] = new Hero(100, 250, "Levitation");
        massive_hero[1] = new Hero(999, 1000);
        massive_hero[2] = new Hero(23213, 421425);

        for (int i = 0; i < massive_hero.length; i++) {
            if (massive_hero[i].getSuperpower()==null){
                System.out.println("Герой номер "+ i+ "         "+massive_hero[i].getHealth()+"        "+massive_hero[i].getDamage());
            }
            else {
                System.out.println("Герой номер "+ i+ "         "+ massive_hero[i].getHealth()+"        "+massive_hero[i].getDamage()+"         "+massive_hero[i].getSuperpower());
            }
        }
        return massive_hero;
    }
}