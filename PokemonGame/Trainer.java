import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private Scanner sc;
    private String name;

    public Trainer(String name){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu"));
        sc = new Scanner(System.in);

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void play(){
        String cmd = "";
        do{
            System.out.print("\n\nEnter cmd: ");
            cmd = sc.nextLine();

            if(cmd.equals("print")){
                System.out.println("\n\nPokemon in bag: ");
                printPokemon(bag);
            }
            else if(cmd.equals("catch")){
                catchPokemon();
            }
            else if(cmd.equals("feed")){
                feedPokemon();
            }
        }while(!cmd.equals("q"));
    }

    public void catchPokemon(){
        System.out.println("Catch Pokemons");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(5);

        System.out.println("\n\nPokemon around you");
        int no = 0;
        printPokemon(pokemons);

        System.out.print("\n\nSelect pokemon or run(-1): ");
        no = sc.nextInt();
        if(no<0){
            sc.nextLine();
            return;
        }
                        
        Pokemon wildPokemon = pokemons.get(no);

        System.out.println("\n\nPokemon in bag: ");
        printPokemon(bag);
        System.out.print("Select pokemon in bag: ");
 
        no = sc.nextInt();
        Pokemon myPokemon = bag.get(no);

        boolean isWin = false;
        do{
            myPokemon.attack(wildPokemon);
            if(wildPokemon.getHp() == 0){
                isWin = true;
                break;
            }
            
            wildPokemon.attack(myPokemon);
            if(myPokemon.getHp() == 0){
                isWin = false;
                break;
            }
        }while(true);

        if(isWin){
            System.out.println("You catch: " + wildPokemon.getName());
            bag.add(wildPokemon);
        }
        else{
            System.out.println(wildPokemon.getName() + " win");

        }

        sc.nextLine();
    }

    public void feedPokemon(){
        System.out.println("Feed Pokemons");
        System.out.println("\n\nPokemon in bag: ");
        printPokemon(bag);
        System.out.print("Select pokemon in bag: ");

        int no = 0; 
        no = sc.nextInt();
        Pokemon myPokemon = bag.get(no);

        myPokemon.getFeed();
        sc.nextLine();

    }

    public void printPokemon(ArrayList<Pokemon> pokemons){
        int number = 0;
        for(Pokemon p: pokemons){
            System.out.println("No." + number + " " + p + " HP: " + p.getHp());
            number++;
        }
    }

    public ArrayList<Pokemon> getBag(){
        return bag;
    }
}