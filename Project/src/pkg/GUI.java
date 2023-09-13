package pkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import gUIs.Main;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JPasswordField Pass;
	private JTextField txtUname;

	private Menu menu=new Menu();
	//private AdminGui adm=new AdminGui();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
					/*Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					window.frame.setBounds(100, 100, (int) dim.getWidth(), (int) dim.getHeight());
					//setLocationRelativeTo(null);

					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 581, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Pass = new JPasswordField();
		Pass.setBounds(49, 413, 176, 27);
		Pass.setToolTipText("");
		frame.getContentPane().add(Pass);
		
		txtUname = new JTextField();
		txtUname.setForeground(Color.BLACK);
		txtUname.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtUname.setBounds(25, 337, 176, 27);
		frame.getContentPane().add(txtUname);
		txtUname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(15, 299, 104, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(20, 375, 99, 27);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel Admin = new JLabel("Admin");
		Admin.setBounds(223, 120, 182, 46);//-128,31
		Admin.setForeground(Color.DARK_GRAY);
		Admin.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 36));
		frame.getContentPane().add(Admin);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon(GUI.class.getResource("/images/41.png")));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=txtUname.getText();
				String password=Pass.getText();
				if(userName.contains("Admin") && password.contains("Cafe"))
				{
					//JOptionPane.showConfirmDialog(btnNewButton, "Success");
					AdminGui adminGui=new AdminGui();
					//		XXX			XXX
					StringBuilder itemsInMenu = new StringBuilder();
					StringBuilder itemPrice = new StringBuilder();
			        for (Map.Entry<String, Integer> crtEntry : menu.mItem.entrySet())
			        {
			            String name = crtEntry.getKey();
			            int price = crtEntry.getValue();
			            itemsInMenu.append(name).append(")\n");
			            itemPrice.append(price).append("\n");
			        }
			        System.out.println(itemPrice);
			        adminGui.setItems(itemsInMenu.toString(), itemPrice.toString());
			        
			        
			        
			        
					
					
					//	XXX			XXX
					
					adminGui.setLocationRelativeTo(null);
					adminGui.setVisible(true);
					frame.dispose();
					
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Credentials","Try Again",JOptionPane.ERROR_MESSAGE);
					txtUname.setText(null);;
					Pass.setText(null);
				}
				
				
			}
		});
		btnNewButton.setBounds(269, 404, 137, 38);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(GUI.class.getResource("/images/gb.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main Entry=new Main();
				Entry.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(0, 433, 33, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/images/bkgrnd.png")));
		lblNewLabel.setBounds(0, 30, 577, 490);
		frame.getContentPane().add(lblNewLabel);
	}
}
