import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGame extends JFrame {
    private Trainer trainer;

    public MainGame(Trainer trainer){
        super("Pokemon Game");

        this.trainer = trainer;

        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel("Trainer: " + this.trainer.getName());

        JButton pokemonBag = new JButton("Pokemon in bag");
        JButton catchPokemon = new JButton("Catch Pokemon");

        c.add(trainerNameLabel);
        c.add(pokemonBag);
        c.add(catchPokemon);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        /*   String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";
        }
        pokemonName.setText(pName);   

        firstPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
                setVisible(false);
            }      
        });   */

        pokemonBag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonInBag pb = new PokemonInBag(trainer);
                setVisible(false);
            }
        });

        catchPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchPokemon cp = new CatchPokemon(trainer);
                setVisible(false);
            }      
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}