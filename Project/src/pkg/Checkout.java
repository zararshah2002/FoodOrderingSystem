package pkg;
import gUIs.*;
import java.awt.EventQueue;

import javax.swing.border.Border;
import javax.swing.border.AbstractBorder;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JTextArea;

public class Checkout extends JFrame {

	
	
	private JPanel contentPane;
	private JTextField Tf_total;
	private JTextField Tf_Promo;
	
	private JTextArea TA_item;
	private JTextArea TA_Price;
	
	//       		XXX			Methods  			XXX
	
//	public void setItemsInCart(String items) {
//		System.out.println(items);
//        
//            Tf_items.setText(items);
////            System.out.println("cout: " + items);
////        } else {
////            System.out.println("Tf_items is null.");
////        }
//    }
	
	//XXX
	Cart C=new Cart(null);
	Umenu userMenu=new Umenu();
	
	public void assignCart(Cart a) {C=a;}//to link Umenu with Checkout
	
	int tempprice;
	
	public void setItemsInCart(String items,String price,String totalprice) {
		System.out.println("SetCheckoutItems");
		TA_item.setText(items);
		TA_Price.setText(price);
		tempprice=Integer.valueOf(totalprice);
		Tf_total.setText(totalprice);
	}

	

	
	
	
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Checkout frame = new Checkout();
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
	public Checkout() {
		setResizable(false);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 631);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton apply = new JButton("New button");
		apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Tf_total.setText(Integer.toString(C.Discout(Tf_Promo.getText())));
				//1st Gets promo from tField, 2nd Disc_Method of Cart called,3rd converts the returned Val,4th Sets it to Total	
				
				
			}
		});
		apply.setIcon(new ImageIcon(Checkout.class.getResource("/images/cx (1).png")));
		apply.setBounds(291, 521, 104, 31);
		contentPane.add(apply);
		
		JLabel lblNewLabel_1 = new JLabel("Wild West");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(89, 11, 249, 83);
		contentPane.add(lblNewLabel_1);
		
		JLabel L_items = new JLabel("Items");
		L_items.setFont(new Font("Sitka Text", Font.BOLD, 20));
		L_items.setBounds(28, 119, 104, 31);
		contentPane.add(L_items);
		
		JLabel L_Quantity = new JLabel("Price/I");
		L_Quantity.setFont(new Font("Sitka Text", Font.BOLD, 20));
		L_Quantity.setBounds(303, 119, 104, 31);
		contentPane.add(L_Quantity);
		
		JLabel L_Total = new JLabel("Total:");
		L_Total.setFont(new Font("Sitka Text", Font.BOLD, 20));
		L_Total.setBounds(28, 521, 62, 31);
		contentPane.add(L_Total);
		
		
		Tf_total = new JTextField();
		Tf_total.setEditable(false);
		Tf_total.setBounds(89, 526, 96, 20);
		Tf_total.setOpaque(false); // Set the text field to be transparent
		Tf_total.setBorder(null); // Remove the border if needed
		Tf_total.setColumns(10);
		contentPane.add(Tf_total);
		
		JLabel L_items_1 = new JLabel("Promo:");
		L_items_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		L_items_1.setBounds(10, 426, 80, 31);
		contentPane.add(L_items_1);
		
		TA_item = new JTextArea();
		TA_item.setEditable(false);
		TA_item.setBounds(28, 163, 124, 255);
		TA_item.setOpaque(false);
		TA_item.setBorder(null);
		contentPane.add(TA_item);
		
		TA_Price = new JTextArea();
		TA_Price.setEditable(false);
		TA_Price.setBounds(291, 163, 124, 255);
		TA_Price.setOpaque(false);
		TA_Price.setBorder(null);
		contentPane.add(TA_Price);
		
		Tf_Promo = new JTextField();
		Tf_Promo.setBounds(89, 426, 124, 28);
		contentPane.add(Tf_Promo);
		Tf_Promo.setColumns(10);
		//Tf_Promo.setOpaque(false);
		//Tf_Promo.setBorder(null);
				
		
		
		
		JLabel ItemsL = new JLabel("New label");
		ItemsL.setVerticalAlignment(SwingConstants.TOP);
		ItemsL.setIcon(new ImageIcon(Checkout.class.getResource("/images/ReceiptBground.jpg")));
		ItemsL.setBounds(0, 0, 448, 594);
		contentPane.add(ItemsL);
		
		
		
		
		
		
		
		
	}
}

