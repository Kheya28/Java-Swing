/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_java_swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author kheya
 */
public class JFrame_icon extends JFrame{
    private ImageIcon icon;
    JFrame_icon()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        icon= new ImageIcon(getClass().getResource("img.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String args[]) {
        JFrame_icon frame= new JFrame_icon();  //class er name e name
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300); //eta size o location er kaj eksathe kore
        frame.setTitle("Frame Demo");
    }
}
