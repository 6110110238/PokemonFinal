import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BattlePokemon extends JFrame {

    public BattlePokemon(){
        super("Pokemon Battle");
        
        Container c = getContentPane();

        JLabel intro = new JLabel("Battle Pokemon");
        
        c.add(intro);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setSize(400, 200);
        setVisible(true);
    }
}