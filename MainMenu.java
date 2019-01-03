import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class MainMenu {

	private JFrame frmMainMenu;
	SettingsScreen settings = new SettingsScreen();
	PlayScreen play = new PlayScreen();

	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setBounds(100, 100, 377, 387);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane Creators = new JTextPane();
		Creators.setBounds(83, 86, 199, 20);
		Creators.setBackground(SystemColor.info);
		Creators.setText("Created By: John Nick and Matthew");
		Creators.setEditable(false);
		Creators.setToolTipText("");
		Creators.setVisible(false);
		frmMainMenu.getContentPane().setLayout(null);
		frmMainMenu.getContentPane().add(Creators);
		
		JLabel lblTitle = new JLabel("CAPTCHA Test");
		lblTitle.setBounds(95, 33, 177, 78);
		lblTitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Creators.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Creators.setVisible(false);
			}
		});
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Calibri", Font.BOLD, 25));
		frmMainMenu.getContentPane().add(lblTitle);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(95, 139, 177, 35);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("User is Playing the game!");
				
				play.show();
				frmMainMenu.dispose();
				//closes the main screen and shows the settings window
			}
		});
		frmMainMenu.getContentPane().add(btnStart);
		
		JButton btnHelp = new JButton("How To Play");
		btnHelp.setBounds(95, 208, 177, 35);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Help Requested!");
				
				infoBox("Here's how to play: \n"
						+ "First a topic will pop up on the top of the page,\n"
						+ "Then a set of images will appear and you must \n"
						+ "click all images that relate to the topic!", "How To Play!");
				//shows a message box displaying how to play the game
			}
		});
		frmMainMenu.getContentPane().add(btnHelp);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(95, 280, 177, 35);
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("User is changing settings.");
				
				settings.show();
				frmMainMenu.dispose();
				//closes the main screen and shows the settings window
			}
		});
		frmMainMenu.getContentPane().add(btnSettings);
		
		
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