import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonInBag extends JFrame {
    Trainer trainer;

    public PokemonInBag(Trainer trainer){
        super("Pokemon in bag");
        this.trainer = trainer;

        Container c = getContentPane();
        JLabel status = new JLabel();        
        JButton home = new JButton("Back");

        c.add(status);
        c.add(home);

        String pStatus = "";
        for(Pokemon p: trainer.getBag()){
            pStatus += "Name: " + p.getName() + " HP: " + p.getHp() + "\n";
        }
        status.setText(pStatus); 
        
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