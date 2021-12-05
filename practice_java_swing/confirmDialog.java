/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.practice_java_swing;

import javax.swing.JOptionPane;

/**
 *
 * @author kheya
 */
public class confirmDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int choice = JOptionPane.showConfirmDialog(null,"Do u want to quit?","this is a title",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(choice==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else
        {
            
        }
    }
}
