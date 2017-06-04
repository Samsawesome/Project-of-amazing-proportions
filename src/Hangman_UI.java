import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Hangman_UI extends JFrame {

	private JPanel contentPane;
	private JTextField txtWordguessed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hangman_UI frame = new Hangman_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hangman_UI() {
		
		JButton btnOw = new JButton("Ow");
		JButton btnQ = new JButton("Q");
		getContentPane().add(btnOw, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("R");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(65, 281, 41, 25);
		contentPane.add(btnNewButton);
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnA.setBounds(65, 206, 42, 25);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnB.setBounds(118, 206, 41, 25);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnC.setBounds(171, 206, 41, 25);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnD.setBounds(222, 206, 41, 25);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnE.setBounds(275, 206, 41, 25);
		contentPane.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnF.setBounds(328, 206, 41, 25);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnG.setBounds(381, 206, 41, 25);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnH.setBounds(434, 206, 41, 25);
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnI.setBounds(487, 206, 41, 25);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnJ.setBounds(87, 243, 41, 25);
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnK.setBounds(140, 243, 41, 25);
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnL.setBounds(193, 244, 41, 25);
		contentPane.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnM.setBounds(242, 243, 41, 25);
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnN.setBounds(295, 244, 41, 25);
		contentPane.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnO.setBounds(348, 243, 41, 25);
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnP.setBounds(401, 243, 41, 25);
		contentPane.add(btnP);
		
		JButton btnQ_1 = new JButton("Q");
		btnQ_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnQ_1.setBounds(455, 244, 41, 25);
		contentPane.add(btnQ_1);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnZ.setBounds(487, 281, 41, 25);
		contentPane.add(btnZ);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnS.setBounds(118, 281, 41, 25);
		contentPane.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnT.setBounds(171, 282, 41, 25);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnU.setBounds(222, 280, 41, 25);
		contentPane.add(btnU);
		
		JButton button_21 = new JButton("V");
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_21.setBounds(275, 282, 41, 25);
		contentPane.add(button_21);
		
		JButton btnW = new JButton("W");
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnW.setBounds(328, 281, 42, 25);
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(381, 282, 41, 25);
		contentPane.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnY.setBounds(434, 282, 41, 25);
		contentPane.add(btnY);
		
		txtWordguessed = new JTextField();
		txtWordguessed.setHorizontalAlignment(SwingConstants.CENTER);
		txtWordguessed.setText("_ _ _ etc");
		txtWordguessed.setBounds(65, 315, 462, 25);
		contentPane.add(txtWordguessed);
		txtWordguessed.setColumns(10);
		
		JButton btnStartNewGame = new JButton("Start New Game?");
		btnStartNewGame.setBounds(213, 355, 161, 25);
		contentPane.add(btnStartNewGame);
		
		JLabel lblLives = new JLabel("Lives:");
		lblLives.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLives.setBounds(15, 15, 56, 16);
		contentPane.add(lblLives);
	}
}
