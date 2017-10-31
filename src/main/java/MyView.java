import javax.swing.*;

public class MyView extends JFrame{

    public MyView(String s){

        super(s);

        JLabel label = new JLabel("Вы нажали на кнопку Button");

        add(label);

        setSize(250, 75);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
