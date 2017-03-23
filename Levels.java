/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @steve Jobs 
 */
public class Levels extends JFrame {

    static String level = "level1";
    static Levels Level = new Levels();
    ImageIcon icon1 = new ImageIcon("Images//level1.gif");
    ImageIcon icon2 = new ImageIcon("Images//level2.gif");
    ImageIcon icon3 = new ImageIcon("Images//level3.gif");
    ImageIcon icon4 = new ImageIcon("Images//level4.gif");
    ImageIcon icon5 = new ImageIcon("Images//level5.gif");
    ImageIcon icon6 = new ImageIcon("Images//level6.gif");

    JButton jbtlevel1 = new JButton(icon1);
    JButton jbtlevel2 = new JButton(icon2);
    JButton jbtlevel3 = new JButton(icon3);
    JButton jbtlevel4 = new JButton(icon4);
    JButton jbtlevel5 = new JButton(icon5);
    JButton jbtlevel6 = new JButton(icon6);

    public Levels() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setUndecorated(true);
        this.setResizable(false);

        setContentPane(new JLabel(new ImageIcon("Images//load.jpg")));

        setLayout(null);

        // level 1
        trans(jbtlevel1);
        jbtlevel1.setBounds(230, 100, 350, 100);
        jbtlevel1.setRolloverIcon(new ImageIcon("Images//1.gif"));
        add(jbtlevel1);
        // level 2
        trans(jbtlevel2);
        jbtlevel2.setBounds(230, 300, 350, 100);
        jbtlevel2.setRolloverIcon(new ImageIcon("Images//2.gif"));
        add(jbtlevel2);
        // level 3
        trans(jbtlevel3);
        jbtlevel3.setBounds(230, 500, 350, 100);
        jbtlevel3.setRolloverIcon(new ImageIcon("Images//3.gif"));
        add(jbtlevel3);
        //level 4
        trans(jbtlevel4);
        jbtlevel4.setBounds(700, 100, 350, 100);
        jbtlevel4.setRolloverIcon(new ImageIcon("Images//4.gif"));
        add(jbtlevel4);
        // level 5
        trans(jbtlevel5);
        jbtlevel5.setBounds(700, 300, 350, 100);
        jbtlevel5.setRolloverIcon(new ImageIcon("Images//5.gif"));
        add(jbtlevel5);
        // level 6
        trans(jbtlevel6);
        jbtlevel6.setBounds(700, 500, 350, 100);
        jbtlevel6.setRolloverIcon(new ImageIcon("Images//6.gif"));
        add(jbtlevel6);
        
        
        // actions 
        jbtlevel1.addActionListener(new action());
        jbtlevel2.addActionListener(new action());
        jbtlevel3.addActionListener(new action());
        jbtlevel4.addActionListener(new action());
        jbtlevel5.addActionListener(new action());
        jbtlevel6.addActionListener(new action());

    }

    public class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object o = e.getSource();
            if (o.equals(jbtlevel1)) {
                level =  level.replace(level.charAt(5), '1');
               Level.setVisible(false);
                
            } else if (o.equals(jbtlevel2)) {
              level =  level.replace(level.charAt(5), '2');
               Level.setVisible(false);

            } else if (o.equals(jbtlevel3)) {
                level =  level.replace(level.charAt(5), '3');
               Level.setVisible(false);

            } else if (o.equals(jbtlevel4)) {
                level =  level.replace(level.charAt(5), '4');
               Level.setVisible(false);
            } else if (o.equals(jbtlevel5)) {
                level =  level.replace(level.charAt(5), '5');
               Level.setVisible(false);
            } else {
                level =  level.replace(level.charAt(5), '6');
               Level.setVisible(false);
            }
        }

    }

    private void trans(JButton b) {

        b.setOpaque(false);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setCursor(new Cursor(HAND_CURSOR));
    }

}
