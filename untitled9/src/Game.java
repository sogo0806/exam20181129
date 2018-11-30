import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

import java.awt.event.*;
import java.io.*;

public class Game extends JFrame {
    private ImageIcon icon = new ImageIcon("backgroung.jpg");
    private ImageIcon icon1 = new ImageIcon("player.gif");
    private  JLabel jlb = new JLabel();
    private JLabel jlb2 = new JLabel();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =500 ;
    private Timer t1;
    private int dirFlag = 1;
    private int x = 0 , y = 0 , weight = 800 , hight = 500;



    public Game(){
        ex1();
    }
    public void ex1() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(screenw/2-frw/2,screenh/2-frh/2,frw,frh);
        this.setLayout(null);
        jlb.setOpaque(true);
        this.add(jlb);
        jlb.setBounds(0, 0, 800, 500);
        jlb.setIcon(icon);

        jlb2.setIcon(icon1);
        jlb.add(jlb2);
        jlb2.setBounds(0, 0, 80, 80);


        this.setResizable(false);


        t1 = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (dirFlag){
                    case 1 :
                        if (x + 80 < weight){
                            x += 80;
                        }else {
                            dirFlag = 2;
                        }
                        break;

                    case 2 :
                        if (x > 0){
                            x -= 80;
                        }else {
                            dirFlag = 1;
                        }
                        break;

                    case 3 :
                        if (y + 80 <  hight){
                            y += 80;
                        }else {
                            dirFlag = 4;
                        }
                        break;

                    case 4 :
                        if (y  > 0){
                            y -= 80;
                        }else {
                            dirFlag = 3;
                        }
                        break;
                }
                jlb2.setLocation(x,y);
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()){
                    case KeyEvent.VK_RIGHT :
                        jlb2.setIcon(icon1);
                        jlb2.setLocation(jlb2.getX()+10,jlb2.getY());
                        dirFlag = 1;
                        break;

                    case KeyEvent.VK_LEFT :
                        jlb2.setIcon(icon1);
                        jlb2.setLocation(jlb2.getX()-10,jlb2.getY());
                        dirFlag = 2;
                        break;

                    case KeyEvent.VK_UP :
                        jlb2.setIcon(icon1);
                        jlb2.setLocation(jlb2.getX(),jlb2.getY()-10);
                        dirFlag = 3;
                        break;

                    case KeyEvent.VK_DOWN :
                        jlb2.setIcon(icon1);
                        jlb2.setLocation(jlb2.getX(),jlb2.getY()+10);
                        dirFlag = 4;
                        break;
                }
            }
        });
    }
}
