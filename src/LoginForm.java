import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginForm {


    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        
        // panel.setSize(200,200);
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add spacing between components
        
        gbc.anchor = GridBagConstraints.WEST;


        
        JLabel label = new JLabel("User");
        // label.setBounds(10,20,80,25);
        label.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(label,gbc);
        
        JTextField userText = new JTextField();
        userText.setBorder(null);
        
        // userText.setBounds(100, 20, 165, 25);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 8;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(userText,gbc);
        
        JLabel passwordLabel = new JLabel("Password");
        // passwordLabel.setBounds(10,50,80,25);
        passwordLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(passwordLabel,gbc);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBorder(null);
        // passwordText.setBounds(100,50,165,25);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 8;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(passwordText,gbc);


        gbc.insets = new Insets(40, 5, 5, 5);
        JButton button = new RoundedButton("Login");
        button.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        panel.add(button,gbc);
        
        JButton RegisterButton = new StrokeButton("Register");
        // RegisterButton.setBounds(92,80,72, 40);
        RegisterButton.setForeground(Color.CYAN);
        gbc.gridx = 4;
        gbc.gridy = 10;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(RegisterButton,gbc);
        
        
        frame.setVisible(true);
    }
}
