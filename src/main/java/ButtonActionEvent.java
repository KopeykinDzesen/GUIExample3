import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionEvent implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        if (command.equals("123")){
            new MyView("это моё окно");
        }
        if (command.equals("234")){
            JOptionPane.showMessageDialog(null, "Вы нажали на кнопку Button1");
        }
        if (command.equals("345")){
        }

    }

}
