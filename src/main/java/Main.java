import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FrammeDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button 1");
        button.setActionCommand("123");
        button.addActionListener(new ButtonActionEvent());

        Object[][] rowData = {{"1 1", "1 2", "1 3"}, {"2 1", "2 2", "2 3"}};
        Object[] columnNames = {"Колонка1", "Колонка2", "Колонка3"};

        JTable table = new JTable(rowData, columnNames);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.PAGE_AXIS));
        jPanel.add(table);
        jPanel.add(button);

        frame.add(jPanel);
//        frame.pack();
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
