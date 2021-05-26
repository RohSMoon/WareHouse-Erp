package Customer_Management;

import java.awt.EventQueue;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class CustomerManagerView extends JDialog implements ItemListener {

//선언부
		////////////////////////프레임////////////////////////////
		private JDialog 		dialog                         = null;
		/////////////////////////텍스트필드/////////////////////////
	
		
		public JTextField 	cs_IssuanceNumberTextField   	 = null;
		public JTextField 	cs_CustomerNameTextField       	 = null;
		public JTextField 	cs_NameOfRepresentativeTextField = null;
		public JTextField 	cs_BusinRegNumTextField   	 	 = null;
		public JTextField 	cs_BusinTypeTextField      	 	 = null;
		public JTextField 	cs_BusinItemTextField       	 = null;
		public JTextField	cs_PostcodeTextField    	     = null;
		public JTextField	cs_AddressTextField              = null;
		public JTextField 	cs_DetailAddressTextField        = null;
		public JTextField 	cs_EmailTextField                = null;
		public JTextField 	cs_TelTextField                  = null;
		public JTextField 	cs_HPTextField                   = null;
		public JTextField 	cs_FaxTextField                  = null;
		public JTextField 	cs_CustomerNameToBillTextField   = null;
		public JTextField 	cs_BankNameTextField             = null;
		public JTextField	cs_AccountHolderTextField        = null;
		public JTextField 	cs_AccountNumberTextField        = null;
		public JTextField 	cs_RegiDateTextField             = null;
		public JTextField 	cs_CloseDateTextField            = null;
		public JTextField 	cs_MemoTextField                 = null;
//ARREARS 미불금 //CLASS 거래처 대리점 대형차 입출금장부 // CustomerName DC 고객당 할인율//MANAGER 담당자// MANAGER MAIL/MANAGERHP
//MULTYPRICE 다중단가 // PaymentDay 결제일//POINT 포인트 // Receviable 미수금//STAFF 담당직원// 
		////////////////////////라벨//////////////////////////////
		
		  JLabel 		cs_BusinType                  = null;
		  JLabel 		cs_SaleType                   = null;
		  JLabel 		cs_Memo                   	  = null;
		  JLabel 		cs_IssuanceNumber			  = null;
		  JLabel 		cs_CompanyName				  = null;
		  JLabel 		cs_NameOfRepresentative		  = null;
		  JLabel 		cs_BusinRegNum 				  = null;
		  JLabel 		cs_AddressCode 				  = null;
		  JLabel 		cs_BusinItem                  = null;
		  JLabel 		cs_Address                    = null;
		  JLabel 		cs_DetailAddress              = null;
		  JLabel 		cs_Email                      = null;
		  JLabel 		cs_Tel                        = null;
		  JLabel 		cs_MobileNum                  = null;
		  JLabel		cs_Fax                        = null;
		  JLabel 		cs_CustomerNameToBill         = null;
		  JLabel 		cs_BankName                   = null;
		  JLabel 		cs_AccountHolder              = null;
		  JLabel 		cs_AccountNumber              = null;
		  JLabel 		cs_RegiDate                   = null;
		  JLabel 		cs_CloseDate                  = null;
		////////////////////////버튼//////////////////////////////
		public JButton 	cs_Insert                     = null;
		public JButton 	cs_update 		              = null;
		public JButton 	cs_AddressCodeFinder          = null;
		public JButton 	cs_Close                      = null;
		//////////////////////콤보박스/////////////////////////////
		JComboBox 	cs_SaleTypeComboBox       		  = null;
		String		cs_SaleTypeComboBoxTop			  = null;
		String		cs_SaleType_Default[]  = {"구분","매출처","매입처",
											  "매입매출","경비","기타"};
		
		CustomerManagerView 	cmv 			 	  = null;
		CustomerManagerViewEventHandler 	cmvEH	  = null;
		
		
		/**
		 * Create the application.
		 */
//생성자		
		public CustomerManagerView() {
			//this.emvEH = new CustomerManagerViewEventHandler();
			cmvEH = new CustomerManagerViewEventHandler(this);
			//cmvEH = new CustomerManagerViewEventHandler();
			//CustomerManagerView 	cmv 			 	  = null;
			//cmv = new CustomerManagerView();
			Em_initDisplay();
			
			System.out.println("CMV에서 -----cmvEH  ============== :::"+cmvEH);
		}
		/*
		public CustomerManagerView() {
		
		}*/
		/**
		 * Em_initDisplay the contents of the dialog.
		 */
		public void Em_initDisplay() {
			JDialog.setDefaultLookAndFeelDecorated(true);
			dialog = new JDialog();
			//dialog.setAlwaysOnTop(true);
			dialog.setTitle("거래처 관리");
			//dialog.setType(Type.POPUP);
			dialog.setBounds(100, 100, 647, 433);
			dialog.getContentPane().setLayout(null);

			
			cs_IssuanceNumber = new JLabel("거래처 관리코드");
			cs_IssuanceNumber.setHorizontalAlignment(SwingConstants.CENTER);
			cs_IssuanceNumber.setBounds(21, 40, 100, 20);
			dialog.getContentPane().add(cs_IssuanceNumber);
			
			cs_IssuanceNumberTextField = new JTextField();
			cs_IssuanceNumberTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_IssuanceNumberTextField.setBounds(121, 40, 100, 20);
			cs_IssuanceNumberTextField.setToolTipText("거래처관리코드");
			dialog.getContentPane().add(cs_IssuanceNumberTextField);
			cs_IssuanceNumberTextField.setColumns(10);
			
			cs_CompanyName = new JLabel("거래처 상호명");
			cs_CompanyName.setHorizontalAlignment(SwingConstants.CENTER);
			cs_CompanyName.setBounds(221, 40, 100, 20);
			dialog.getContentPane().add(cs_CompanyName);
			
			cs_CustomerNameTextField = new JTextField();
			cs_CustomerNameTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_CustomerNameTextField.setBounds(316, 40, 120, 20);
			dialog.getContentPane().add(cs_CustomerNameTextField);
			cs_CustomerNameTextField.setColumns(10);
			
			cs_NameOfRepresentative = new JLabel("대표이름");
			cs_NameOfRepresentative.setHorizontalAlignment(SwingConstants.CENTER);
			cs_NameOfRepresentative.setBounds(446, 40, 60, 20);
			dialog.getContentPane().add(cs_NameOfRepresentative);
			
			cs_NameOfRepresentativeTextField = new JTextField();
			cs_NameOfRepresentativeTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_NameOfRepresentativeTextField.setBounds(511, 40, 100, 20);
			dialog.getContentPane().add(cs_NameOfRepresentativeTextField);
			cs_NameOfRepresentativeTextField.setColumns(10);
			
			cs_BusinRegNum = new JLabel("사업자 번호");
			cs_BusinRegNum.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BusinRegNum.setBounds(21, 70, 100, 20);
			dialog.getContentPane().add(cs_BusinRegNum);
			
			cs_BusinRegNumTextField = new JTextField();
			cs_BusinRegNumTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BusinRegNumTextField.setBounds(121, 70, 125, 20);
			dialog.getContentPane().add(cs_BusinRegNumTextField);
			cs_BusinRegNumTextField.setColumns(10);
			
			cs_BusinType = new JLabel("업  태");
			cs_BusinType.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BusinType.setBounds(256, 70, 50, 20);
			dialog.getContentPane().add(cs_BusinType);
			
			cs_BusinTypeTextField = new JTextField();
			cs_BusinTypeTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BusinTypeTextField.setBounds(316, 70, 100, 20);
			dialog.getContentPane().add(cs_BusinTypeTextField);
			cs_BusinTypeTextField.setColumns(10);
			
			cs_BusinItem = new JLabel("업  종");
			cs_BusinItem.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BusinItem.setBounds(431, 70, 50, 20);
			dialog.getContentPane().add(cs_BusinItem);
			
			cs_BusinItemTextField = new JTextField();
			cs_BusinItemTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BusinItemTextField.setBounds(491, 70, 100, 20);
			dialog.getContentPane().add(cs_BusinItemTextField);
			cs_BusinItemTextField.setColumns(10);
			
			cs_AddressCode = new JLabel("우편번호");
			cs_AddressCode.setHorizontalAlignment(SwingConstants.CENTER);
			cs_AddressCode.setBounds(36, 100, 100, 20);
			dialog.getContentPane().add(cs_AddressCode);
			
			cs_PostcodeTextField = new JTextField();
			cs_PostcodeTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_PostcodeTextField.setBounds(131, 100, 90, 20);
			dialog.getContentPane().add(cs_PostcodeTextField);
			cs_PostcodeTextField.setColumns(10);
			
			cs_AddressCodeFinder = new JButton("조    회");
			cs_AddressCodeFinder.setBounds(236, 100, 95, 20);
			dialog.getContentPane().add(cs_AddressCodeFinder);
			
			cs_Address = new JLabel("주    소");
			cs_Address.setHorizontalAlignment(SwingConstants.CENTER);
			cs_Address.setBounds(46, 130, 70, 20);
			dialog.getContentPane().add(cs_Address);
			
			cs_AddressTextField = new JTextField();
			cs_AddressTextField.setBounds(121, 130, 350, 20);
			dialog.getContentPane().add(cs_AddressTextField);
			cs_AddressTextField.setColumns(10);
			
			cs_DetailAddress = new JLabel("상세주소");
			cs_DetailAddress.setHorizontalAlignment(SwingConstants.CENTER);
			cs_DetailAddress.setBounds(41, 160, 90, 20);
			dialog.getContentPane().add(cs_DetailAddress);
			
			cs_DetailAddressTextField = new JTextField();
			cs_DetailAddressTextField.setBounds(121, 160, 350, 20);
			dialog.getContentPane().add(cs_DetailAddressTextField);
			cs_DetailAddressTextField.setColumns(10);
			
			cs_Email = new JLabel("이메일");
			cs_Email.setHorizontalAlignment(SwingConstants.CENTER);
			cs_Email.setBounds(21, 190, 50, 20);
			dialog.getContentPane().add(cs_Email);
			
			cs_EmailTextField = new JTextField();
			cs_EmailTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_EmailTextField.setBounds(71, 190, 185, 20);
			dialog.getContentPane().add(cs_EmailTextField);
			cs_EmailTextField.setColumns(10);
			
			cs_Tel = new JLabel("전  화");
			cs_Tel.setHorizontalAlignment(SwingConstants.CENTER);
			cs_Tel.setBounds(266, 190, 50, 20);
			dialog.getContentPane().add(cs_Tel);
			
			cs_TelTextField = new JTextField();
			cs_TelTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_TelTextField.setBounds(321, 190, 110, 20);
			dialog.getContentPane().add(cs_TelTextField);
			cs_TelTextField.setColumns(10);
			
			cs_MobileNum = new JLabel("휴대폰");
			cs_MobileNum.setHorizontalAlignment(SwingConstants.CENTER);
			cs_MobileNum.setBounds(441, 190, 50, 20);
			dialog.getContentPane().add(cs_MobileNum);
			
			cs_HPTextField = new JTextField();
			cs_HPTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_HPTextField.setBounds(496, 190, 120, 20);
			dialog.getContentPane().add(cs_HPTextField);
			cs_HPTextField.setColumns(10);
			
			cs_Fax = new JLabel("FAX");
			cs_Fax.setHorizontalAlignment(SwingConstants.CENTER);
			cs_Fax.setBounds(351, 100, 50, 20);
			dialog.getContentPane().add(cs_Fax);
			
			cs_FaxTextField = new JTextField();
			cs_FaxTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_FaxTextField.setBounds(401, 100, 130, 20);
			dialog.getContentPane().add(cs_FaxTextField);
			cs_FaxTextField.setColumns(10);
			
			cs_CustomerNameToBill = new JLabel("계산서 발행용 상호");
			cs_CustomerNameToBill.setHorizontalAlignment(SwingConstants.CENTER);
			cs_CustomerNameToBill.setBounds(21, 220, 110, 20);
			dialog.getContentPane().add(cs_CustomerNameToBill);
			
			cs_CustomerNameToBillTextField = new JTextField();
			cs_CustomerNameToBillTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_CustomerNameToBillTextField.setBounds(136, 220, 120, 20);
			dialog.getContentPane().add(cs_CustomerNameToBillTextField);
			cs_CustomerNameToBillTextField.setColumns(10);
			
			cs_BankName = new JLabel("입금은행");
			cs_BankName.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BankName.setBounds(26, 250, 100, 20);
			dialog.getContentPane().add(cs_BankName);
			
			cs_BankNameTextField = new JTextField();
			cs_BankNameTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_BankNameTextField.setBounds(106, 250, 110, 20);
			dialog.getContentPane().add(cs_BankNameTextField);
			cs_BankNameTextField.setColumns(10);
			
			cs_AccountHolder = new JLabel("계좌주");
			cs_AccountHolder.setHorizontalAlignment(SwingConstants.CENTER);
			cs_AccountHolder.setBounds(211, 250, 70, 20);
			dialog.getContentPane().add(cs_AccountHolder);
			
			cs_AccountHolderTextField = new JTextField();
			cs_AccountHolderTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_AccountHolderTextField.setBounds(276, 250, 100, 20);
			dialog.getContentPane().add(cs_AccountHolderTextField);
			cs_AccountHolderTextField.setColumns(10);
			
			cs_AccountNumber = new JLabel("계좌번호");
			cs_AccountNumber.setHorizontalAlignment(SwingConstants.CENTER);
			cs_AccountNumber.setBounds(361, 250, 100, 20);
			dialog.getContentPane().add(cs_AccountNumber);
			
			cs_AccountNumberTextField = new JTextField();
			cs_AccountNumberTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_AccountNumberTextField.setBounds(446, 250, 150, 20);
			dialog.getContentPane().add(cs_AccountNumberTextField);
			cs_AccountNumberTextField.setColumns(10);
			
			cs_RegiDate = new JLabel("등록일");
			cs_RegiDate.setHorizontalAlignment(SwingConstants.CENTER);
			cs_RegiDate.setBounds(31, 280, 100, 20);
			dialog.getContentPane().add(cs_RegiDate);
			
			cs_RegiDateTextField = new JTextField();
			cs_RegiDateTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_RegiDateTextField.setBounds(116, 280, 120, 20);
			dialog.getContentPane().add(cs_RegiDateTextField);
			cs_RegiDateTextField.setColumns(10);
			
			cs_CloseDate = new JLabel("폐기일");
			cs_CloseDate.setHorizontalAlignment(SwingConstants.CENTER);
			cs_CloseDate.setBounds(221, 280, 100, 20);
			dialog.getContentPane().add(cs_CloseDate);
			
			cs_CloseDateTextField = new JTextField();
			cs_CloseDateTextField.setHorizontalAlignment(SwingConstants.CENTER);
			cs_CloseDateTextField.setBounds(296, 280, 120, 20);
			dialog.getContentPane().add(cs_CloseDateTextField);
			cs_CloseDateTextField.setColumns(10);
			
			cs_SaleType = new JLabel("거래처 분류");
			cs_SaleType.setHorizontalAlignment(SwingConstants.CENTER);
			cs_SaleType.setBounds(21, 10, 100, 20);
			dialog.getContentPane().add(cs_SaleType);
			
			cs_SaleTypeComboBox = new JComboBox(cs_SaleType_Default);
			cs_SaleTypeComboBox.setBounds(121, 10, 100, 23);
			dialog.getContentPane().add(cs_SaleTypeComboBox);
			
			cs_Memo = new JLabel("메모");
			cs_Memo.setHorizontalAlignment(SwingConstants.CENTER);
			cs_Memo.setBounds(12, 310, 52, 20);
			dialog.getContentPane().add(cs_Memo);
			
			cs_MemoTextField = new JTextField();
			cs_MemoTextField.setBounds(60, 310, 520, 20);
			dialog.getContentPane().add(cs_MemoTextField);
			cs_MemoTextField.setColumns(10);
			
			cs_Insert = new JButton("입력");
			cs_Insert.setBounds(83, 352, 100, 20);
			dialog.getContentPane().add(cs_Insert);
			cs_Insert.addActionListener(cmvEH);
			
			cs_update = new JButton("수정");
			cs_update.setBounds(266, 352, 100, 20);
			dialog.getContentPane().add(cs_update);
			
			cs_Close = new JButton("닫기");
			cs_Close.setBounds(449, 351, 100, 20);
			dialog.getContentPane().add(cs_Close);
			System.out.println("cmv 에서 cmveh  리스너 이전  :   "+cmvEH);
			System.out.println("cmv 에서 cmv    리스너 이전 :   "+cmv);
			cs_Close.addActionListener(cmvEH);
			
			System.out.println("cmv 에서 cmveh    :   "+cmvEH);
			System.out.println("cmv 에서 cmv     :    "+cmv);
			
			dialog.setVisible(true);
		}

	//////콤보박스 반응로///////////콤보박스 반응로///////////
		@Override
		public void itemStateChanged(ItemEvent ie) {
			Object obj = ie.getSource();
			
			if (obj == cs_SaleTypeComboBox) {
			if(ie.getStateChange()== ItemEvent.SELECTED) {
				cs_SaleTypeComboBoxTop = cs_SaleType_Default
						[cs_SaleTypeComboBox.getSelectedIndex()];
				}
			cs_SaleTypeComboBox.removeAllItems();
			}
			CustomerManagerVO tests = new CustomerManagerVO();
			tests.getO1();
			tests.setO1(null);
		}
		
		/***************************************
		 * Launch the application.
		 **************************************/		
		
		/*
		public static void main(String[] args) {
			CustomerManagerView cmv = new CustomerManagerView();
		
		
		}
		*/
/**
 * Launch the application.
 */
/*public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				CustomerManagerView window = new CustomerManagerView();
				window.dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}*/
	
}
