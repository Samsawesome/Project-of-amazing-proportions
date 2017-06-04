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
	private Hangman2 game;
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
		game = new Hangman2();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnA.setBounds(65, 245, 42, 25);
		btnA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				game.guessLetter('A');
			}
		});
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnB.setBounds(118, 245, 41, 25);
		btnB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				game.guessLetter('B');
			}
		});
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnC.setBounds(171, 245, 41, 25);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('C');
			}
		});
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnD.setBounds(224, 245, 41, 25);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('D');
			}
		});
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnE.setBounds(275, 245, 41, 25);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('E');
			}
		});
		contentPane.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnF.setBounds(329, 245, 41, 25);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('F');
			}
		});
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnG.setBounds(382, 245, 41, 25);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('G');
			}
		});
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnH.setBounds(435, 245, 41, 25);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('H');
			}
		});
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnI.setBounds(487, 245, 41, 25);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('I');
			}
		});
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnJ.setBounds(89, 283, 41, 25);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('J');
			}
		});
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnK.setBounds(142, 283, 41, 25);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('K');
			}
		});
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnL.setBounds(195, 283, 41, 25);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('L');
			}
		});
		contentPane.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnM.setBounds(248, 283, 41, 26);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('M');
			}
		});
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnN.setBounds(301, 283, 41, 25);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('N');
			}
		});
		contentPane.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnO.setBounds(354, 283, 41, 26);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('O');
			}
		});
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnP.setBounds(407, 283, 41, 25);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('P');
			}
		});
		contentPane.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnQ.setBounds(460, 283, 41, 26);
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('Q');
			}
		});
		contentPane.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnR.setBounds(65, 321, 41, 25);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('R');
			}
		});
		contentPane.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnS.setBounds(118, 321, 41, 25);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('S');
			}
		});
		contentPane.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnT.setBounds(171, 321, 41, 25);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('T');
			}
		});
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnU.setBounds(222, 321, 41, 25);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('U');
			}
		});
		contentPane.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnV.setBounds(275, 321, 41, 25);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('V');
			}
		});
		contentPane.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnW.setBounds(328, 321, 42, 27);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('W');
			}
		});
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(381, 321, 41, 25);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('X');
			}
		});
		contentPane.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnY.setBounds(434, 321, 41, 25);
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('Y');
			}
		});
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnZ.setBounds(487, 321, 41, 25);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.guessLetter('Z');
			}
		});
		contentPane.add(btnZ);

		txtWordguessed = new JTextField();
		txtWordguessed.setHorizontalAlignment(SwingConstants.CENTER);
		txtWordguessed.setText(game.displayedWord());
		txtWordguessed.setBounds(65, 207, 462, 25);
		contentPane.add(txtWordguessed);
		txtWordguessed.setColumns(10);
		
		JButton btnStartNewGame = new JButton("Start New Game?");
		btnStartNewGame.setBounds(213, 355, 161, 25);
		btnStartNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.startNewGame();
			}
		});
		contentPane.add(btnStartNewGame);
		
		JLabel lblLives = new JLabel("Lives: " + game.lives());
		lblLives.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLives.setBounds(15, 15, 56, 16);
		contentPane.add(lblLives);
		
		
	}
}
