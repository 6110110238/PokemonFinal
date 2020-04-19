import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectPokemon extends JFrame {
    Trainer trainer;
    Pokemon enemy;

    public SelectPokemon(Trainer trainer,Pokemon enemy){
        super("Select Pokemon");
        this.trainer = trainer;
        this.enemy = enemy;

        Container c = getContentPane();
        JLabel intro = new JLabel("Select your Pokemon");

        c.add(intro);

        for(Pokemon p: trainer.getBag()){
            JButton MyPokemon = new JButton("Name: " + p.getName() + "\nHP: " + p.getHp());

            c.add(MyPokemon);

            MyPokemon.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //BattlePokemon bp = new BattlePokemon(trainer , p);
                    setVisible(false);
                }      
            });
        }

    }

}