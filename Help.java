package sudoku;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @steve Jobs
 */
public class Help extends JFrame {

    Help help = new Help();
    JLabel sudoku = new JLabel("Sudoku");
    Color sud = new Color(0, 0, 0);
    Font sudo = new Font("Serif", Font.BOLD + Font.CENTER_BASELINE, 40);
    Font font = new Font("SERIF", Font.BOLD + Font.ITALIC, 28);
    JLabel label1 = new JLabel("put numbre from one to nine ");
    JLabel label2 = new JLabel("in every row and column");

    JLabel label3 = new JLabel("but try to avoid to put ");
    JLabel label4 = new JLabel("two numbers similar to each other");
    JLabel label5 = new JLabel("in the same row or column");
    JLabel label6 = new JLabel("another thing this is an intelligence game.");
    Color color = new Color(0, 10, 46);

    JButton btn = new JButton(new ImageIcon("Images//quit_black.gif"));

    public Help() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sudoku");
        this.setSize(700, 500);
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));

        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);

        label1.setForeground(color);
        label2.setForeground(color);
        label3.setForeground(color);
        label4.setForeground(color);
        label5.setForeground(color);
        label6.setForeground(color);

        this.setContentPane(new JLabel(new ImageIcon("Images//back.gif")));
        setLayout(null);
        label1.setBounds(120, 110, 500, 40);
        add(label1);
        label2.setBounds(120, 150, 500, 40);
        add(label2);
        label3.setBounds(120, 190, 500, 40);
        add(label3);
        label4.setBounds(120, 230, 500, 40);
        add(label4);

        label5.setBounds(120, 270, 500, 40);
        add(label5);
        label6.setBounds(120, 310, 500, 40);
        add(label6);

        sudoku.setFont(sudo);
        sudoku.setForeground(sud);

        sudoku.setBounds(280, 50, 200, 50);

        add(sudoku);
        btn.setBounds(225, 350, 250, 100);
        btn.setFont(sudo);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(HAND_CURSOR));
        btn.setRolloverIcon(new ImageIcon("Images//quit_white.gif"));
        add(btn);
        btn.addActionListener(new action());

    }

    public class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
}
