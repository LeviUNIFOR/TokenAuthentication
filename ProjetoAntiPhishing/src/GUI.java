import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        frame.setSize(350,200);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setVisible(true);
        
        frame.add(panel);
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,85,25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);





    }
}