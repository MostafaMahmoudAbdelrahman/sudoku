package sudoku;

//import com.sun.xml.internal.ws.handler.HandlerException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @steve Jobs
 */
public class Face extends JFrame {

    
    JLabel label_correct = new JLabel("CORRECT");
    
    static int serious = 0;
    static int sure = 0;
    int xc = 0, yc = 0;
    static int num_of_errors = 0;
    // array for check
    int[] arr_left_row1 = new int[]{0, 1, 2, 9, 10, 11, 18, 19, 20};
    int[] arr_center_row1 = new int[]{3, 4, 5, 12, 13, 14, 21, 22, 23};
    int[] arr_right_row1 = new int[]{6, 7, 8, 15, 16, 17, 24, 25, 26};
    // array for check
    int[] arr_left_row2 = new int[]{27, 28, 29, 36, 37, 38, 45, 46, 47};
    int[] arr_center_row2 = new int[]{30, 31, 32, 39, 40, 41, 48, 49, 50};
    int[] arr_right_row2 = new int[]{33, 34, 35, 42, 43, 44, 51, 52, 53};
    // array for check
    int[] arr_left_row3 = new int[]{54, 55, 56, 63, 64, 65, 72, 73, 74};
    int[] arr_center_row3 = new int[]{57, 58, 59, 66, 67, 68, 75, 76, 77};
    int[] arr_right_row3 = new int[]{60, 61, 62, 69, 70, 71, 78, 79, 80};

    // using for method ran 
    int index = 0;
    Random r = new Random();
    int xcordinate = 0;
    int ycordinate = 0;
    String check = "", com = "";
    int temp = 0;
     // the end

    // labels of the level 
    JLabel labelScore = new JLabel("Mistakes : ");
    JLabel labelMistackes = new JLabel("0");

    JLabel labelLevel = new JLabel("level : " + Levels.level);
    Font fontLevel = new Font("Serif", Font.BOLD, 30);
    Color colorLevel = new Color(255, 255, 255);
    // label for show the time now 

    Calendar cel = new GregorianCalendar();
    JLabel label_time = new JLabel();

    Color color = new Color(255, 255, 255);
    Font font_time = new Font("serif", Font.BOLD + Font.PLAIN, 25);
    Font font_second = new Font("serif", Font.BOLD, 15);
    JLabel last0 = new JLabel("0");
    static int x0 = 0;
    JLabel last1 = new JLabel("0");
    static int x1 = 0;
    JLabel last2 = new JLabel(":");
    JLabel last3 = new JLabel("0");
    static int x3 = 0;
    JLabel last4 = new JLabel("0");
    static int x4 = 0;
    JLabel last_second = new JLabel("0");
    static int x5 = 0;
    JLabel first_second = new JLabel("0");
    static int x6 = 0;

    // Sounds 
    // button  imageicon for sound 
    JButton btn_sound = new JButton(new ImageIcon("Images//off3.gif"));
    JButton btn_sound2 = new JButton(new ImageIcon("Images//off4.gif"));

    // jpanel1 for buttons 
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 27));
    Font fon = new Font("SERIF", Font.BOLD + Font.ITALIC, 26);
    JPanel panel2 = new JPanel();
    // the begining of adding panels 
    JPanel panel = new JPanel();
    JLabel label_panel[] = new JLabel[81];
    Border border_label_sudoku = new LineBorder(Color.LIGHT_GRAY, 1);
    // the ending od adding panel

    // this jbuttons is equal to 9 buttons i kowen them in an array
    Color color1 = new Color(42, 59, 102);
    Color color2 = new Color(38, 61, 105);
    // border for two panels 
    Border border = new LineBorder(Color.WHITE, 3);
    Border border2 = new LineBorder(Color.WHITE, 1);

    Border border3 = new LineBorder(Color.BLACK, 1);
    Border border10 = new LineBorder(Color.RED, 3);
    // fonts 
    Font font = new Font("SERIF", Font.BOLD, 25);
    JLabel label = new JLabel("TIME:");

    // panel buttons 
    JButton btn[] = new JButton[11];

    //stop watch 
    Timer time, time2, time3, time_cel;

    // Font and Color for class random on the labels 
    Font f_ran = new Font("Serif", Font.BOLD, 35);
    Color c_ran = new Color(10, 0, 200);

    /// actions int 
    static int num_of_panel = 0;
    drawLine d = new drawLine();
    drawLine d2 = new drawLine();
    drawLine2 d3 = new drawLine2();
    drawLine2 d4 = new drawLine2();
    drawLine d5 = new drawLine();
    drawLine d6 = new drawLine();
    drawLine2 d7 = new drawLine2();
    drawLine2 d8 = new drawLine2();

    // last button in this game 
    JButton btn1 = new JButton(new ImageIcon("Images//btn1.gif"));
    JButton btn2 = new JButton(new ImageIcon("Images//btn2.gif"));
    JButton btn3 = new JButton(new ImageIcon("Images//btn3.gif"));

    public Face() throws NullPointerException, Exception {

        // the things of level class 
        // Default things
        //setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sodoku");
        this.setResizable(false);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setUndecorated(true);
        this.setContentPane(new JLabel(new ImageIcon("Images\\back.jpg")));
        // open music 
        //Sound.play2();
        // labels and button and textfield of the footer panel
        label.setFont(font);
        label.setForeground(Color.WHITE);
        label.setBounds(100, 727, 120, 36);
        add(label);

        labelLevel.setBounds(500, 727, 200, 36);
        labelLevel.setFont(fontLevel);
        labelLevel.setForeground(colorLevel);
        add(labelLevel);

        labelScore.setBounds(900, 727, 200, 36);
        labelScore.setFont(fontLevel);
        labelScore.setForeground(colorLevel);
        add(labelScore);

        labelMistackes.setBounds(1040, 727, 200, 36);
        labelMistackes.setFont(fontLevel);
        labelMistackes.setForeground(Color.BLACK);
        add(labelMistackes);

        // stop watch 
        last0.setFont(font_time);
        last0.setForeground(color);
        last0.setBounds(180, 736, 30, 20);
        add(last0);

        last1.setFont(font_time);
        last1.setForeground(color);
        last1.setBounds(200, 736, 30, 20);
        add(last1);

        last2.setFont(font_time);
        last2.setForeground(color);
        last2.setBounds(220, 736, 30, 20);
        add(last2);

        last3.setFont(font_time);
        last3.setForeground(color);
        last3.setBounds(240, 736, 30, 20);
        add(last3);

        last4.setFont(font_time);
        last4.setForeground(color);
        last4.setBounds(260, 736, 30, 20);
        add(last4);

        first_second.setFont(font_second);
        first_second.setForeground(color);
        first_second.setBounds(280, 729, 30, 25);
        add(first_second);
        first_second.setFont(font_second);

        last_second.setFont(font_second);
        last_second.setForeground(color);
        last_second.setBounds(290, 729, 30, 25);
        add(last_second);
        last_second.setFont(font_second);

        time = new Timer(10, new act());
        time2 = new Timer(1000, new action2());
        time3 = new Timer(60000, new action3());
        time.start();
        time2.start();
        time3.start();

        // the end of the stop watch
        // panel 2 setbounds footer
        panel2.setBackground(color2);
        panel2.setBorder(border2);
        panel2.setBounds(0, 700, this.getWidth(), 100);
        add(panel2);

        // for loop for adding labels on the panel3 
        panel.setLayout(new GridLayout(9, 9));

        for (int i = 0; i < label_panel.length; i++) {
            label_panel[i] = new JLabel();
            label_panel[i].setBorder(border_label_sudoku);

            label_panel[i].setOpaque(true);
            label_panel[i].setBackground(Color.black);
            label_panel[i].addMouseListener(new action_game());
            panel.add(label_panel[i]);
            label_panel[i].setFont(new Font("SERIF", Font.BOLD, 30));
            label_panel[i].setForeground(new Color(255, 255, 255));
            //label_panel[i].setText("" + i);
        }
        d.setBackground(Color.green);
        d2.setBackground(Color.green);
        d3.setBackground(Color.green);
        d4.setBackground(Color.green);
        d5.setBackground(Color.green);
        d6.setBackground(Color.green);
        d7.setBackground(Color.green);
        d8.setBackground(Color.green);

        d.setBounds(470, 257, 650, 2);
        d2.setBounds(470, 431, 650, 2);
        d3.setBounds(470 + 216, 80, 2, 531);
        d4.setBounds(470 + 432, 80, 2, 531);
        d5.setBounds(470, 78, 650, 8);
        d6.setBounds(470, 605, 650, 5);
        d7.setBounds(470, 80, 2, 531);
        d8.setBounds(470 + 648, 78, 2, 531);
        panel.setBounds(470, 80, 650, 530);

        add(d);
        add(d2);
        add(d3);
        add(d4);
        add(d6);
        add(d5);
        add(d7);
        add(d8);
        add(panel);
        
        label_correct.setFont(new Font("SERIF" , Font.BOLD , 30));
        label_correct.setForeground(Color.white);
        label_correct.setVisible(false);
        label_correct.setBounds(735, 610, 200, 60);
        add(label_correct);
        
        // panel buttons 
        for (int i = 1; i <= 9; i++) {
            btn[i] = new JButton("" + i);
            btn[i].setBackground(Color.WHITE);
            btn[i].setFont(fon);
            panel1.add(btn[i]);
            btn[i].addActionListener(new action_button());
        }
        btn[10] = new JButton("X");
        btn[10].setBackground(Color.WHITE);
        btn[10].setFont(fon);
        panel1.add(btn[10]);
        btn[10].addActionListener(new action_button());

        // panel 1 setbounds  have buttos 
        panel1.setBackground(color1);
        panel1.setBorder(border);
        panel1.setBounds(159, 150, 195, 385);
        add(panel1);

        // buttons of Sound 
        /*
         btn_sound.setBounds(20, 10, 104, 104);
         btn_sound.setCursor(new Cursor(HAND_CURSOR));
         btn_sound.setContentAreaFilled(false);
         btn_sound.addActionListener(new action());

         add(btn_sound);

         btn_sound2.setBounds(20, 10, 104, 104);
         btn_sound2.setCursor(new Cursor(HAND_CURSOR));
         btn_sound2.setContentAreaFilled(false);
         btn_sound2.addActionListener(new action());
         btn_sound2.setVisible(false);
         add(btn_sound2);
         */
        label_time.setBounds(700, 10, 400, 30);
        label_time.setFont(font);
        label_time.setForeground(Color.WHITE);
        label_time.setText(new Date().toString().substring(0, 20));
        add(label_time);
        // function ran for random numbers 
        ran();

        btn1.setOpaque(false);
        btn2.setOpaque(false);
        btn3.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn2.setContentAreaFilled(false);
        btn3.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        btn2.setBorderPainted(false);
        btn3.setBorderPainted(false);
        btn1.setBounds(10, 10, 140, 40);
        btn2.setBounds(10, 50, 140, 40);
        btn3.setBounds(10, 90, 140, 40);
        btn1.setCursor(new Cursor(HAND_CURSOR));
        btn2.setCursor(new Cursor(HAND_CURSOR));
        btn3.setCursor(new Cursor(HAND_CURSOR));

        add(btn1);
        btn1.addActionListener(new action());
        add(btn2);
        btn2.addActionListener(new action());
        add(btn3);
        btn3.addActionListener(new action());

        btn3.addActionListener(new check_button());
        btn2.addActionListener(new solve_button());
    }

    public class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            Object ob = ae.getSource();

            if (ob.equals(btn_sound)) {

                //Sound.stop_play2();
                btn_sound.setVisible(false);
                btn_sound2.setVisible(true);

            } else if (ob.equals(btn_sound2)) {

                // Sound.play2();
                btn_sound.setVisible(true);
                btn_sound2.setVisible(false);

            } else if (ob.equals(btn1)) {
                //Back.face.setVisible(false);
                //Back.back.setVisible(true);
            } else if (ob.equals(btn2)) {

            } else if (ob.equals(btn3)) {

            }
        }
    }

    public class act implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (x6 == 9) {
                if (x5 == 9) {
                    x6 = 0;
                    x5 = 0;
                }
                x6 = 0;
                last_second.setText("" + x6);
                x5++;
                first_second.setText("" + x5);
            } else {
                x6++;
                last_second.setText("" + x6);
            }
        }
    }

    public class action2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (x4 == 9) {
                if (x3 == 5) {
                    x4 = 0;
                    x3 = 0;
                    last4.setText("" + x4);
                    last3.setText("" + x3);

                } else {
                    x4 = 0;
                    last4.setText("" + x4);
                    x3++;
                    last3.setText("" + x3);
                }
            } else {
                x4++;
                last4.setText("" + x4);
            }

            label_time.setText(new Date().toString().substring(0, 20));
        }

    }

    public class action3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (x1 == 9) {
                if (x0 == 5) {
                    x0 = 0;
                    x1 = 0;
                }
                x1 = 0;
                last1.setText("" + x1);
                x0++;
                last0.setText("" + x0);
            } else {
                x1++;
                last1.setText("" + x1);
            }
        }

    }

// static int random_num_of_labelPanel[] = new int[10];
    int num_random[];

    private void ran() throws Exception {

        char ch = Levels.level.charAt(5);

        switch (ch) {
            case '1':
                index = 7;
                break;
            case '2':
                index = 9;
                break;
            case '3':
                index = 11;
                break;
            case '4':
                index = 12;
                break;
            case '5':
                index = 14;
                break;
            case '6':
                index = 16;
                break;
        }
        num_random = new int[index];
        ArrayList<Integer> list = new ArrayList<>();
        int arr_forNum[] = new int[index];
        int arr_forLabels[] = new int[index];
        for (int i = 0; i < index; i++) {

            arr_forNum[i] = r.nextInt(10);
            arr_forLabels[i] = r.nextInt(81);

            while (arr_forNum[i] == 0) {
                arr_forNum[i] = r.nextInt(10);
            }
            // عشان ميدخلش ارقام متشابهه خالص  فى ال اراى التانى بتاع ال يبولز بتاعى 

            for (int j = 0; j < i; j++) {
                if (arr_forLabels[i] == arr_forLabels[j]) {
                    arr_forLabels[i] = r.nextInt(81);
                    j = 0;
                }

            }// end of loop
            /////////////////////////////////////////////////////////////////
            xcordinate = arr_forLabels[i] - (arr_forLabels[i] % 9);
            ycordinate = arr_forLabels[i] - ((arr_forLabels[i] / 9) * 9);
            /////////////////////////////////////////////////////////////////
            for (int k = xcordinate; k < (xcordinate + 9); k++) {
                if (k == arr_forLabels[i] || (label_panel[k].getText()).trim().equals("")) {
                    continue;
                }
                list.add(Integer.parseInt(label_panel[k].getText().trim()));
            }
            for (int f = ycordinate; f < 80; f += 9) {
                if (f == arr_forLabels[i] || (label_panel[f].getText()).equals("")) {
                    continue;
                }
                list.add(Integer.parseInt(label_panel[f].getText().trim()));
            }
            ///////////////////////////////////////////////////////////////////////////////////////
            if (xcordinate <= 18) {
                if (ycordinate <= 2) {
                    for (int l = 0; l < arr_left_row1.length; l++) {
                        if (label_panel[arr_left_row1[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_left_row1[l]].getText().trim()));
                    }
                } else if (ycordinate <= 5) {
                    for (int l = 0; l < arr_center_row1.length; l++) {
                        if (label_panel[arr_center_row1[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_center_row1[l]].getText().trim()));
                    }
                } else if (ycordinate <= 8) {
                    for (int l = 0; l < arr_right_row1.length; l++) {
                        if (label_panel[arr_right_row1[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_right_row1[l]].getText().trim()));
                    }
                }
            }// end of condition 1 
            else if (xcordinate <= 45) {

                if (ycordinate <= 2) {
                    for (int l = 0; l < arr_left_row2.length; l++) {
                        if (label_panel[arr_left_row2[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_left_row2[l]].getText().trim()));
                    }
                } else if (ycordinate <= 5) {

                    for (int l = 0; l < arr_center_row2.length; l++) {
                        if (label_panel[arr_center_row2[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_center_row2[l]].getText().trim()));
                    }
                } else if (ycordinate <= 8) {
                    for (int l = 0; l < arr_right_row2.length; l++) {
                        if (label_panel[arr_right_row2[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_right_row2[l]].getText().trim()));
                    }
                }
            }// end of condition 2 
            else if (xcordinate <= 72) {
                if (ycordinate <= 2) {
                    for (int l = 0; l < arr_left_row3.length; l++) {
                        if (label_panel[arr_left_row3[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_left_row3[l]].getText().trim()));
                    }
                } else if (ycordinate <= 5) {
                    for (int l = 0; l < arr_center_row3.length; l++) {

                        if (label_panel[arr_center_row3[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_center_row3[l]].getText().trim()));
                    }
                } else if (ycordinate <= 8) {
                    for (int l = 0; l < arr_right_row3.length; l++) {
                        if (label_panel[arr_right_row3[l]].getText().equals("")) {
                            continue;
                        }
                        list.add(Integer.parseInt(label_panel[arr_right_row3[l]].getText().trim()));
                    }
                }
            }// condition 3

            ///////////////////////////////////////////////////////////////////////////////////////
            list = shift(list);
            for (int u = 0; u < list.size(); u++) {
                if (arr_forNum[i] == list.get(u)) {
                    arr_forNum[i] = r.nextInt(10);
                    while (arr_forNum[i] == 0) {
                        arr_forNum[i] = r.nextInt(10);
                    }
                    u = 0;
                }
            }
            label_panel[arr_forLabels[i]].setText("   " + arr_forNum[i]);
            label_panel[arr_forLabels[i]].setForeground(Color.white);
            label_panel[arr_forLabels[i]].setBackground(new Color(42, 59, 142));
            list.clear();
            num_random[i] = arr_forLabels[i];
        }//end of for loop

    }// end of the action

    public ArrayList<Integer> shift(ArrayList list) {
        Set<Integer> s = new HashSet<>(list);
        return list;
    }

    // actions of the game 
    public class action_game implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

            Object a = e.getSource();
            if (SwingUtilities.isLeftMouseButton(e)) {

                for (int k = 0; k < label_panel.length; k++) {

                    if (a.equals(label_panel[k])) {
                        num_of_panel = k;
                        break;
                    }
                }

                label_panel[num_of_panel].setBorder(border10);

                for (int i = 0; i < label_panel.length - 1; i++) {

                    if (i == num_of_panel) {

                    } else {
                        label_panel[i].setBorder(border_label_sudoku);

                    }
                }

            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }

// buttons actions 
    public class action_button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object ob = e.getSource();
            int x = 0;
            int y = 0;
            int xcor = 0;
            int ycor = 0;
            // the beging of the if condition statemente for writting on the labels of the array
            if (ob.equals(btn[10])) {
                for (int i = 0; i < num_random.length; i++) {
                    if (num_of_panel == num_random[i]) {
                        x = 1;
                    }
                }
                if (x == 0) {
                    label_panel[num_of_panel].setText("");
                    label_panel[num_of_panel].setBackground(Color.black);
                } else {

                }
                x = 0;
            } else {
                for (int i = 0; i < btn.length - 1; i++) {

                    if (ob.equals(btn[i])) {

                        for (int j = 0; j < num_random.length; j++) {
                            if (num_of_panel == num_random[j]) {
                                y = 1;
                            }
                        }
                        if (y == 0) {
                            label_panel[num_of_panel].setText("   " + btn[i].getText());
                            label_panel[num_of_panel].setForeground(new Color(255, 255, 255));
                            label_panel[num_of_panel].setBackground(new Color(24, 37, 50));

                            xcor = num_of_panel - (num_of_panel % 9);
                            ycor = num_of_panel - ((num_of_panel / 9) * 9);
                            for (int n = xcor; n < (xcor + 9); n++) {
                                if (num_of_panel == n) {

                                } else if (label_panel[num_of_panel].getText().equals(label_panel[n].getText())) {
                                    label_panel[num_of_panel].setBackground(Color.yellow);
                                    num_of_errors++;
                                    labelMistackes.setText("" + num_of_errors);

                                    /////////////////////////صوت////////////////
                                } else {

                                }
                            }

                            for (int m = ycor; m < 80; m += 9) {
                                if (num_of_panel == m) {

                                } else if (label_panel[num_of_panel].getText().equals(label_panel[m].getText())) {
                                    label_panel[num_of_panel].setBackground(Color.yellow);
                                    num_of_errors++;
                                    labelMistackes.setText("" + num_of_errors);

                                    ///////////////////////صوت////////////////////
                                } else {

                                }
                            }
                        }
                        y = 0;
                    }

                }// the end of the for loop statement
            }// the ending of the else statement

        }
    }

    public class check_button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int hhhhhhh = 0;
            for (int i = 0; i < 81; i++) {
                if (label_panel[i].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "noop");
                    sure++;
                    break;
                }
            }
            if (sure == 0) {
                
                for (int i = 0; i < 81; i++) {

                    xc = i - (i % 9);
                    yc = i - ((i / 9) * 9);
                    for (int x = xc; x < (xc + 9); x++) {
                        if (i == x) {

                        } else if (label_panel[i].getText().equals(label_panel[x].getText())) {
                            label_panel[i].setBackground(Color.GREEN);
                            label_panel[x].setBackground(Color.GREEN);

                            //////////////////////////////صوت/////////////////
                            break;
                        }
                    }
                    for (int m = yc; m < 80; m += 9) {
                        if (i == m) {

                        } else if (label_panel[i].getText().equals(label_panel[m].getText())) {
                            label_panel[i].setBackground(Color.GREEN);
                            label_panel[m].setBackground(Color.GREEN);
                            
                            ///////////////صوت ////////////////////////////
                            break;
                        }
                    }

                }
            }
            
        }

    }

    public class solve_button implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int xco = 0, yco = 0, s = 0;
            ArrayList<Integer> list2 = new ArrayList<>();

            for (int i = 0; i < 81; i++) {
                for (int j = 0; j < num_random.length; j++) {
                    if (i == num_random[j]) {
                        serious++;
                    }
                }
                if (serious == 0) {
                    xco = i - (i % 9);
                    yco = i - ((i / 9) * 9);
                    for (int x = xco; x < (xco + 9); x++) {

                        if (i == x || label_panel[x].getText().equals("")) {
                            continue;
                        }
                        list2.add(Integer.parseInt(label_panel[x].getText().trim()));
                    }

                    for (int m = yco; m < 80; m += 9) {

                        if (i == m || label_panel[m].getText().equals("")) {
                            continue;
                        }
                        list2.add(Integer.parseInt(label_panel[m].getText().trim()));
                    }
                    list2 = shift(list2);
                    ///////////////////////////////////////////////////

                    if (xco <= 18) {
                        if (yco <= 2) {
                            for (int l = 0; l < arr_left_row1.length; l++) {
                                if (label_panel[arr_left_row1[l]].getText().equals("")) {
                                    continue;
                                }
                                list2.add(Integer.parseInt(label_panel[arr_left_row1[l]].getText().trim()));
                            }
                        } else if (yco <= 5) {
                            for (int l = 0; l < arr_center_row1.length; l++) {
                                if (label_panel[arr_center_row1[l]].getText().equals("")) {
                                    continue;
                                }
                                list2.add(Integer.parseInt(label_panel[arr_center_row1[l]].getText().trim()));
                            }

                        } else if (yco <= 8) {
                            for (int l = 0; l < arr_right_row1.length; l++) {
                                if (label_panel[arr_right_row1[l]].getText().equals("")) {
                                    continue;
                                }
                                list2.add(Integer.parseInt(label_panel[arr_right_row1[l]].getText().trim()));
                            }
                        }
                    }// end of condition 1 
                    else if (xco <= 45) {

                        for (int l = 0; l < arr_left_row2.length; l++) {
                            if (label_panel[arr_left_row2[l]].getText().equals("")) {
                                continue;
                            }
                            list2.add(Integer.parseInt(label_panel[arr_left_row2[l]].getText().trim()));

                        }
                    } else if (yco <= 5) {
                        for (int l = 0; l < arr_center_row2.length; l++) {
                            if (label_panel[arr_center_row2[l]].getText().equals("")) {
                                continue;
                            }
                            list2.add(Integer.parseInt(label_panel[arr_center_row2[l]].getText().trim()));

                        }
                    } else if (yco <= 8) {

                        for (int l = 0; l < arr_right_row2.length; l++) {
                            if (label_panel[arr_right_row2[l]].getText().equals("")) {
                                continue;
                            }
                            list2.add(Integer.parseInt(label_panel[arr_right_row2[l]].getText().trim()));
                        }

                    }// end of condition 2 
                    else if (xco <= 72) {
                        if (yco <= 2) {
                            for (int l = 0; l < arr_left_row3.length; l++) {
                                if (label_panel[arr_left_row3[l]].getText().equals("")) {
                                    continue;
                                }
                                list2.add(Integer.parseInt(label_panel[arr_left_row3[l]].getText().trim()));
                            }

                        } else if (yco <= 5) {

                            for (int l = 0; l < arr_center_row3.length; l++) {
                                if (label_panel[arr_center_row3[l]].getText().equals("")) {
                                    continue;
                                }
                                list2.add(Integer.parseInt(label_panel[arr_center_row3[l]].getText().trim()));
                            }
                        } else if (yco <= 8) {

                            for (int l = 0; l < arr_right_row3.length; l++) {
                                if (label_panel[arr_right_row3[l]].getText().equals("")) {
                                    continue;
                                }
                                list2.add(Integer.parseInt(label_panel[arr_right_row3[l]].getText().trim()));
                            }
                        }
                    }// condition 3

                    ///////////////////////////////////////////////////
                    for (int k = 1; k <= 9; k++) {
                        for (int j = 0; j < list2.size(); j++) {
                            if (k == list2.get(j)) {
                                s++;
                                break;
                            }
                        }
                        if (s == 0) {
                            label_panel[i].setText("   " + k);
                            label_panel[i].setForeground(new Color(255, 255, 255));
                            label_panel[i].setBackground(new Color(24, 37, 50));

                        }
                        s = 0;
                    }

                }
                list2.clear();
                serious = 0;
            }
        }
    }

    class drawLine extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawLine(470, 258, 1121, 258);
            g.drawLine(470, 259, 1121, 259);
            g.drawLine(470, 260, 1121, 260);

        }
    }

    class drawLine2 extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawLine(470 + 219, 80, 470 + 219, 610);
            g.drawLine(470 + 219, 80, 470 + 219, 610);
            g.drawLine(470 + 219, 80, 470 + 219, 610);

        }
    }
}
