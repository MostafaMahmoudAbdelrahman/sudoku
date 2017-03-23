package sudoku;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @steve Jobs
 */
public class Back extends JFrame {
    
    Timer time_start;
    // buttons effects 
    Color color = new Color(54, 21, 2);
    Font font = new Font("SERIF", Font.ITALIC + Font.ROMAN_BASELINE, 60);
    Font font_button = new Font("SERIF", Font.ITALIC + Font.BOLD, 40);
    Font font_team = new Font("SERIF", Font.BOLD + Font.ITALIC, 23);
    Color color_team = new Color(255, 255, 255);
    // buttons 
    JButton btn_NewGame = new JButton("NEW GAME");
    JButton btn_levels = new JButton("LEVEL");
    JButton btn_HighScore = new JButton("HIGH SCORE");
    JButton btn_help = new JButton("HELP");
    JButton btn_about_team = new JButton("ABOUT TEAM");
    JButton btn_exit = new JButton("EXIT");
    JButton btn_sound = new JButton(new ImageIcon("Images//of.gif"));

    // label for about team
    JLabel label_team = new JLabel("");
    JLabel label_team2 = new JLabel("");
    JLabel label_team3 = new JLabel("");
    JLabel label_team4 = new JLabel("");
    JLabel label_team5 = new JLabel("");
    JLabel label_team6 = new JLabel("");
    JLabel label_team7 = new JLabel("");
    JLabel label_team8 = new JLabel("");
    JLabel label_team9 = new JLabel("");
    JLabel label_team10 = new JLabel("");
    JLabel label_team11 = new JLabel("");
    JLabel label_team12 = new JLabel("");
    JLabel label_team13 = new JLabel("");
    JLabel label_team14 = new JLabel("");

    char ch[] = print();
    static int i = 0;
    static String rep = "";

    // help button 
    JPanel panel_help = new JPanel();
    JLabel label_image_help = new JLabel(new ImageIcon("Images\\back.gif"));

    static Back back ;
    Back() throws Exception {

     
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setUndecorated(true);
        this.setContentPane(new JLabel(new ImageIcon("Images\\Background2.jpg")));

        // background panels for buttons 
        // button new game 
        btn_NewGame.setBounds(500, 240, 300, 40);
        transparancy(btn_NewGame);
        btn_NewGame.setFont(font_button);
        btn_NewGame.setCursor(new Cursor(HAND_CURSOR));
        btn_NewGame.addActionListener(new action());

        add(btn_NewGame);

        // button high
        btn_HighScore.setBounds(500, 360, 300, 40);
        transparancy(btn_HighScore);
        btn_HighScore.setFont(font_button);
        btn_HighScore.setCursor(new Cursor(HAND_CURSOR));
        btn_HighScore.addActionListener(new action());
        add(btn_HighScore);

        // help
        btn_help.setBounds(500, 420, 300, 40);
        transparancy(btn_help);
        btn_help.setFont(font_button);
        btn_help.setCursor(new Cursor(HAND_CURSOR));
        btn_help.addActionListener(new action());
        add(btn_help);
        // aboutte
        btn_about_team.setBounds(500, 480, 300, 40);
        transparancy(btn_about_team);
        btn_about_team.setFont(font_button);
        btn_about_team.setCursor(new Cursor(HAND_CURSOR));
        btn_about_team.addActionListener(new action());
        add(btn_about_team);

        // LEVEL 
        btn_levels.setBounds(500, 300, 300, 40);
        transparancy(btn_levels);
        btn_levels.setFont(font_button);
        btn_levels.setCursor(new Cursor(HAND_CURSOR));
        btn_levels.addActionListener(new action());
        add(btn_levels);

        // exit
        btn_exit.setBounds(500, 540, 300, 40);
        transparancy(btn_exit);
        btn_exit.setFont(font_button);
        btn_exit.setCursor(new Cursor(HAND_CURSOR));
        btn_exit.addActionListener(new action());
        add(btn_exit);

        // button of sound 
        btn_sound.setBounds(30, 20, 150, 150);
        transparancy(btn_sound);
        btn_sound.setCursor(new Cursor(HAND_CURSOR));
        btn_sound.addActionListener(new action());
        add(btn_sound);

        // labels for about team
        label_team.setBounds(80, 100, 300, 60);
        label_team.setBackground(Color.black);
        label_team.setFont(font_team);
        label_team.setForeground(color_team);
        add(label_team);
        // labels for about team2 
        label_team2.setBounds(80, 130, 300, 60);
        label_team2.setBackground(Color.black);
        label_team2.setFont(font_team);
        label_team2.setForeground(color_team);
        add(label_team2);
        // labels for about team3 
        label_team3.setBounds(80, 160, 300, 60);
        label_team3.setBackground(Color.black);
        label_team3.setFont(font_team);
        label_team3.setForeground(color_team);
        add(label_team3);
        // labels for about team4 
        label_team4.setBounds(80, 190, 300, 60);
        label_team4.setBackground(Color.black);
        label_team4.setFont(font_team);
        label_team4.setForeground(color_team);
        add(label_team4);
        // labels for about team4 
        label_team5.setBounds(80, 220, 300, 60);
        label_team5.setBackground(Color.black);
        label_team5.setFont(font_team);
        label_team5.setForeground(color_team);
        add(label_team5);
        // labels for about team4 
        label_team6.setBounds(80, 250, 300, 60);
        label_team6.setBackground(Color.black);
        label_team6.setFont(font_team);
        label_team6.setForeground(color_team);
        add(label_team6);
        // labels for about team4 
        label_team7.setBounds(80, 280, 300, 60);
        label_team7.setBackground(Color.black);
        label_team7.setFont(font_team);
        label_team7.setForeground(color_team);
        add(label_team7);
        // labels for about team4 
        label_team8.setBounds(80, 310, 300, 60);
        label_team8.setBackground(Color.black);
        label_team8.setFont(font_team);
        label_team8.setForeground(color_team);
        add(label_team8);
        // labels for about team4 
        label_team9.setBounds(80, 340, 300, 60);
        label_team9.setBackground(Color.black);
        label_team9.setFont(font_team);
        label_team9.setForeground(color_team);
        add(label_team9);
        // labels for about team4 
        label_team10.setBounds(80, 370, 300, 60);
        label_team10.setBackground(Color.black);
        label_team10.setFont(font_team);
        label_team10.setForeground(color_team);
        add(label_team10);
        // labels for about team4 
        label_team11.setBounds(80, 400, 300, 60);
        label_team11.setBackground(Color.black);
        label_team11.setFont(font_team);
        label_team11.setForeground(color_team);
        add(label_team11);
        // labels for about team4 
        label_team12.setBounds(80, 430, 300, 60);
        label_team12.setBackground(Color.black);
        label_team12.setFont(font_team);
        label_team12.setForeground(color_team);
        add(label_team12);
        // labels for about team4 
        label_team13.setBounds(80, 460, 300, 60);
        label_team13.setBackground(Color.black);
        label_team13.setFont(font_team);
        label_team13.setForeground(color_team);
        add(label_team13);
        // labels for about team4 
        label_team14.setBounds(80, 490, 300, 60);
        label_team14.setBackground(Color.black);
        label_team14.setFont(font_team);
        label_team14.setForeground(color_team);
        add(label_team14);

        panel_help.setBounds(300, 190, 700, 470);
        panel_help.setBackground(new Color(108, 28, 22));
        panel_help.add(label_image_help);
        add(panel_help);
        panel_help.setVisible(false);
                
    }
    
    public class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            Object ob = ae.getSource();
            if (ob.equals(btn_exit)) {
                System.exit(0);
            } else if (ob.equals(btn_sound)) {

            } else if (ob.equals(btn_NewGame)) {

                try {

                    new Face().setVisible(true);
                } catch (Exception ex) {

                }

            } else if (ob.equals(btn_about_team)) {
                {
                    label_team.setText("");
                    label_team2.setText("");
                    label_team3.setText("");
                    label_team4.setText("");
                    label_team5.setText("");
                    label_team6.setText("");
                    label_team7.setText("");
                    label_team8.setText("");
                    label_team9.setText("");
                    label_team10.setText("");
                    label_team11.setText("");
                    label_team12.setText("");
                    label_team13.setText("");
                    label_team14.setText("");
                }

                i = 0;
                time_start = new Timer(60, new action2());
                time_start.start();

            } else if (ob.equals(btn_help)) {

//                JOptionPane.showMessageDialog(null, "ahmed");
//                Help.help.setVisible(true);
            } else if (ob.equals(btn_levels)) {

                //JOptionPane.showMessageDialog(null, "Yes");
                Levels.Level.setVisible(true);
            }

        }

    }

    public class action2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (i < 29) {
                label_team.setText(label_team.getText() + ch[i]);
                i++;
            } else if (i >= 29 && i < 47) {
                label_team2.setText(label_team2.getText() + ch[i]);
                i++;
            } else if (i >= 47 && i < 61) {
                label_team3.setText(label_team3.getText() + ch[i]);
                i++;
            } else if (i >= 61 && i < 77) {
                label_team4.setText(label_team4.getText() + ch[i]);
                i++;
            } else if (i >= 77 && i < 83) {
                label_team5.setText(label_team5.getText() + ch[i]);
                i++;
            } else if (i >= 83 && i < 106) {
                label_team6.setText(label_team6.getText() + ch[i]);
                i++;
            } else if (i >= 106 && i < 133) {
                label_team7.setText(label_team7.getText() + ch[i]);
                i++;
            } else if (i >= 133 && i < 151) {
                label_team8.setText(label_team8.getText() + ch[i]);
                i++;
            } else if (i >= 150 && i < 180) {
                label_team9.setText(label_team9.getText() + ch[i]);
                i++;
            } else if (i >= 180 && i < 204) {
                label_team10.setText(label_team10.getText() + ch[i]);
                i++;
            } else if (i >= 204 && i < 235) {
                label_team11.setText(label_team11.getText() + ch[i]);
                i++;
            } else if (i >= 235 && i < 262) {
                label_team12.setText(label_team12.getText() + ch[i]);
                i++;
            } else if (i >= 262 && i < 285) {
                label_team13.setText(label_team13.getText() + ch[i]);
                i++;
            } else if (i >= 285 && i < 305) {
                label_team14.setText(label_team14.getText() + ch[i]);
                i++;
            } else if (i == ch.length) {
                time_start.stop();
            }
        }
    }

    private void transparancy(JButton btn) {
        //btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    }

    public static void main(String[] args) throws IOException {
        try {
            back = new Back();
            back.setVisible(true);
        } catch (Exception ex) {
          //  Logger.getLogger(Back.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // this function for print file about team
    public char[] print() throws IOException {

        File file = new File("aboutTeam.txt");
        Scanner input = new Scanner(file);
        int i = 0;
        String name = input.nextLine();
        char ch[] = name.toCharArray();
        return ch;
    }

}
