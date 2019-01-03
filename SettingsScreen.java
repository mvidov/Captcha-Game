import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SettingsScreen {

	private JFrame frmSettings;
	private JTextField textRoundsInput;
	private JTextField textLivesInput;
	public int numberOfRounds = 5;
	public int numberOfLives = 3;
	public boolean endless = false;
	
	/**
	 * Launch the application.
	 */
	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingsScreen window = new SettingsScreen();
					window.frmSettings.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SettingsScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSettings = new JFrame();
		frmSettings.setTitle("Settings");
		frmSettings.setBounds(100, 100, 325, 333);
		frmSettings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSettings.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Settings");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 18, 309, 53);
		frmSettings.getContentPane().add(lblNewLabel);
		
		textRoundsInput = new JTextField();
		textRoundsInput.setHorizontalAlignment(SwingConstants.RIGHT);
		textRoundsInput.setText(Integer.toString(numberOfRounds));
		textRoundsInput.setBounds(187, 132, 103, 20);
		frmSettings.getContentPane().add(textRoundsInput);
		textRoundsInput.setColumns(10);
		
		textLivesInput = new JTextField();
		textLivesInput.setHorizontalAlignment(SwingConstants.RIGHT);
		textLivesInput.setText(Integer.toString(numberOfLives));
		textLivesInput.setBounds(187, 82, 103, 20);
		frmSettings.getContentPane().add(textLivesInput);
		textLivesInput.setColumns(10);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(187, 180, 58, 23);
		frmSettings.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setSelected(true);
		rdbtnNo.setBounds(247, 180, 43, 23);
		frmSettings.getContentPane().add(rdbtnNo);

		ButtonGroup bG = new ButtonGroup();
		bG.add(rdbtnYes);
		bG.add(rdbtnNo);

		JButton btnDone = new JButton("Done");
		btnDone.setToolTipText("Click this when done editing settings to apply changes.");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean validInput = true;
				
				try {
				numberOfLives = Integer.parseInt(textLivesInput.getText());
				System.out.println("Number of lives is now: " + numberOfLives);
				validInput = true;
				}
				catch (NumberFormatException e) {
					infoBox("Error! Text was entered into the number of lives feild,\nno changes made to the number of lives!" ,"Error!");
					validInput = false;
				}
				
				try {
					numberOfRounds = Integer.parseInt(textRoundsInput.getText());
					System.out.println("Number of rounds is now: " + numberOfRounds);
					}
					catch (NumberFormatException e) {
						infoBox("Error! Text was entered into the number of rounds feild,\nno changes made to the number of rounds!" ,"Error!");
						validInput = false;
					}
				

				if (validInput == true) {
					if (rdbtnYes.isSelected()) {
						endless = true;
						System.out.println("Endless mode is enabled!");
					}
					
				frmSettings.dispose();
				MainMenu.show();
				}
				
			}
		});
		btnDone.setBounds(105, 238, 89, 23);
		frmSettings.getContentPane().add(btnDone);
		
		JLabel lblLives = new JLabel("Number of lives:");
		lblLives.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLives.setBounds(23, 82, 103, 20);
		frmSettings.getContentPane().add(lblLives);
		
		JLabel lblRounds = new JLabel("Number of rounds:");
		lblRounds.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRounds.setBounds(23, 132, 117, 20);
		frmSettings.getContentPane().add(lblRounds);
		
		JLabel lblEndless = new JLabel("Endless mode?");
		lblEndless.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEndless.setBounds(23, 181, 117, 20);
		frmSettings.getContentPane().add(lblEndless);
	}
	
	/**
	 * shows a message box with a title and message
	 * Pre: none
	 * Post: a message box is shown with the title and message
	 */
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
