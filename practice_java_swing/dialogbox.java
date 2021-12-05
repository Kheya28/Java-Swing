/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.practice_java_swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kheya
 */
public class dialogbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //here null is given for window positioning
        //JOptionPane.showMessageDialog(window position,Message,Title,icon ki dhoroner,icon);
        
        //JOptionPane.showMessageDialog(null,"wrong pass!!","warning");   //2 parameters
        //JOptionPane.showMessageDialog(null,"wrong pass!!","warning",JOptionPane.ERROR_MESSAGE); //4 parameters
        ImageIcon icon= new ImageIcon("bag-removebg.jpg");
        JOptionPane.showMessageDialog(null,"enter correct password","this is a title",JOptionPane.PLAIN_MESSAGE,icon);
    }
}

//https://www.youtube.com/watch?v=YhucUbvZtbI&list=PLgH5QX0i9K3rAHKr6IteF5kdgN6BorH9l&index=4