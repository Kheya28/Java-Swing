/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_java_swing;

import javax.swing.JFrame;

/**
 *
 * @author kheya
 */
public class JFrame1 extends JFrame{
    
    JFrame1()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,50,400,300); //eta size o location er kaj eksathe kore
        setTitle("Frame Demo");
    }
    public static void main(String args[]) {
        jFrame frame= new jFrame();  //class er name e name
        frame.setVisible(true);
    }
    
}
