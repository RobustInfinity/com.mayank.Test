package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import items.LoginOperations;
import items.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class RegistrationView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userId;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//RegistrationView frame = new RegistrationView();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 30));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(350, 81, 127, 31);
		contentPane.add(lblRegister);
		
		JLabel lblUserid = new JLabel("UserId*");
		lblUserid.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		lblUserid.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserid.setBounds(261, 189, 81, 31);
		contentPane.add(lblUserid);
		
		userId = new JTextField();
		userId.setBounds(403, 189, 193, 30);
		contentPane.add(userId);
		userId.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password*");
		lblPassword.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(231, 294, 111, 30);
		contentPane.add(lblPassword);
		
		password = new JTextField();
		password.setBounds(403, 294, 193, 30);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		btnRegister.setBounds(350, 411, 144, 39);
		contentPane.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addUser();
			}
			
		});
		
		JLabel lblFeildsAre = new JLabel("( * )  Feilds are Mandatory");
		lblFeildsAre.setForeground(Color.DARK_GRAY);
		lblFeildsAre.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblFeildsAre.setBounds(650, 426, 220, 24);
		contentPane.add(lblFeildsAre);
		
		JButton btnBackToLogin = new JButton("BACK TO LOGIN");
		btnBackToLogin.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 13));
		btnBackToLogin.setBounds(360, 463, 123, 30);
		contentPane.add(btnBackToLogin);
		btnBackToLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getLoginView();
			}
			
		});
	}
	
	public void addUser() {
		String newUserId = userId.getText();                                 //Why newUserId ??    Why not from setUserId 
		String newPassword = password.getText();
		User newUser = new User(newUserId, newPassword);
		LoginOperations.getInstance().addUser(newUser);
		String message = "Registered Successfully";
		JOptionPane.showMessageDialog(this, message);
		
	}
	public void getLoginView() {
		new LoginView();
		setVisible(false);
	}
}
