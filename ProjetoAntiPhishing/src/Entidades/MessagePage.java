package Entidades;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MessagePage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton sendButton = new JButton("Enviar");
	JTextField contactField = new JTextField();
	JTextField messageField = new JTextField();
	JLabel contactLabel = new JLabel("Contato:");
	JLabel messageLabel = new JLabel("Mensagem:");
	JLabel postSendMessageLabel = new JLabel();
	ArrayList<Pessoa> pessoaInfo = new ArrayList<Pessoa>();
    UsersAndContacts usersAndContacts = new UsersAndContacts();
	
	public MessagePage(ArrayList<Pessoa> pessoas, String employee){
		
		pessoaInfo = pessoas;
		
		contactLabel.setBounds(50,100,75,25);
		messageLabel.setBounds(50,150,75,25);
		
		postSendMessageLabel.setBounds(125,250,250,35);
		postSendMessageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		contactField.setBounds(125,100,200,25);
		messageField.setBounds(125,150,200,25);
		
		sendButton.setBounds(125,200,100,25);
		sendButton.setFocusable(false);
		sendButton.addActionListener(this);
		
		
		frame.add(contactLabel);
		frame.add(messageLabel);
		frame.add(postSendMessageLabel);
		frame.add(contactField);
		frame.add(messageField);
		frame.add(sendButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==nextPageButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
				}

			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("username not found");
			}
		}
	}	
}