/*
 * Charlie Harpur
 * Writes first name to console along with sum, difference, prouct, and quotient of two doubles
 * 14/09/2018
 */

package namedouble;

import javax.swing.JOptionPane;

/**
 *
 * @author chhar9972
 */
public class NameDouble {
    public static void main(String[] args) {
        //User input to variables
        String fullName = JOptionPane.showInputDialog("Enter your full name");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another number"));
        
        //Gets first name by making substring of all characters up to the space
        String firstName = fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
        System.out.println(firstName);
        
        //Does math and prints to console
        System.out.println("Sum = " + (num1 + num2) + "\n"
                + "Product = " + (num1 * num2) + "\n"
                + "Difference = " + (num1 - num2) + "\n"
                + "Quotient = " + (num1 / num2));
        
    }
    
}
