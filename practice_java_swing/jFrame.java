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
public class jFrame extends JFrame{
    public static void main(String args[]) {
        jFrame frame= new jFrame();  //class er name e name
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setSize(400,300);
        //frame.setLocation(200,50);  // frame ta window er kon position e show korbo seta
        //frame.setLocationRelativeTo(null); //eta frame ke middle e ane
        
        frame.setBounds(200,50,400,300); //eta size o location er kaj eksathe kore
        frame.setTitle("Frame Demo");
        frame.setResizable(false);
    }
}
//https://www.youtube.com/watch?v=fBWXf58UL-k&list=PLgH5QX0i9K3rAHKr6IteF5kdgN6BorH9l&index=8