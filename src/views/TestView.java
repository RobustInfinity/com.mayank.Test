package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import items.Test;
import items.TestOperations;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TestView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
		
	private Test []testQues = new Test[3];
	private int index = 0;
	
	private ButtonGroup btnGrp;
	
	private JLabel lblTest;
	private JLabel lblQuestion;
	private JLabel lblQuesNo;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	private JRadioButton rdbtnOptionA;
	private JRadioButton rdbtnOptionB;
	private JRadioButton rdbtnOptionC;
	private JRadioButton rdbtnOptionD;
	
	private JButton btnSkipTest;
	
	//private JRadioButton []rdbtn = {rdbtnOptionA, rdbtnOptionB, rdbtnOptionC, rdbtnOptionD};
	
	private JButton btnPrevious;
	private JButton btnNext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TestView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTest = new JLabel("TEST");
		lblTest.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 30));
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTest.setBounds(350, 95, 92, 26);
		contentPane.add(lblTest);
		
				
		lblQuestion = new JLabel("Loading...");
		lblQuestion.setVerticalAlignment(SwingConstants.TOP);
		lblQuestion.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblQuestion.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuestion.setBounds(200, 234, 466, 32);
		contentPane.add(lblQuestion);
		
		lblQuesNo = new JLabel("...");
		lblQuesNo.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblQuesNo.setBounds(172, 234, 16, 26);
		contentPane.add(lblQuesNo);
		
		rdbtnOptionA = new JRadioButton("A. ");
		rdbtnOptionA.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		rdbtnOptionA.setBounds(200, 295, 287, 25);
		rdbtnOptionA.setActionCommand("A");
		rdbtnOptionA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				updateAns(e);
			
			}
		});
		contentPane.add(rdbtnOptionA);
		
		rdbtnOptionB = new JRadioButton("B. ");
		rdbtnOptionB.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		rdbtnOptionB.setBounds(200, 347, 287, 25);
		rdbtnOptionB.setActionCommand("B");
		rdbtnOptionB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				updateAns(e);
			}
		});
		contentPane.add(rdbtnOptionB);
		
		rdbtnOptionC = new JRadioButton("C. ");
		rdbtnOptionC.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		rdbtnOptionC.setBounds(200, 404, 287, 25);
		rdbtnOptionC.setActionCommand("C");
		rdbtnOptionC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				updateAns(e);
			}
			
			
		});
		contentPane.add(rdbtnOptionC);
		
		rdbtnOptionD = new JRadioButton("D. ");
		rdbtnOptionD.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		rdbtnOptionD.setBounds(200, 459, 287, 25);
		rdbtnOptionD.setActionCommand("D");
		rdbtnOptionD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				updateAns(e);
			}
			
		});
		contentPane.add(rdbtnOptionD);
		
		JLabel lblAns = new JLabel("Ans.");
		lblAns.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblAns.setHorizontalAlignment(SwingConstants.CENTER);
		lblAns.setBounds(132, 299, 56, 16);
		contentPane.add(lblAns);
		
		btnPrevious = new JButton("PREVIOUS");
		btnPrevious.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		btnPrevious.setBounds(490, 549, 139, 42);
		btnPrevious.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showPreviousQuestion();
			}
		});
		contentPane.add(btnPrevious);
		
		btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		btnNext.setBounds(663, 549, 128, 42);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showNextQuestion();
			}
		});
		contentPane.add(btnNext);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(TestView.class.getResource("redStatus.png")));
		lblNewLabel.setBounds(95, 138, 50, 50);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(157, 138, 50, 50);
		lblNewLabel_1.setIcon(new ImageIcon(TestView.class.getResource("redStatus.png")));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(219, 138, 50, 50);
		lblNewLabel_2.setIcon(new ImageIcon(TestView.class.getResource("redStatus.png")));
		contentPane.add(lblNewLabel_2);
		
		btnSkipTest = new JButton("Skip Test");
		btnSkipTest.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 13));
		btnSkipTest.setBounds(598, 609, 97, 25);
		btnSkipTest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				skipTest();
			}
		});
		contentPane.add(btnSkipTest);
		
		btnGrp = new ButtonGroup();
		
		//showStatus();
		groupButton();
		getRandomQues();
	}
	
	public void groupButton() {
		
		btnGrp.add(rdbtnOptionA);
		btnGrp.add(rdbtnOptionB);
		btnGrp.add(rdbtnOptionC);
		btnGrp.add(rdbtnOptionD);
	}
	public void getRandomQues() {
		
		while(index <= 2) {
		 Test test = TestOperations.getInstance().getQuestionList().get(Test.getRandom()); 
			if(!test.isStatus()) {
				testQues[index] = test;
				test.setStatus(true);
				System.out.println("Index" + index);
				index++;
			}
		}
		index = 0;
		showQuestion();
	}
	
	
	public void showQuestion() {
		
		lblQuesNo.setText(String.valueOf(testQues[index].getQuesNo()));
		lblQuestion.setText(testQues[index].getQuestion());
		rdbtnOptionA.setText(testQues[index].getOptions()[0]);
		rdbtnOptionB.setText(testQues[index].getOptions()[1]);
		rdbtnOptionC.setText(testQues[index].getOptions()[2]);
		rdbtnOptionD.setText(testQues[index].getOptions()[3]);
		btnNext.setEnabled(checkEnabledNext());
		btnPrevious.setEnabled(checkEnabledPrevious());
		if(testQues[index].getUrAns() == null)
			clearAnswers();
		else {
			switch(testQues[index].getUrAns()) {
			case "A" :
				rdbtnOptionA.setSelected(true);
				break;
			case "B" :
				rdbtnOptionB.setSelected(true);
				break;
			case "C" :
				rdbtnOptionC.setSelected(true);
				break;
			case "D" :
				rdbtnOptionD.setSelected(true);
				break;
			}
		}
		
	
	}
	
	public void clearAnswers() {
		btnGrp.clearSelection();
	}
	public void updateAns(ActionEvent e) {
		Test currentQuestion = testQues[index];
		if(e.getSource() == null)
			currentQuestion.setUrAns("N/A");
		else if(e.getSource() == rdbtnOptionA)
			currentQuestion.setUrAns("A");
		else if(e.getSource() == rdbtnOptionB)
			currentQuestion.setUrAns("B");
		else if(e.getSource() == rdbtnOptionC)
			currentQuestion.setUrAns("C");
		else if(e.getSource() == rdbtnOptionD)
			currentQuestion.setUrAns("D");
		if(e.getSource() == null) 
			currentQuestion.setUrAns("N/A");
		//testQues[index].setStatus(true);
		showStatus(e);
	}
	
	public void showStatus(ActionEvent e) {
		JLabel []status = {lblNewLabel, lblNewLabel_1, lblNewLabel_2};
		 if( !(e.getSource() == null)) {
			status[testQues[index].getQuesNo()-1].setIcon(new ImageIcon(TestView.class.getResource("greenStatus.png")));
			contentPane.add(status[testQues[index].getQuesNo()-1]);
		}
		
	}
	
	public void showNextQuestion() {
		index++;
		showQuestion();	
		
	}
	
	public void showPreviousQuestion() {
		index--;
		showQuestion();
	}
	public boolean checkEnabledNext() {
		
		if(index == 2) {
			btnSkipTest.setText("END TEST");
			return false;
		}
		else 
			return true;
		
	}
	
	public boolean checkEnabledPrevious() {
		
		if(index == 0)
			return false;
		else 
			return true;
	}
	
	
	
	public void skipTest() {
		new ResultView();
		setVisible(false);
	}
}
