package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class application extends javax.swing.JFrame implements MouseListener {
    private JLabel iLabel, cross;
    private JTextField aTF;
    public application() {
        // iLabel Attributes
        iLabel = new JLabel("Hello");
        iLabel.setSize(40,40);
        iLabel.setLocation(230,150);
        getContentPane().add(iLabel);
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
                cross.setLocation(e.getX(), e.getY());
                cross.setVisible(true);
                getContentPane().add(cross);
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
