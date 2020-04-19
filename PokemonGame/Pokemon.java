public abstract class Pokemon {
    protected String name;
    protected int hp;
    protected int oldhp;

    public Pokemon(String name){
        this.name = name;
        this.hp = 0;
    }

    public Pokemon(String name, int maxHp){
        this.name = name;
        this.hp = (int)(Math.random() * maxHp);
        this.oldhp = this.hp;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public void getFeed(){
        this.hp = this.oldhp;
    }

    public boolean damage(int value){
        if(hp == 0){
            return false;
        }
        int currentHP = hp - value;
        if(currentHP >= 0){
            this.hp = currentHP;
        }
        else{
            this.hp = 0;
        }
        return true; 
    }

    public abstract void attack(Pokemon enemy);

}