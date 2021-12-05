/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_java_swing;

import javax.swing.JOptionPane;

/**
 *
 * @author kheya
 */
public class inputDialog {
    public static void main(String args[]) {
        //String name=JOptionPane.showInputDialog("Enter your name: ","kheya");
        //String name=JOptionPane.showMessageDialog(window position,Message,Title,icon ki dhoroner);
        //String name=JOptionPane.showInputDialog(null,"wrong pass!!","warning",JOptionPane.ERROR_MESSAGE); //4 parameters
        String name=JOptionPane.showInputDialog("Enter your name: ","kheya");

        JOptionPane.showMessageDialog(null, name+" welcome to swing");
    }
    
    
}
