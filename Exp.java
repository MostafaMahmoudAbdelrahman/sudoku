package sudoku;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @steve Jobs
 */
public class Exp extends JFrame {

    
    JButton bt = new JButton("ok");
    JButton bt_cancel = new JButton("Cancel");

    Exp() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        setLayout(null);
        bt.setBounds(100, 100, 100, 50);
        add(bt);
        bt.addActionListener(new action());

        bt_cancel.setBounds(200, 100, 100, 50);
        add(bt_cancel);
        bt_cancel.addActionListener(new action());

        getContentPane().setBackground(Color.CYAN);
    }

    public class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object ob = e.getSource();

            String os;
            String logof = "";
            String remove = "";
            os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                logof = "shutdown -s -t 60";
                remove = "shutdown -a";
            }

            try {
                Runtime.getRuntime().exec(logof);
            } catch (IOException a) {

            }

            if (ob.equals(bt_cancel)) {
                try {
                    Runtime.getRuntime().exec(remove);
                } catch (IOException a) {

                }
            }
        }

    }

    public static void main(String[] args) {

        for (int i =0 ;i<7 ;i++){
            if (i==6){
                
                System.out.println("goodluck");
                i=0;
                System.out.println("i="+i);
                break;
            }
            System.out.println("ahmed");
        }
    }

}
