package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class application extends JFrame {
    private JLabel iLabel;
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

        // Frame Attributes
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ill tell u hwat");
    }

    public static void main(String[] args) {
        // write your code here
    }
}
