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
		
		txtWordguessed = new JTextField();
		txtWordguessed.setHorizontalAlignment(SwingConstants.CENTER);
		txtWordguessed.setBounds(65, 207, 462, 25);
		contentPane.add(txtWordguessed);
		txtWordguessed.setColumns(10);
		
		JLabel lblStatus = new JLabel("help");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setVerticalAlignment(SwingConstants.TOP);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStatus.setBounds(65, 44, 462, 131);
		contentPane.add(lblStatus);
		
		JLabel lblLives = new JLabel("Lives: ");
		lblLives.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLives.setBounds(15, 15, 56, 16);
		contentPane.add(lblLives);
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnA.setBounds(65, 245, 42, 25);
		btnA.setEnabled(false);
		btnA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lblStatus.setText(game.guessLetter('a'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnA.setEnabled(false);
			}
		});
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnB.setBounds(118, 245, 41, 25);
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lblStatus.setText(game.guessLetter('b'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnB.setEnabled(false);
			}
		});
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnC.setBounds(171, 245, 41, 25);
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('c'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnC.setEnabled(false);
			}
		});
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setEnabled(false);
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnD.setBounds(224, 245, 41, 25);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('d'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnD.setEnabled(false);
			}
		});
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setEnabled(false);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnE.setBounds(275, 245, 41, 25);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('e'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnE.setEnabled(false);
			}
		});
		contentPane.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setEnabled(false);
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnF.setBounds(329, 245, 41, 25);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('f'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnF.setEnabled(false);
			}
		});
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setEnabled(false);
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnG.setBounds(382, 245, 41, 25);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('g'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnG.setEnabled(false);
			}
		});
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setEnabled(false);
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnH.setBounds(435, 245, 41, 25);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('h'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnH.setEnabled(false);
			}
		});
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setEnabled(false);
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnI.setBounds(487, 245, 41, 25);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('i'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnI.setEnabled(false);
			}
		});
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setEnabled(false);
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnJ.setBounds(89, 283, 41, 25);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('j'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnJ.setEnabled(false);
			}
		});
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setEnabled(false);
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnK.setBounds(142, 283, 41, 25);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('k'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnK.setEnabled(false);
			}
		});
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setEnabled(false);
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnL.setBounds(195, 283, 41, 25);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('l'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnL.setEnabled(false);
			}
		});
		contentPane.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setEnabled(false);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnM.setBounds(248, 283, 43, 26);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('m'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnM.setEnabled(false);
			}
		});
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setEnabled(false);
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnN.setBounds(301, 283, 41, 25);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('n'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnN.setEnabled(false);
			}
		});
		contentPane.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setEnabled(false);
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnO.setBounds(354, 283, 43, 26);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('o'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnO.setEnabled(false);
			}
		});
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setEnabled(false);
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnP.setBounds(407, 283, 41, 25);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('p'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnP.setEnabled(false);
			}
		});
		contentPane.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setEnabled(false);
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnQ.setBounds(460, 283, 43, 26);
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('q'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnQ.setEnabled(false);
			}
		});
		contentPane.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setEnabled(false);
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnR.setBounds(65, 321, 41, 25);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('r'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnR.setEnabled(false);
			}
		});
		contentPane.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setEnabled(false);
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnS.setBounds(118, 321, 41, 25);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('s'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnS.setEnabled(false);
			}
		});
		contentPane.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setEnabled(false);
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnT.setBounds(171, 321, 41, 25);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('t'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnT.setEnabled(false);
			}
		});
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setEnabled(false);
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnU.setBounds(222, 321, 41, 25);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('u'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnU.setEnabled(false);
			}
		});
		contentPane.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setEnabled(false);
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnV.setBounds(275, 321, 41, 25);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('v'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnV.setEnabled(false);
			}
		});
		contentPane.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setEnabled(false);
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnW.setBounds(328, 321, 44, 25);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('w'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnW.setEnabled(false);
			}
		});
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setEnabled(false);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(381, 321, 41, 25);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('x'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnX.setEnabled(false);
			}
		});
		contentPane.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setEnabled(false);
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnY.setBounds(434, 321, 41, 25);
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('y'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnY.setEnabled(false);
			}
		});
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setEnabled(false);
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnZ.setBounds(487, 321, 41, 25);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblStatus.setText(game.guessLetter('z'));
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnZ.setEnabled(false);
			}
		});
		contentPane.add(btnZ);
		
		JButton btnStartNewGame = new JButton("Start New Game?");
		btnStartNewGame.setBounds(213, 355, 161, 25);
		btnStartNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.startNewGame();
				txtWordguessed.setText(game.displayedWord());
				lblLives.setText("Lives: " + game.lives());
				btnA.setEnabled(true);btnB.setEnabled(true);btnC.setEnabled(true);btnD.setEnabled(true);btnE.setEnabled(true);btnF.setEnabled(true);btnG.setEnabled(true);btnH.setEnabled(true);btnI.setEnabled(true);btnJ.setEnabled(true);btnK.setEnabled(true);btnL.setEnabled(true);btnM.setEnabled(true);btnN.setEnabled(true);btnO.setEnabled(true);btnP.setEnabled(true);btnQ.setEnabled(true);btnR.setEnabled(true);btnS.setEnabled(true);btnT.setEnabled(true);btnU.setEnabled(true);btnV.setEnabled(true);btnW.setEnabled(true);btnX.setEnabled(true);btnY.setEnabled(true);btnZ.setEnabled(true);
			}
		});
		contentPane.add(btnStartNewGame);
		
		
	}
}
