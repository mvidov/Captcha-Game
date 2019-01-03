import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayScreen {

	private JFrame frmPlay;
	Boolean selected1 = false;
	Boolean selected2 = false;
	Boolean selected3 = false;
	Boolean selected4 = false;
	Boolean selected5 = false;
	Boolean selected6 = false;
	Boolean selected7 = false;
	Boolean selected8 = false;
	Boolean selected9 = false;
	Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	Random rnd = new Random();
	ImageIcon imageSelected = new ImageIcon(resizeImage("Images/CheckMark.png", 151, 134));
	ImageIcon img1;
	ImageIcon img2;
	ImageIcon img3;
	ImageIcon img4;
	ImageIcon img5;
	ImageIcon img6;
	ImageIcon img7;
	ImageIcon img8;
	ImageIcon img9;
	String[] images = new String[] {
			"Images/Animals/Bear.jpg",
			"Images/Animals/dog.jpg",
			"Images/Animals/panda.jpg",
			"Images/Animals/rabbit.jpg",
			"Images/Animals/squiral.jpg",
			"Images/Animals/wolf.jpg",
			"Images/Animals/Cat.jpg",
			"Images/Animals/Fox.jpg",
			"Images/Animals/Lizard.jpg",
			"Images/Animals/Penguin.jpg",
			"Images/Food/Banana.jpg",
			"Images/Food/Cheese.jpg",
			"Images/Food/FastFood.jpg",
			"Images/Food/Orange.jpg",
			"Images/Food/sandwich.jpg",
	};
	String[] topics = new String[] {
			"Animals",
			"Food",
			"People"
	};
	
	/**
	 * Launch the application.
	 */
	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayScreen window = new PlayScreen();
					window.frmPlay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */
	public PlayScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmPlay = new JFrame();
		frmPlay.setTitle("Play!");
		frmPlay.setBounds(100, 100, 576, 629);
		frmPlay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlay.getContentPane().setLayout(null);
		
		JButton btnFinishRound = new JButton("Done!");
		btnFinishRound.setBounds(98, 556, 175, 23);
		frmPlay.getContentPane().add(btnFinishRound);
		
		JLabel lblTopic = new JLabel("Click all images Containing: " + topics[rnd.nextInt(topics.length)]);
		lblTopic.setFont(new Font("Calibri", Font.BOLD, 25));
		lblTopic.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopic.setBounds(10, 28, 540, 53);
		frmPlay.getContentPane().add(lblTopic);
		
		JLabel lblImage1 = new JLabel("");
		lblImage1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (selected1 == false) {
					lblImage1.setIcon(imageSelected);
					selected1 = true;
				} else {
					lblImage1.setIcon(img1);
					selected1 = false;
				}
			}
		});
		lblImage1.setBounds(26, 92, 151, 134);
		img1 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage1.getWidth(), lblImage1.getHeight()));
		lblImage1.setIcon(img1);
		lblImage1.setBorder(border);
		frmPlay.getContentPane().add(lblImage1);
		
		JLabel lblImage2 = new JLabel("");
		lblImage2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (selected2 == false) {
					lblImage2.setIcon(imageSelected);
					selected2 = true;
				} else {
					lblImage2.setIcon(img2);
					selected2 = false;
				}
			}
		});
		lblImage2.setBounds(203, 92, 151, 134);
		img2 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage2.getWidth(), lblImage2.getHeight()));
		lblImage2.setIcon(img2);
		lblImage2.setBorder(border);
		frmPlay.getContentPane().add(lblImage2);
		
		JLabel lblImage3 = new JLabel("");
		lblImage3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (selected3 == false) {
					lblImage3.setIcon(imageSelected);
					selected3 = true;
				} else {
					lblImage3.setIcon(img3);
					selected3 = false;
				}
			}
		});
		lblImage3.setBounds(380, 92, 151, 134);
		img3 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage3.getWidth(), lblImage3.getHeight()));
		lblImage3.setIcon(img3);
		lblImage3.setBorder(border);
		frmPlay.getContentPane().add(lblImage3);
		
		JLabel lblImage4 = new JLabel("");
		lblImage4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (selected4 == false) {
					lblImage4.setIcon(imageSelected);
					selected4 = true;
				} else {
					lblImage4.setIcon(img4);
					selected4 = false;
				}
			}
		});
		lblImage4.setBounds(26, 237, 151, 134);
		img4 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage4.getWidth(), lblImage4.getHeight()));
		lblImage4.setIcon(img4);
		lblImage4.setBorder(border);
		frmPlay.getContentPane().add(lblImage4);
		
		JLabel lblImage5 = new JLabel("");
		lblImage5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (selected5 == false) {
					lblImage5.setIcon(imageSelected);
					selected5 = true;
				} else {
					lblImage5.setIcon(img5);
					selected5 = false;
				}
			}
		});
		lblImage5.setBounds(201, 237, 151, 134);
		img5 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage5.getWidth(), lblImage5.getHeight()));
		lblImage5.setIcon(img5);
		lblImage5.setBorder(border);
		frmPlay.getContentPane().add(lblImage5);
		
		JLabel lblImage6 = new JLabel("");
		lblImage6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (selected6 == false) {
					lblImage6.setIcon(imageSelected);
					selected6 = true;
				} else {
					lblImage6.setIcon(img6);
					selected6 = false;
				}
			}
		});
		lblImage6.setBounds(380, 237, 151, 134);
		img6 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage6.getWidth(), lblImage6.getHeight()));
		lblImage6.setIcon(img6);
		lblImage6.setBorder(border);
		frmPlay.getContentPane().add(lblImage6);
		
		JLabel lblImage7 = new JLabel("");
		lblImage7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (selected7 == false) {
					lblImage7.setIcon(imageSelected);
					selected7 = true;
				} else {
					lblImage7.setIcon(img7);
					selected7 = false;
				}
			}
		});
		lblImage7.setBounds(26, 382, 151, 134);
		img7 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage7.getWidth(), lblImage7.getHeight()));
		lblImage7.setIcon(img7);
		lblImage7.setBorder(border);
		frmPlay.getContentPane().add(lblImage7);
		
		JLabel lblImage8 = new JLabel("");
		lblImage8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (selected8 == false) {
					lblImage8.setIcon(imageSelected);
					selected8 = true;
				} else {
					lblImage8.setIcon(img8);
					selected8 = false;
				}
			}
		});
		lblImage8.setBounds(203, 382, 151, 134);
		img8 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage8.getWidth(), lblImage8.getHeight()));
		lblImage8.setIcon(img8);
		lblImage8.setBorder(border);
		frmPlay.getContentPane().add(lblImage8);
		
		JLabel lblImage9 = new JLabel("");
		lblImage9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (selected9 == false) {
					lblImage9.setIcon(imageSelected);
					selected9 = true;
				} else {
					lblImage9.setIcon(img9);
					selected9 = false;
				}
			}
		});
		lblImage9.setBounds(380, 382, 151, 134);
		img9 = new ImageIcon(resizeImage(images[rnd.nextInt(images.length)], lblImage9.getWidth(), lblImage9.getHeight()));
		lblImage9.setIcon(img9);
		lblImage9.setBorder(border);
		frmPlay.getContentPane().add(lblImage9);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Go back to the main menu");
		menuBar.setBounds(0, 0, 97, 21);
		frmPlay.getContentPane().add(menuBar);
		
		JMenuItem mntmMainMenu = new JMenuItem("Main Menu");
		mntmMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("User has stopped playing!");
				frmPlay.dispose();
				MainMenu.show();
			}
		});
		mntmMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmMainMenu);
	}
	
	/**
	 * resizes an image to a specified height and width
	 * Pre: imagePath is a valid path, height and width > 0
	 * Post: returns an image of the new size
	 */
	public static Image resizeImage(String imagePath, int width, int height) {
		Image img = null;
		try {
		    img = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return img;
	}
}
