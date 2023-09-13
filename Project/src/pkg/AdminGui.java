package pkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdminLogin;
	private JTextField txtPanel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tf_additem;
	private JTextField tf_price;
	private JLabel Price;
	private JTextField tf_removeitem;
	private JButton RemButton;
	private JButton btnNewButton_2;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel lblNewLabel;
	private JTextArea Ta_Items;
	private JTextArea Ta_ItemPrice;
	private JButton btnNewButton_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGui frame = new AdminGui();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the Methods.
	 */
	String iName,iPrice;
		public void setItems(String itemsname,String itemprice) {System.out.println(itemsname);
			Ta_Items.setText(itemsname);
			Ta_ItemPrice.setText(itemprice);
			
		}
		
		public void setItem(String itemsname,String itemprice) {System.out.println(itemsname);
		iName=itemsname;iPrice=itemprice;
			Ta_Items.setText(itemsname);			Ta_ItemPrice.setText(itemprice);
		}
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public AdminGui() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(btnNewButton_3, "Are you sure you want to LogOut");
				GUI backGui=new GUI();
				backGui.main(null);
				dispose();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(AdminGui.class.getResource("/images/gb.jpg")));
		btnNewButton_3.setBounds(417, 0, 37, 29);
		contentPane.add(btnNewButton_3);
		
		tf_additem = new JTextField();
		tf_additem.setBounds(254, 173, 118, 20);
		contentPane.add(tf_additem);
		tf_additem.setColumns(10);
		
		txtAdminLogin = new JTextField();
		txtAdminLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		txtAdminLogin.setForeground(new Color(0, 0, 0));
		txtAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdminLogin.setText("Admin");
		txtAdminLogin.setColumns(10);
		txtAdminLogin.setBounds(119, 11, 135, 62);
		txtAdminLogin.setOpaque(false);
		txtAdminLogin.setBorder(null);
		contentPane.add(txtAdminLogin);
		
		txtPanel = new JTextField();
		txtPanel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		txtPanel.setText("Panel");
		txtPanel.setBounds(237, 44, 135, 62);
		txtPanel.setOpaque(false);
		txtPanel.setBorder(null);
		contentPane.add(txtPanel);
		txtPanel.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Items");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel_1.setBounds(0, 106, 73, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton Save = new JButton("SAVE");
		Save.setFont(new Font("Tahoma", Font.BOLD, 15));
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder additemBldr=new StringBuilder();
				StringBuilder addPriceBldr=new StringBuilder();
				additemBldr.append(Ta_Items.getText()).append(tf_additem.getText()).append("\n");
				addPriceBldr.append(Ta_ItemPrice.getText()).append(tf_price.getText()).append("\n");
				
				
				setItem(additemBldr.toString(),addPriceBldr.toString());
				
				tf_additem.setText(null); tf_price.setText(null);
				
			}
		});
		Save.setBounds(298, 270, 89, 23);
		contentPane.add(Save);
		
		lblNewLabel_2 = new JLabel("Add Item");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(242, 141, 113, 21);
		contentPane.add(lblNewLabel_2);
		
		tf_price = new JTextField();
		tf_price.setColumns(10);
		tf_price.setBounds(254, 239, 118, 20);
		contentPane.add(tf_price);
		
		Price = new JLabel("Price");
		Price.setHorizontalAlignment(SwingConstants.CENTER);
		Price.setFont(new Font("Tahoma", Font.ITALIC, 18));
		Price.setBounds(242, 204, 113, 21);
		contentPane.add(Price);
		
		tf_removeitem = new JTextField();
		tf_removeitem.setColumns(10);
		tf_removeitem.setBounds(249, 357, 118, 20);
		contentPane.add(tf_removeitem);
		
		RemButton = new JButton("Remove Item");
		RemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				//tf_removeitem.setText(iName);	
				
			}
		});
		RemButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		RemButton.setBounds(254, 377, 113, 23);
		RemButton.setBorder(null);
		contentPane.add(RemButton);
		
		btnNewButton_2 = new JButton("View Order");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(254, 486, 118, 23);
		btnNewButton_2.setBorder(null);
		contentPane.add(btnNewButton_2);
		
		textArea = new JTextArea();
		textArea.setBounds(225, 525, 89, 127);
		textArea.setOpaque(false);
		//textArea.setBorder(null);
		contentPane.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(339, 525, 89, 127);
		textArea_1.setOpaque(false);
		//textArea_1.setBorder(null);
		contentPane.add(textArea_1);
		
		lblNewLabel = new JLabel("Price");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel.setBounds(101, 106, 73, 29);
		contentPane.add(lblNewLabel);
		
		Ta_Items = new JTextArea();
		Ta_Items.setEditable(false);
		Ta_Items.setBounds(0, 142, 89, 510);
		//Ta_Items.setOpaque(false);
		contentPane.add(Ta_Items);
		
		Ta_ItemPrice = new JTextArea();
		Ta_ItemPrice.setEditable(false);
		Ta_ItemPrice.setBounds(101, 142, 89, 510);
		//Ta_ItemPrice.setOpaque(false);
		contentPane.add(Ta_ItemPrice);
		
		
		JLabel tf_setPrice = new JLabel("New label");
		tf_setPrice.setIcon(new ImageIcon(AdminGui.class.getResource("/images/adminBround (1).jpeg")));
		tf_setPrice.setBounds(0, 0, 454, 652);
		contentPane.add(tf_setPrice);
	}
}
