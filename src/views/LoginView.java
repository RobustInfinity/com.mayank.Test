package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import items.LoginOperations;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginView extends JFrame {

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
					new LoginView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 30));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(350, 62, 97, 39);
		contentPane.add(lblLogin);
		
		JLabel lblUserid = new JLabel("UserId");
		lblUserid.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		lblUserid.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserid.setBounds(268, 191, 75, 25);
		contentPane.add(lblUserid);
		
		userId = new JTextField();
		userId.setBounds(400, 177, 236, 39);
		contentPane.add(userId);
		userId.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		lblPassword.setBounds(236, 259, 107, 31);
		contentPane.add(lblPassword);
		
		password = new JTextField();
		password.setBounds(400, 250, 236, 39);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		btnLogin.setBounds(209, 419, 116, 39);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				checkLogin();
			
			}});
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		btnRegister.setBounds(532, 419, 142, 39);
		contentPane.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getRegisterView();
			}
			
		});
	}
	
	
		public void checkLogin() {
			if(LoginOperations.getInstance().searchUser(userId.getText(), password.getText())) {
				JOptionPane.showMessageDialog(this, new String("Login Successfully"));
				new TestView();
				setVisible(false);
			}
			else 
			 JOptionPane.showMessageDialog(this,new String("Invalid UserId / Password"));
			
		}
		public void getRegisterView() {
			new RegistrationView();
			setVisible(false);
		}

}
