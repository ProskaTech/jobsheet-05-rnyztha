/*
 created by 21343010-Natasya febriani
 */
package jobsheet5;

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args){
        String word1 = "", word2 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word1 : ");
        word2 = JOptionPane.showInputDialog("Enter word2 : ");
        
        String msg = word1+word2+ "Hello";
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(word1+word2);
        
    }
    
}
