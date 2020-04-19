import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CatchPokemon extends JFrame {
    Trainer trainer; 

    public CatchPokemon(Trainer trainer){
        super("Catch Pokemon");
        this.trainer = trainer;

        Container c = getContentPane();
        JLabel intro = new JLabel("Pokemon around you"); 
        JButton home = new JButton("Back");       

        c.add(intro);

        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(5);

        for(Pokemon p: pokemons){
            JButton enemyName = new JButton("Name: " + p.getName() + "\nHP: " + p.getHp());

            c.add(enemyName);

            enemyName.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    SelectPokemon sp = new SelectPokemon(trainer , p);
                    setVisible(false);
                }      
            });
        }
        c.add(home);

        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                MainGame h = new MainGame(trainer);
                setVisible(false);
            }      
        });

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setSize(400, 200);
        setVisible(true);
    }

}