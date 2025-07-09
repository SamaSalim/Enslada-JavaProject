import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Receipt extends JFrame {
	
public Receipt (){
	super("EnSalada");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,400);// set up size
	setLocationRelativeTo(null); //make the UI in the middle
	JPanel ReceiptPanel = new JPanel();
	getContentPane().add(ReceiptPanel);
	AddGUIComponents(ReceiptPanel);
	Border border = BorderFactory.createLineBorder(new Color(55,160,100),10);
	((JComponent) getContentPane()).setBorder(border);
    setVisible(true);// make the UI visible
    ImageIcon image = new ImageIcon("logo.jpg");// create ImageIcon
	setIconImage(image.getImage());//change icon of this
	//getContentPane().setBackground(Color.);

}

public void AddGUIComponents(JPanel ReceiptPanel) {
	//set up layout
			SpringLayout springLayout = new SpringLayout();
			ReceiptPanel.setLayout(springLayout);
			
			//card number label and text field
			JLabel cardLable = new JLabel("Card number:");
			cardLable.setForeground(new Color(55,160,100));
		    cardLable.setFont(new Font("Dialog",Font.BOLD,16)); //set font size
		    JTextField cardField = new JTextField(18);
		    cardField.setFont(new Font("Dialog",Font.BOLD,16)); //set font size
		   
			//set constraints for user name label and text field
			springLayout.putConstraint(SpringLayout.WEST,cardLable,140 ,SpringLayout.WEST,ReceiptPanel);
			springLayout.putConstraint(SpringLayout.NORTH,cardLable,150 ,SpringLayout.NORTH,ReceiptPanel);
			
			springLayout.putConstraint(SpringLayout.WEST,cardField,260,SpringLayout.WEST,ReceiptPanel);
			springLayout.putConstraint(SpringLayout.NORTH,cardField,150,SpringLayout.NORTH,ReceiptPanel);	
			
			//add card number label and text filed to login panel
			ReceiptPanel.add(cardField);
			ReceiptPanel.add(cardLable);
			//Password label and text field
			JLabel PasswordLable = new JLabel("Password:");
			PasswordLable.setForeground(new Color(55,160,100));
			PasswordLable.setFont(new Font("Dialog",Font.BOLD,16)); //set font size
			JTextField passwordField = new JTextField(18);
			passwordField.setFont(new Font("Dialog",Font.BOLD,16)); //set font size
		
			//set constraints for user name label and text field
			springLayout.putConstraint(SpringLayout.WEST, PasswordLable, 160, SpringLayout.WEST, ReceiptPanel);
			springLayout.putConstraint(SpringLayout.NORTH, PasswordLable, 200, SpringLayout.NORTH, ReceiptPanel);
			
			springLayout.putConstraint(SpringLayout.WEST, passwordField, 260, SpringLayout.WEST, ReceiptPanel);
			springLayout.putConstraint(SpringLayout.NORTH, passwordField, 200, SpringLayout.NORTH, ReceiptPanel);

			//add user name label and text filed to login panel
			ReceiptPanel.add(PasswordLable);
			ReceiptPanel.add(passwordField);
			
			JButton payButton= new JButton("Pay");//Confirm button
			payButton.setFont(new Font("Dialog",Font.PLAIN,16));//set font size
			// Set background color for confirm button
			payButton.setBackground(Color.lightGray);

			//set constraints for Confirm button
			springLayout.putConstraint(SpringLayout.WEST, payButton, 360, SpringLayout.WEST, ReceiptPanel);
			springLayout.putConstraint(SpringLayout.NORTH, payButton, 290, SpringLayout.NORTH, ReceiptPanel);
            //add confirm button to ReceiptPanel
			ReceiptPanel.add(payButton);
			payButton.addActionListener(new ActionListener() {
			    
			    public void actionPerformed(ActionEvent e) {
			    	EndPage endPage = new EndPage ();
			    }
			});

}
}
