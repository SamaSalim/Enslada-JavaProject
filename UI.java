import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
public class UI extends JFrame{

public UI() {
		// set up frame
		super("EnSalada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,400);// set up size
		getContentPane().setBackground(Color.WHITE);
		
		Border border = BorderFactory.createLineBorder(new Color(55,160,100), 10);
	    ((JComponent) getContentPane()).setBorder(border);
	    
		setLocationRelativeTo(null); //make the UI in the middle
		addGUIComponents();
        setVisible(true);// make the UI visible
        // Set the UI icon to the image
        ImageIcon image = new ImageIcon("Elogo.jpeg");// create ImageIcon
       setIconImage(image.getImage());//change icon

	}
		public void addGUIComponents() {
		//set up layout
		SpringLayout springLayout = new SpringLayout();
		JPanel UIPanel = new JPanel(springLayout);
		
		//user name label and text field
		JLabel userLable = new JLabel("UserName:");
		userLable.setForeground(new Color(55,160,100));
	    userLable.setFont(new Font("Dialog",Font.BOLD,16)); //set font size
	    JTextField userField = new JTextField(18);
		userField.setFont(new Font("Dialog",Font.PLAIN,16)); //set font size
		
		//set constraints for user name label and text field
		springLayout.putConstraint(SpringLayout.WEST,userLable,140 ,SpringLayout.WEST,UIPanel);
		springLayout.putConstraint(SpringLayout.NORTH,userLable,30 ,SpringLayout.NORTH,UIPanel);
		
		springLayout.putConstraint(SpringLayout.WEST,userField,260,SpringLayout.WEST,UIPanel);
		springLayout.putConstraint(SpringLayout.NORTH,userField,30,SpringLayout.NORTH,UIPanel);	
		
		//add user name label and text filed to login panel
		UIPanel.add(userLable);
		UIPanel.add(userField);
		
		
		// phone number label and text field
		JLabel numberLabel = new JLabel("phoneNumber:");
		numberLabel.setForeground(new Color(55,160,100));
		numberLabel.setFont(new Font("Dialog",Font.BOLD,16));//set font size
		JTextField numberField = new JTextField(18);
		numberField.setFont(new Font("Dialog",Font.PLAIN,16));//set font size
		//set for phone number label and text field
		springLayout.putConstraint(SpringLayout.WEST,numberLabel,110 ,SpringLayout.WEST,UIPanel);
		springLayout.putConstraint(SpringLayout.NORTH,numberLabel,80 ,SpringLayout.NORTH,UIPanel);
		
		springLayout.putConstraint(SpringLayout.WEST,numberField,260,SpringLayout.WEST,UIPanel);
		springLayout.putConstraint(SpringLayout.NORTH,numberField,80,SpringLayout.NORTH,UIPanel);	
		
		//add phone number label and text filed to login panel
		UIPanel.add(numberLabel);
		UIPanel.add(numberField);
		
		//address label and text filed
		 JLabel addLable = new JLabel("Address:");
		 addLable.setForeground(new Color(55,160,100));
		 addLable.setFont(new Font("Dialog",Font.BOLD,16));//set font size
		 JTextField addField = new JTextField(18);
		 addField.setFont(new Font("Dialog",Font.PLAIN,16));//set font size
	
		//set constraints for address label and text field
		    springLayout.putConstraint(SpringLayout.WEST,addLable,155 ,SpringLayout.WEST,UIPanel);
			springLayout.putConstraint(SpringLayout.NORTH,addLable,130,SpringLayout.NORTH,UIPanel);
			
			springLayout.putConstraint(SpringLayout.WEST, addField,260,SpringLayout.WEST,UIPanel);
			springLayout.putConstraint(SpringLayout.NORTH, addField,130,SpringLayout.NORTH,UIPanel);	
			
			//add address label and text filed to login panel
			UIPanel.add(addLable);
			UIPanel.add(addField);
			
			getContentPane().add(UIPanel);
			//add next and exit buttons
			JButton NextButton = new JButton("NEXT");
			JButton exitButton = new JButton("EXIT");
			NextButton.setBackground(Color.lightGray);
			exitButton.setBackground(Color.lightGray);
			exitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
				dispose();//close the window when the exit button is clicked
				}
			});
			
			
			NextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
			//	EndPage endPage=new EndPage();
					Receipt receipt = new Receipt();
				
				}
			});
			springLayout.putConstraint(SpringLayout.WEST,NextButton ,580,SpringLayout.WEST,UIPanel);	
			springLayout.putConstraint(SpringLayout.NORTH,NextButton ,200,SpringLayout.NORTH,UIPanel);
			UIPanel.add(NextButton);
			
			springLayout.putConstraint(SpringLayout.WEST,exitButton ,660,SpringLayout.WEST,UIPanel);	
			springLayout.putConstraint(SpringLayout.NORTH,exitButton ,200,SpringLayout.NORTH,UIPanel);	
			UIPanel.add(exitButton);
			
			// set up image1 logo
		     ImageIcon image1 = new ImageIcon("Elogo.jpeg");
		     JLabel imageLabel = new JLabel(image1);

		     // Resize the image using the SCALE_SMOOTH algorithm
		     Image image = image1.getImage();
		     int width = 170;
		     int height = 100;
		     Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		     ImageIcon resizedImageIcon = new ImageIcon(resizedImage);

		     // Set the new ImageIcon as the icon for the JLabel
		     imageLabel.setIcon(resizedImageIcon);

		     // Set the position of the image in the frame
		     add(imageLabel, BorderLayout.NORTH);

	}
	
}