package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class application extends javax.swing.JFrame implements MouseListener {
    private JLabel cross;
    private JTextField aTF , change;
    private JButton chooser;
    private JPanel $nav = new JPanel();
    public application() {
        // $nav attributes
        $nav.setSize(500, 50);
        $nav.setLocation(0,0);
        $nav.setBackground(new Color(221,221,221));
        getContentPane().add($nav);

        // a Text Field
        aTF = new JTextField("");
        aTF.setSize(50,50);
        aTF.setLocation(230, 125);
        getContentPane().add(aTF);
        aTF.addKeyListener(new java.awt.event.KeyListener(){
          public void keyPressed(KeyEvent e){
              int key = e.getKeyCode();
              if (key == KeyEvent.VK_UP){
                  System.out.println("UP key pressed");
              }
              if (key == KeyEvent.VK_DOWN){
                  System.out.println("DOWN key pressed");
              }
              if (key == KeyEvent.VK_RIGHT){
                  System.out.println("RIGHT key pressed");
              }
              if (key == KeyEvent.VK_LEFT){
                  System.out.println("LEFT key pressed");
              }
          }
          public void keyReleased(KeyEvent e) {
                String a = (e.getExtendedKeyCode()==KeyEvent.VK_UP)?"UP"
              :(e.getExtendedKeyCode()==KeyEvent.VK_DOWN)?"DOWN"
              :(e.getExtendedKeyCode()==KeyEvent.VK_RIGHT)?"RIGHT"
              :(e.getExtendedKeyCode()==KeyEvent.VK_LEFT)?"LEFT":Character.toString(e.getKeyChar());

                System.out.println(a + " Key released");
          }
          public void keyTyped(KeyEvent args0){
          ///
          }



        } );

        // Cross Label
        cross = new JLabel("ASDA");
        cross.setSize(30,10);
        cross.setVisible(false);
        cross.setLocation(250,250);
        getContentPane().add(cross);

        // Mouse Listener
        getContentPane().addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                System.out.println("Mouse Pressed At X:"+ e.getX() + " Y:" +e.getY());
                //cross = new JLabel("X:" + e.getX()+ " Y:"+e.getY());
                //cross.setSize(30,10);
                //cross.setLocation(e.getX(), e.getY());
                cross.setVisible(true);
                //getContentPane().add(cross);
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                cross.setLocation(e.getX(), e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                cross.setVisible(false);
            }

        });

        //Color Change Text Field
        change = new JTextField();
        change.setSize(255, 255);
        change.setLocation(0,0);
        change.setVisible(false);
        getContentPane().add(change);
        change.setBackground(Color.WHITE);
        change.addMouseMotionListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse at "+ e.getX() + ", " + e.getY());
                if (e.getY() <= 255 && e.getX() <= 255)
                    change.setBackground(new Color(e.getY(), e.getX(), e.getX()));

            }
            @Override
            public void mouseReleased(MouseEvent e){
                if (e.getX() <= 255 && e.getY() <= 255)
                    getContentPane().setBackground(new Color(e.getY(), e.getX(), e.getX()));
                System.out.println("Mouse released at " + e.getX() +", "+e.getY());
            }
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mouseWheelMoved(MouseWheelEvent e){}
            public void mouseMoved(MouseEvent e){}
        });
        // Chooser button attributes
        chooser = new JButton("Click to change color");
        chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent c) {
                if (c.getSource() == chooser)
                    System.out.println("Yea");
            }
        });


        $nav.add(chooser);


        // Frame Attributes
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ill tell u hwat");
    }



    public static void main(String[] args) {
        // write your code here
        application app = new application();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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
