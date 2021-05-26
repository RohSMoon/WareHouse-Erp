package MainLog;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;


public class LogView<DeptVO> extends JFrame {
	
/////////////선언부
	public JFrame			jf							= null;
	public JLabel 			lbl_img 					= null;
	public JMenuBar 		menuBar 					= null;
	public JMenu 			Jm_Menu						= null;
	public JMenu 			Basic_management 			= null;
	public JMenu 			orderManagement 			= null;
	public JMenuItem 		menu_ServerON 				= null;
	public JMenuItem 		menu_Exit 					= null;
	public JMenuItem 		Basic_CustomerManagement 	= null;
	public JMenuItem		Basic_ProductManagement		= null;
	public JMenuItem 		Basic_MarketManagement 		= null;
	public JMenuItem 		Basic_StorageManagement 	= null;
	public JMenuItem 		Basic_EmployeeManagement	= null;
	public JMenuItem 		oder_OrderListManagement 	= null;
	public JMenuItem 		order_BuyManagement 		= null;
	public JMenuItem 		order_StockManagement 		= null;
	LogView 				lgv 						= null;
	LogViewEventHandler 	lgVEH 						= null;
	DeptVO					dVO 						= null;
	 String cols[] = {"CUSTOMERNAME", "HP", "FAX", "ADDRESS", "DETAILADDRESS", "SALETYPE", "BUSINESSTYPE"};
	 String data[][] = new String[0][3];
	 DefaultTableModel    dtm_dept = new DefaultTableModel(data,cols);
	   JTable             jtb_dept = new JTable(dtm_dept);
	   JScrollPane        jsp_dept = new JScrollPane(jtb_dept);
	 /*******************************[[화면출력부]]********************************/
	
	//private static LogView instance;
	
	private LogView() { 

		lgVEH = new LogViewEventHandler(this);
		System.out.println("LOGVIEW 에서 =====lgVEH==== :"+lgVEH);
		System.out.println("");
		InitDisplay();
	}
	/*
	public static synchronized LogView getInstance() {
		if(instance == null) {
			instance = new LogView();
		}
		return instance;
	}*/
	
	
	public void InitDisplay() {
		
		/*******************************[[메뉴바]]********************************/
		
		this.setDefaultLookAndFeelDecorated(true);
		this.menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		/*******************************[[메뉴]]********************************/
		
		this.Jm_Menu = new JMenu("메뉴");
		menuBar.add(Jm_Menu);
		
		this.menu_ServerON = new JMenuItem("서버 연동");
		menu_ServerON.setSelected(true);
		Jm_Menu.add(menu_ServerON);
		menu_ServerON.addActionListener(lgVEH);
		
		this.menu_Exit = new JMenuItem("종료");
		menu_Exit.setSelected(true);
		Jm_Menu.add(menu_Exit);
		menu_Exit.addActionListener(lgVEH);
		
		/******************** ***********[[기초관리]]********************************/
		
		this.Basic_management = new JMenu("기초관리");
		menuBar.add(Basic_management);
		
		this.Basic_CustomerManagement = new JMenuItem("거래처관리");
		Basic_management.add(Basic_CustomerManagement);
		Basic_CustomerManagement.addActionListener(lgVEH);
		System.out.println("lgv에서=======LGVEH ===== :     "+ lgVEH);

		this.Basic_ProductManagement = new JMenuItem("제품관리");
		Basic_management.add(Basic_ProductManagement);
		Basic_ProductManagement.addActionListener(lgVEH);
		
		this.Basic_MarketManagement = new JMenuItem("마켓관리");
		Basic_management.add(Basic_MarketManagement);
		Basic_MarketManagement.addActionListener(lgVEH);
		
		this.Basic_StorageManagement = new JMenuItem("창고관리");
		Basic_management.add(Basic_StorageManagement);
		Basic_StorageManagement.addActionListener(lgVEH);
		
		this.Basic_EmployeeManagement = new JMenuItem("직원관리");
		Basic_management.add(Basic_EmployeeManagement);
		Basic_EmployeeManagement.addActionListener(lgVEH);
		
		/*******************************[[주문관리]]********************************/
		
		this.orderManagement = new JMenu("주문관리");
		menuBar.add(orderManagement);
		
		this.oder_OrderListManagement = new JMenuItem("발주관리");
		orderManagement.add(oder_OrderListManagement);
		oder_OrderListManagement.addActionListener(lgVEH);
		
		this.order_BuyManagement = new JMenuItem("매입관리");
		orderManagement.add(order_BuyManagement);
		order_BuyManagement.addActionListener(lgVEH);
		
		this.order_StockManagement = new JMenuItem("재고관리");
		orderManagement.add(order_StockManagement);
		order_StockManagement.addActionListener(lgVEH);
		
		/*******************************[[중앙패널]]********************************/
		getContentPane().add("Center",jsp_dept);
		/*
		this.lbl_img = new JLabel("중앙패널");
		lbl_img.setForeground(Color.WHITE);
		lbl_img.setBackground(Color.WHITE);
		lbl_img.setIcon(new ImageIcon(LogView.class.getResource("/com/vo/600x428.jpg")));
		getContentPane().add(lbl_img, BorderLayout.CENTER);
		*/
		
		/***************************[[프레임 출력]]************************/
		
		setResizable(false);
		setTitle("전산관리 시스템");
		setBackground(Color.WHITE);
		setBounds(200, 200, 600, 428);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	/*********************************[[메인 메소드]]*********************************/
	
	
	public static void main(String[] args) {
		LogView lgv = new LogView();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogView frame = new LogView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		
	} //// 메인 끝단
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
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
	*/
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public LogView() {
	}
	
	
	// 선언부
	
	/////////
	JFrame		jf				=		null;
	JLabel		imgLbl			= 		null;
	JLabel		jlb_time		=	new JLabel("현재시간");
	JPanel		jp_Center		=	new JPanel();
	JMenuBar 	jbm				=   new JMenuBar();
	//JMenuBar 	jbm;
	/////////////
	JMenu		jm_BasicManage	=	new JMenu("기초관리");
	JMenuItem	jmi_Employee	=	new JMenuItem("직원관리");
	JMenuItem	jmi_Storage	=	new JMenuItem("창고관리");
	JMenuItem	jmi_Client	=	new JMenuItem("거래처관리");
	JMenuItem	jmi_Market	=	new JMenuItem("마켓관리");
	
	String setTi;

	static	LogView	lv		=		null;
	LogViewEventHandler lveh = new LogViewEventHandler(this);
	
	//화면 처리부
	public void initDisplay() {
			jf	=	new	JFrame();
			
			
			jf.setSize(600, 428);
			jf.getContentPane().add("South" ,jlb_time);
			setTitle("전산관리 프로젝트");
			setResizable(false);
			setLocationRelativeTo(null);
			
			
			imgLbl = new JLabel();
			ImageIcon bsImg = new ImageIcon(LogView.class.getResource("/com/vo/600x428.jpg"));
			imgLbl.setIcon(bsImg);
			imgLbl.setBounds(10, 10, 600, 400);
			imgLbl.setHorizontalAlignment(JLabel.CENTER);
			jf.getContentPane().add(imgLbl); 
			///
			jbm.add(jm_BasicManage);
			jm_BasicManage.add(jmi_Employee);
			jm_BasicManage.addSeparator();
			jm_BasicManage.add(jmi_Storage	);
			jm_BasicManage.addSeparator();
			jm_BasicManage.add(jmi_Client	);
			jm_BasicManage.addSeparator();
			jm_BasicManage.add(jmi_Market	);
			
			jmi_Employee.addActionListener(lveh);
			
			
			
			
			
			
			//
			jf.setVisible(true);
			jf.setJMenuBar(jbm);
			
			//add(jp_Center);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getTimer();
			}
	
	
	
	
	//--------------------------------------------
	 public void getTimer() {
		 
		 while (true) {
			 Calendar cl = Calendar.getInstance();
				int hour = cl.get(Calendar.HOUR_OF_DAY);
				int min = cl.get(Calendar.MINUTE);
				int cal = cl.get(Calendar.SECOND);
				setTi = (hour <10 ? "0"+ hour :""+hour)+ ":"
				+min+":"+(cal <10 ? "0"+ cal:""+cal );
				jlb_time.setText(setTi);
				try {
					Thread.sleep(1000);
					repaint();
				} catch (Exception ie) {
				}
		 }
		
	 }
	
	
	
	public static void main(String[] args) {
		lv = new LogView();
		lv.initDisplay();
		
		
	}*/

} ///////////////// 클래스 끝단
