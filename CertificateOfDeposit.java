/** @author: Brian Klein
 *  Date: 4-5-17 and 4-12-17
 *  Program: CertificateOfDeposit.java
 *  Purpose: This is a user-defined class
 */

import javax.swing.*; //The latest GUI components
import java.awt.*; //Some GUI components
import java.awt.event.*; //Handling the events

public class CertificateOfDeposit extends JFrame
{
   private JLabel amountLabel, durationLabel, interestLabel, maturityLabel;
   private JTextField amountField, durationField, interestField, maturityField;
   private JButton calculateButton, resetButton;
   
   private static final int WIDTH = 400;
   private static final int HEIGHT = 300;
   
    //constructor
   public CertificateOfDeposit() {
   
       //create 4 JLabel objects
      amountLabel = new JLabel("Amount Deposited: ", SwingConstants.RIGHT);
      durationLabel = new JLabel("Duration In Years: ", SwingConstants.RIGHT);
      interestLabel = new JLabel(" Interest Rate: ", SwingConstants.RIGHT);
      maturityLabel = new JLabel("Value On Maturity: ", SwingConstants.RIGHT);
      
       //create 4 JTextField objects
      amountField = new JTextField( 10 );// 10 characters
      durationField = new JTextField( 10 );
      interestField = new JTextField( 10 );
      maturityField = new JTextField( 10 );
      
       //create 2 JButton objects
      calculateButton = new JButton("Calculate");
      resetButton = new JButton("Reset");
      
       //add GUI components to the JFrame
       //retrieve the ContentPane of the JFrame
      Container pane = getContentPane();
      
      //set Layout
      pane.setLayout( new GridLayout(5, 2) );//5 by 2 grid
      
      pane.add(amountLabel);
      pane.add(amountField);
      
      pane.add(durationLabel);
      pane.add(durationField);
      
      pane.add(interestLabel);
      pane.add(interestField);
      
      pane.add(maturityLabel);
      pane.add(maturityField);
      
      pane.add(calculateButton);
      pane.add(resetButton);

      
       //set Title
      setTitle("Certificate of Deposit Program");
      
       //set size
      setSize(WIDTH, HEIGHT);
      setVisible(true);
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);//close the program
      
   }//end constructor
   
    //a private class to handle the calculate event
   private class CalculateButtonHandler implements ActionListener {
   
      public void actionPerformed(ActionEvent e) {
      
      }
      
   }
   
    //a private class to handle the reset event
   private class ResetButtonHandler implements ActionListener {
   
      public void actionPerformed(ActionEvent e) {
      
      }
      
   }
   
   public static void main(String [] args) 
   {
       //create a CertificateOfDeposit object
      CertificateOfDeposit mainWindow = new CertificateOfDeposit();
      
      
   }//end main
   
      
} //end class
