import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndPage {
JFrame Frame = new JFrame();
JLabel endLabel2 = new JLabel("Your order is in the air ");
JLabel endLabel = new JLabel("The payment was done successfully!");



EndPage(){
 endLabel.setBounds(80, 5, 500, 80);
 endLabel2.setForeground(new Color(55,160,100));
 endLabel.setFont(new Font(null,Font.BOLD,20));
 Frame.add(endLabel);
 endLabel2.setBounds(145,80, 500, 80);
 endLabel.setForeground(new Color(55,160,100));
 endLabel2.setFont(new Font(null,Font.BOLD,20));
 Frame.add(endLabel2);
 
 Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 Frame.setSize(500,200);
 Frame.setLayout(null);
 Frame.setVisible(true);
 Frame.setLocationRelativeTo(null);
 ImageIcon image = new ImageIcon("logo.jpg");// create ImageIcon
 Frame.setIconImage(image.getImage());//change icon of this
}
}