package gUIs;
import pkg.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pkg.Cart;
import pkg.Checkout;
import pkg.Menu;

import javax.swing.JLabel;
import javax.naming.PartialResultException;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Umenu extends JFrame {
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	Menu M=new Menu();
	Cart C=new Cart(M);
	
	
	private final JPanel panel_1 = new JPanel();
	private JLabel displa;
	private JLabel lblNewLabel;
	private JLabel L12;
	private JLabel L11;
	private JLabel L10;
	private JLabel L9;
	private JLabel L8;
	private JLabel L7;
	private JLabel L6;
	private JLabel L5;
	private JLabel L4;
	private JLabel L3;
	private JLabel L2;
	private JLabel L1;
	private JLabel sPanel;
	private JButton P1;
	private JButton P5;
	private JButton P9;
	private JButton P10;
	private JButton P6;
	private JButton P2;
	private JButton P3;
	private JButton P4;
	private JButton P8;
	private JButton P7;
	private JButton P11;
	private JButton P12;
	private JButton P1_1;
	private JButton P1_2;
	private JButton P1_3;
	private JButton P1_4;
	private JButton P1_5;
	private JButton P1_6;
	private JButton P1_7;
	private JButton P1_8;
	private JButton P1_9;
	private JButton P1_10;
	private JButton P1_11;
	private JButton P1_12;
	private JTextField Am1;
	private JTextField Am2;
	private JTextField Am3;
	private JTextField Am4;
	private JTextField Am5;
	private JTextField Am6;
	private JTextField Am7;
	private JTextField Am8;
	private JTextField Am9;
	private JTextField Am10;
	private JTextField Am11;
	private JTextField Am12;
	private JTextField priceOutput;
	private JLabel WildWest;

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Umenu frame = new Umenu();					

					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//				XXX		Methods		XXX
	
//	public int AfterDisc(int tPrice)
//	{
//		//promotional code
//		System.out.println("accessed: "+userpromo.getText()+" price: "+C.totalPrice());
////		Totalprice.setText(Integer.toString(C.Discout(Integer.valueOf(userpromo.getText()))));
//		Totalprice.setText(Integer.toString(C.Discout(userpromo.getText())));
//		
//		/*
//		 * Add another feature to let the user know if promo was invalid by checking if
//		 * the returned value is as the original, if so then promocode invalid
//		 */
//		return 0;
//	}
	
	
	
	
	/**
	 * Create the frame.
	 */
	public Umenu() {
		setResizable(false);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 803);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(624, 0, 235, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cart :");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 416, 107, 52);
		panel.add(lblNewLabel_1);

		priceOutput = new JTextField();
		priceOutput.setHorizontalAlignment(SwingConstants.LEFT);
		//priceOutput.setText("1000");
		priceOutput.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		priceOutput.setForeground(new Color(0, 0, 0));
		priceOutput.setEditable(false);
		priceOutput.setBounds(93, 431, 110, 30);
		panel.add(priceOutput);
		priceOutput.setColumns(10);
		priceOutput.setOpaque(false);
		//priceOutput.setBorder(null);
		
		WildWest = new JLabel("New label");
		WildWest.setIcon(new ImageIcon(Umenu.class.getResource("/images/WildWest.png")));
		WildWest.setBounds(0, 96, 236, 109);
		panel.add(WildWest);
		
		JButton ChkOut = new JButton("Check Out");
		ChkOut.setHorizontalAlignment(SwingConstants.LEFT);
		ChkOut.setForeground(SystemColor.desktop);
		ChkOut.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		        Checkout ckout = new Checkout();
		        
		        System.out.println("Sol");

		        StringBuilder itemsInCart = new StringBuilder();
		        for (Map.Entry<String, Integer> crtEntry : C.cItems.entrySet())
		        {
		            String name = crtEntry.getKey();
		            int quantity = crtEntry.getValue();
		            itemsInCart.append(name).append(" (").append(quantity).append(")\n");
		            
		        }
		        
		        StringBuilder priceOfItems = new StringBuilder();
		        System.out.println("Solol");
		        for (Map.Entry<String, Integer> crtEntry : C.cItems.entrySet()) 
				{
					String name=crtEntry.getKey();
					int item=C.menu.getPrice(name);
					//int itemcost=C.menu.getPrice(name);//using Menu's Obj we get the prices of diff item
					priceOfItems.append(item).append("\n");
					
				}
		        
		        
		        ckout.setItemsInCart(itemsInCart.toString(),priceOfItems.toString(),Integer.toString(C.totalPrice()));
		        ckout.assignCart(C);
		        ckout.setLocationRelativeTo(null); // Center the frame on the screen
		        ckout.setVisible(true);
		        dispose();
		    }
		});
		ChkOut.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		ChkOut.setBounds(104, 544, 121, 38);	
		ChkOut.setBorder(null);
		panel.add(ChkOut);
		
		JButton PrevDispl = new JButton("");
		PrevDispl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main Prev=new Main();
				Prev.main(null);
				dispose();
			}
		});
		PrevDispl.setIcon(new ImageIcon(Umenu.class.getResource("/images/gb.jpg")));
		PrevDispl.setBounds(0, 662, 33, 27);
		panel.add(PrevDispl);
		
		sPanel = new JLabel("");
		sPanel.setIcon(new ImageIcon(Umenu.class.getResource("/images/sdpnl.jpg")));
		sPanel.setBounds(0, 0, 235, 700);
		panel.add(sPanel);
			
			
		panel_1.setBounds(0, 0, 625, 700);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Am1 = new JTextField();
		Am1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am1.setForeground(new Color(0, 0, 0));
		Am1.setHorizontalAlignment(SwingConstants.CENTER);
		Am1.setEditable(false);
		Am1.setColumns(10);
		Am1.setBounds(41, 147, 44, 27);
		panel_1.add(Am1);
		
		Am2 = new JTextField();
		Am2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am2.setForeground(new Color(0, 0, 0));
		Am2.setHorizontalAlignment(SwingConstants.CENTER);
		Am2.setEditable(false);
		Am2.setColumns(10);
		Am2.setBounds(202, 146, 44, 27);
		panel_1.add(Am2);
		
		Am3 = new JTextField();
		Am3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am3.setForeground(new Color(0, 0, 0));
		Am3.setHorizontalAlignment(SwingConstants.CENTER);
		Am3.setEditable(false);
		Am3.setColumns(10);
		Am3.setBounds(360, 146, 44, 27);
		panel_1.add(Am3);
		
		Am4 = new JTextField();
		Am4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am4.setForeground(new Color(0, 0, 0));
		Am4.setHorizontalAlignment(SwingConstants.CENTER);
		Am4.setEditable(false);
		Am4.setColumns(10);
		Am4.setBounds(512, 146, 44, 27);
		panel_1.add(Am4);
		
		Am5 = new JTextField();
		Am5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am5.setForeground(new Color(0, 0, 0));
		Am5.setHorizontalAlignment(SwingConstants.CENTER);
		Am5.setEditable(false);
		Am5.setColumns(10);
		Am5.setBounds(41, 393, 44, 27);
		panel_1.add(Am5);
		
		Am6 = new JTextField();
		Am6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am6.setForeground(new Color(0, 0, 0));
		Am6.setHorizontalAlignment(SwingConstants.CENTER);
		Am6.setEditable(false);
		Am6.setColumns(10);
		Am6.setBounds(202, 393, 44, 27);
		panel_1.add(Am6);
		
		Am7 = new JTextField();
		Am7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am7.setForeground(new Color(0, 0, 0));
		Am7.setHorizontalAlignment(SwingConstants.CENTER);
		Am7.setEditable(false);
		Am7.setColumns(10);
		Am7.setBounds(360, 393, 44, 27);
		panel_1.add(Am7);
		
		Am8 = new JTextField();
		Am8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am8.setForeground(new Color(0, 0, 0));
		Am8.setHorizontalAlignment(SwingConstants.CENTER);
		Am8.setEditable(false);
		Am8.setColumns(10);
		Am8.setBounds(512, 393, 44, 27);
		panel_1.add(Am8);
		
		Am9 = new JTextField();
		Am9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am9.setForeground(new Color(0, 0, 0));
		Am9.setHorizontalAlignment(SwingConstants.CENTER);
		Am9.setEditable(false);
		Am9.setColumns(10);
		Am9.setBounds(41, 637, 44, 27);
		panel_1.add(Am9);
		
		Am10 = new JTextField();
		Am10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am10.setForeground(new Color(0, 0, 0));
		Am10.setHorizontalAlignment(SwingConstants.CENTER);
		Am10.setEditable(false);
		Am10.setColumns(10);
		Am10.setBounds(202, 637, 44, 27);
		panel_1.add(Am10);
		
		Am11 = new JTextField();
		Am11.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am11.setForeground(new Color(0, 0, 0));
		Am11.setHorizontalAlignment(SwingConstants.CENTER);
		Am11.setEditable(false);
		Am11.setColumns(10);
		Am11.setBounds(360, 637, 44, 27);
		panel_1.add(Am11);
		
		Am12 = new JTextField();
		Am12.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Am12.setForeground(new Color(0, 0, 0));
		Am12.setHorizontalAlignment(SwingConstants.CENTER);
		Am12.setEditable(false);
		Am12.setColumns(10);
		Am12.setBounds(512, 637, 44, 27);
		panel_1.add(Am12);
		
		L1 = new JLabel("New Label");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setForeground(Color.WHITE);
		L1.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/1.png")));
		L1.setBounds(0, 0, 150, 135);
		panel_1.add(L1);
		
		L2 = new JLabel("New label");
		L2.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/2.png")));
		L2.setHorizontalAlignment(SwingConstants.CENTER);
		L2.setForeground(Color.WHITE);
		L2.setBounds(160, 0,150, 135);
		panel_1.add(L2);
		
		L3 = new JLabel("New label");
		L3.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/3.png")));
		L3.setHorizontalAlignment(SwingConstants.CENTER);
		L3.setForeground(Color.WHITE);
		L3.setBounds(315, 0,150, 135);
		panel_1.add(L3);
		
		L4 = new JLabel("New label");
		L4.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/4.png")));
		L4.setHorizontalAlignment(SwingConstants.CENTER);
		L4.setForeground(Color.WHITE);
		L4.setBounds(465, 0, 150, 135);
		panel_1.add(L4);
		
		L5 = new JLabel("New label");
		L5.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/5.png")));
		L5.setHorizontalAlignment(SwingConstants.CENTER);
		L5.setForeground(Color.WHITE);
		L5.setBounds(0, 247, 150, 135);
		panel_1.add(L5);
		
		L6 = new JLabel("New label");
		L6.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/6.png")));
		L6.setHorizontalAlignment(SwingConstants.CENTER);
		L6.setForeground(Color.WHITE);
		L6.setBounds(160, 247, 150, 135);
		panel_1.add(L6);
		
		L7 = new JLabel("New label");
		L7.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/7.png")));
		L7.setHorizontalAlignment(SwingConstants.CENTER);
		L7.setForeground(Color.WHITE);
		L7.setBounds(315, 247, 150, 135);
		panel_1.add(L7);
		
		L8 = new JLabel("New label");
		L8.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/8.png")));
		L8.setHorizontalAlignment(SwingConstants.CENTER);
		L8.setForeground(Color.WHITE);
		L8.setBounds(465, 247, 150, 135);
		panel_1.add(L8);
		
		L9 = new JLabel("New label");
		L9.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/a.png")));
		L9.setHorizontalAlignment(SwingConstants.CENTER);
		L9.setForeground(Color.WHITE);
		L9.setBounds(0, 491, 150, 135);
		panel_1.add(L9);
		
		L10 = new JLabel("New label");
		L10.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/a.png")));
		L10.setHorizontalAlignment(SwingConstants.CENTER);
		L10.setForeground(Color.WHITE);
		L10.setBounds(160, 491, 150, 135);
		panel_1.add(L10);
		
		L11 = new JLabel("New label");
		L11.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/w2.png")));
		L11.setHorizontalAlignment(SwingConstants.CENTER);
		L11.setForeground(Color.WHITE);
		L11.setBounds(315, 491, 150, 135);
		panel_1.add(L11);
		
		L12 = new JLabel("New label");
		L12.setIcon(new ImageIcon(Umenu.class.getResource("/burgers/11bqs.png")));
		L12.setHorizontalAlignment(SwingConstants.CENTER);
		L12.setForeground(Color.WHITE);
		L12.setBounds(475, 491, 150, 135);
		panel_1.add(L12);
		
		P1 = new JButton("");
		P1.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String C1="C1";				
				C.IncrementQuantity(C1);
				Am1.setText(Integer.toString(C.C_itemQuantity(C1)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
				
			}
		});
		P1.setBounds(89, 146, 27, 27);//+11,+9
		panel_1.add(P1);
		
		P2 = new JButton("");
		P2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C2="C2";
				C.IncrementQuantity(C2);
				Am2.setText(Integer.toString(C.C_itemQuantity(C2)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P2.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P2.setBounds(250, 146, 27, 27);//171
		panel_1.add(P2);

		P3 = new JButton("");
		P3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C3="C3";
				C.IncrementQuantity(C3);
				Am3.setText(Integer.toString(C.C_itemQuantity(C3)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P3.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P3.setBounds(408, 146, 27, 27);//329
		panel_1.add(P3);
		
		P4 = new JButton("");
		P4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C4="C4";
				C.IncrementQuantity(C4);
				Am4.setText(Integer.toString(C.C_itemQuantity(C4)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P4.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P4.setBounds(560, 146, 27, 27);//481
		panel_1.add(P4);
		
		P5 = new JButton("");
		P5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C5="C5";
				C.IncrementQuantity(C5);
				Am5.setText(Integer.toString(C.C_itemQuantity(C5)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P5.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P5.setBounds(89, 393, 27, 27);//10
		panel_1.add(P5);
				
		P6 = new JButton("");
		P6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C6="C6";
				C.IncrementQuantity(C6);
				Am6.setText(Integer.toString(C.C_itemQuantity(C6)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P6.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P6.setBounds(250, 393, 27, 27);//171
		panel_1.add(P6);
		
		
		P7 = new JButton("");
		P7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C7="C7";
				C.IncrementQuantity(C7);
				Am7.setText(Integer.toString(C.C_itemQuantity(C7)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		
		P7.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P7.setBounds(408, 393, 27, 27);
		panel_1.add(P7);
		
		P8 = new JButton("");
		P8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C8="C8";
				C.IncrementQuantity(C8);
				Am8.setText(Integer.toString(C.C_itemQuantity(C8)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P8.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P8.setBounds(560, 393, 27, 27);
		panel_1.add(P8);
		
		P9 = new JButton("");
		P9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B1="B1";
				C.IncrementQuantity(B1);
				Am9.setText(Integer.toString(C.C_itemQuantity(B1)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P9.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P9.setBounds(89, 637, 27, 27);
		panel_1.add(P9);
		
		P10 = new JButton("");
		P10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B2="B2";
				C.IncrementQuantity(B2);
				Am10.setText(Integer.toString(C.C_itemQuantity(B2)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P10.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P10.setBounds(250, 637, 27, 27);
		panel_1.add(P10);
		
		P11 = new JButton("");
		P11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B3="B3";
				C.IncrementQuantity(B3);
				Am11.setText(Integer.toString(C.C_itemQuantity(B3)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P11.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P11.setBounds(408, 637, 27, 27);
		panel_1.add(P11);
		
		
		P12 = new JButton("");
		P12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B4="B4";
				C.IncrementQuantity(B4);
				Am12.setText(Integer.toString(C.C_itemQuantity(B4)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P12.setIcon(new ImageIcon(Umenu.class.getResource("/images/plosw.png")));
		P12.setBounds(560, 637, 27, 27);
		panel_1.add(P12);
		
		
		
		/*						XXX		MinuS - XXX								*/
		
		P1_1 = new JButton("");
		P1_1.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C1="C1";
				C.DecrementQuantity(C1);
				Am1.setText(Integer.toString(C.C_itemQuantity(C1)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_1.setBounds(10, 146, 27, 27);
		panel_1.add(P1_1);
		
		P1_2 = new JButton("");
		P1_2.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String C2="C2";
			C.DecrementQuantity(C2);
			Am2.setText(Integer.toString(C.C_itemQuantity(C2)));
			priceOutput.setText(Integer.toString(C.totalPrice()));
				
			}
		});
		P1_2.setBounds(171, 146, 27, 27);
		panel_1.add(P1_2);
		
		P1_3 = new JButton("");
		P1_3.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C3="C3";
				C.DecrementQuantity(C3);
				Am3.setText(Integer.toString(C.C_itemQuantity(C3)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_3.setBounds(329, 146, 27, 27);
		panel_1.add(P1_3);
		
		P1_4 = new JButton("");
		P1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C4="C4";
				C.DecrementQuantity(C4);
				Am4.setText(Integer.toString(C.C_itemQuantity(C4)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_4.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_4.setBounds(481, 146, 27, 27);
		panel_1.add(P1_4);
		
		P1_5 = new JButton("");
		P1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C5="C5";
				C.DecrementQuantity(C5);
				Am5.setText(Integer.toString(C.C_itemQuantity(C5)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_5.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_5.setBounds(10, 393, 27, 27);
		panel_1.add(P1_5);
		
		P1_6 = new JButton("");
		P1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C6="C6";
				C.DecrementQuantity(C6);
				Am6.setText(Integer.toString(C.C_itemQuantity(C6)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_6.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_6.setBounds(171, 393, 27, 27);
		panel_1.add(P1_6);
		
		P1_7 = new JButton("");
		P1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C7="C7";
				C.DecrementQuantity(C7);
				Am7.setText(Integer.toString(C.C_itemQuantity(C7)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_7.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_7.setBounds(329, 393, 27, 27);
		panel_1.add(P1_7);
		
		P1_8 = new JButton("");
		P1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C8="C8";
				C.DecrementQuantity(C8);
				Am8.setText(Integer.toString(C.C_itemQuantity(C8)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_8.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_8.setBounds(481, 393, 27, 27);
		panel_1.add(P1_8);
		
		P1_9 = new JButton("");
		P1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B1="B1";
				C.DecrementQuantity(B1);
				Am9.setText(Integer.toString(C.C_itemQuantity(B1)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_9.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_9.setBounds(10, 637, 27, 27);
		panel_1.add(P1_9);
		
		P1_10 = new JButton("");
		P1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B2="B2";
				C.DecrementQuantity(B2);
				Am10.setText(Integer.toString(C.C_itemQuantity(B2)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_10.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_10.setBounds(171, 637, 27, 27);
		panel_1.add(P1_10);
		
		P1_11 = new JButton("");
		P1_11.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B3="B3";
				C.DecrementQuantity(B3);
				Am11.setText(Integer.toString(C.C_itemQuantity(B3)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_11.setBounds(329, 637, 27, 27);
		panel_1.add(P1_11);
		
		P1_12 = new JButton("");
		P1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B4="B4";
				C.DecrementQuantity(B4);
				Am12.setText(Integer.toString(C.C_itemQuantity(B4)));
				priceOutput.setText(Integer.toString(C.totalPrice()));
			}
		});
		P1_12.setIcon(new ImageIcon(Umenu.class.getResource("/images/minus.jpg")));
		P1_12.setBounds(481, 637, 27, 27);
		panel_1.add(P1_12);
		
		
		displa = new JLabel("");
		displa.setIcon(new ImageIcon(Umenu.class.getResource("/images/black.png")));
		displa.setBounds(0, 0, 625, 700);
		panel_1.add(displa);
		
	}
}
