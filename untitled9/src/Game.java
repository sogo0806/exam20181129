import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class Game extends JFrame {
    private ImageIcon icon = new ImageIcon("123.jpg");
    private ImageIcon icon1 = new ImageIcon("oie_2915384.gif");
    private  JLabel jlb = new JLabel();
    private JLabel jlb2 = new JLabel();




    public Game(){
        ex1();
    }
    public void ex1() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 800, 500);
        this.setLayout(null);
        jlb.setOpaque(true);
        this.add(jlb);
        jlb.setBounds(0, 0, 800, 500);
        jlb.setIcon(icon);

        jlb2.setIcon(icon1);
        jlb.add(jlb2);
        jlb2.setBounds(0, 0, 520, 250);


        this.setResizable(false);


    }
}