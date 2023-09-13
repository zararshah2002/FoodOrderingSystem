package gUIs;

import pkg.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pkg.Admin;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setLocationRelativeTo(null);
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
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton admButton = new JButton("");
		admButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				GUI admGui=new GUI();
				admGui.main(null);
				dispose();				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Enter");
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 35));
		lblNewLabel.setBounds(504, 266, 104, 38);
		contentPane.add(lblNewLabel);
		admButton.setIcon(new ImageIcon(Main.class.getResource("/images/secrt.png")));
		admButton.setBounds(870, 505, 52, 38);
		admButton.setOpaque(false);
		contentPane.add(admButton);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Main.class.getResource("/images/GunEntry.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Umenu A=new Umenu();
				A.setLocationRelativeTo(null);
				A.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(604, 266, 58, 49);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		JLabel Entry =  new JLabel("");
		Entry.setIcon(new ImageIcon(Main.class.getResource("/images/cowb.png")));
		Entry.setBounds(0, -13, 946, 591);
		Entry.setBorder(null);
		contentPane.add(Entry);
	}
}
