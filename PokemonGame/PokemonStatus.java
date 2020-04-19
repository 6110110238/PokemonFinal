import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame {
    Pokemon pokemon;
    
    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status: " + pokemon.getName());
        this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel("Name: " + pokemon.getName());
        JLabel hp = new JLabel("HP: " + pokemon.getHp());

        c.add(name);
        c.add(hp);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        setSize(400, 200);
        setVisible(true);
    }

}