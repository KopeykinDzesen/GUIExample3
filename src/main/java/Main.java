import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FrammeDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");
        button.setActionCommand("123");
        button.addActionListener(new ButtonActionEvent());

        JButton button1 = new JButton("Button1");
        button1.setActionCommand("234");
        button1.addActionListener(new ButtonActionEvent());

        JButton button2 = new JButton("Button2");
        button2.setActionCommand("345");
        button2.addActionListener(new ButtonActionEvent());

        Object[][] rowData = {{"1 1", "1 2", "1 3"}, {"2 1", "2 2", "2 3"}};
        Object[] columnNames = {"Колонка1", "Колонка2", "Колонка3"};

        JTable table = new JTable(rowData, columnNames);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.PAGE_AXIS));
        jPanel.add(table);
        jPanel.add(button);
        jPanel.add(button1);
        jPanel.add(button2);

        frame.add(jPanel);
//        frame.pack();
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
