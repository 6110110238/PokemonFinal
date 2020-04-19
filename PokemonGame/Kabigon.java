
public class Kabigon extends Pokemon {
    public Kabigon(String name){
        super(name, 100);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(10);
    }
}