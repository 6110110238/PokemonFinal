import java.util.*;

public class PokemonGame {
    public static void main(String[] args){
        System.out.println("Welcome to my Pokemon");
        Trainer t = new Trainer("Rocket");
        MainGame mg = new MainGame(t);
        //t.play();
    }
}