package com.vo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BuilderTest2 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderTest2 frame = new BuilderTest2();
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
	public BuilderTest2() {
		setResizable(false);
		setTitle("전산관리 시스템");
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 428);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Jm_Menu = new JMenu("메뉴");
		menuBar.add(Jm_Menu);
		
		JMenuItem menu_ServerON = new JMenuItem("서버 연동");
		menu_ServerON.setSelected(true);
		Jm_Menu.add(menu_ServerON);
		
		JMenuItem menu_Exit = new JMenuItem("종료");
		menu_Exit.setSelected(true);
		Jm_Menu.add(menu_Exit);
		
		JMenu Basic_management = new JMenu("기초관리");
		menuBar.add(Basic_management);
		
		JMenuItem Basic_CustomerManagement = new JMenuItem("거래처관리");
		Basic_management.add(Basic_CustomerManagement);
		
		JMenuItem Basic_ProductManagement = new JMenuItem("제품관리");
		Basic_management.add(Basic_ProductManagement);
		
		JMenuItem Basic_MarketManagement = new JMenuItem("마켓관리");
		Basic_management.add(Basic_MarketManagement);
		
		JMenuItem Basic_StorageManagement = new JMenuItem("창고관리");
		Basic_management.add(Basic_StorageManagement);
		
		JMenuItem Basic_EmployeeManagement = new JMenuItem("직원관리");
		Basic_management.add(Basic_EmployeeManagement);
		
		JMenu orderManagement = new JMenu("주문관리");
		menuBar.add(orderManagement);
		
		JMenuItem oder_OrderListManagement = new JMenuItem("발주관리");
		orderManagement.add(oder_OrderListManagement);
		
		JMenuItem order_BuyManagement = new JMenuItem("매입관리");
		orderManagement.add(order_BuyManagement);
		
		JMenuItem oder_StockManagement = new JMenuItem("재고관리");
		orderManagement.add(oder_StockManagement);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(BuilderTest2.class.getResource("/com/vo/600x428.jpg")));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
