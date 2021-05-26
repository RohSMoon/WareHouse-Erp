package com.vo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
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
import javax.swing.JComboBox;

public class BuilderTest {

	private JFrame frame;
	private JTextField cs_IssuanceNumberTextField;
	private JTextField cs_CompanyNameTextField;
	private JTextField cs_NameCeoTextField;
	private JTextField cs_BusinRegNumTextField;
	private JLabel cs_BusinType;
	private JTextField cs_BusinTypeTextField;
	private JLabel cs_BusinItem;
	private JTextField cs_BusinItemTextField;
	private JTextField cs_AddressCodetTextField;
	private JTextField cs_AddressTextField;
	private JTextField cs_DetailAddressTextField;
	private JTextField cs_EmailTextField;
	private JTextField cs_TelNumTextField;
	private JTextField cs_MobileNumTextField;
	private JTextField cs_FaxTextField;
	private JTextField cs_NameForInvoiceTextField;
	private JTextField cs_BankNameTextField;
	private JTextField cs_AccountHolderTextField;
	private JTextField cs_AccountNumberTextField;
	private JTextField cs_RegiDateTextField;
	private JTextField cs_CloseDateTextField;
	private JLabel cs_SaleType;
	private JLabel cs_Memo;
	private JTextField cs_MemoTextField;
	private JButton cs_close;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderTest window = new BuilderTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BuilderTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setTitle("거래처 관리");
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 647, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel cs_IssuanceNumber = new JLabel("거래처 관리코드");
		cs_IssuanceNumber.setHorizontalAlignment(SwingConstants.CENTER);
		cs_IssuanceNumber.setBounds(21, 40, 100, 20);
		frame.getContentPane().add(cs_IssuanceNumber);
		
		cs_IssuanceNumberTextField = new JTextField();
		cs_IssuanceNumberTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_IssuanceNumberTextField.setBounds(121, 40, 100, 20);
		cs_IssuanceNumberTextField.setToolTipText("거래처관리코드");
		frame.getContentPane().add(cs_IssuanceNumberTextField);
		cs_IssuanceNumberTextField.setColumns(10);
		
		JLabel cs_CompanyName = new JLabel("거래처 상호명");
		cs_CompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		cs_CompanyName.setBounds(221, 40, 100, 20);
		frame.getContentPane().add(cs_CompanyName);
		
		cs_CompanyNameTextField = new JTextField();
		cs_CompanyNameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_CompanyNameTextField.setBounds(316, 40, 120, 20);
		frame.getContentPane().add(cs_CompanyNameTextField);
		cs_CompanyNameTextField.setColumns(10);
		
		JLabel cs_NameCeo = new JLabel("대표이름");
		cs_NameCeo.setHorizontalAlignment(SwingConstants.CENTER);
		cs_NameCeo.setBounds(446, 40, 60, 20);
		frame.getContentPane().add(cs_NameCeo);
		
		cs_NameCeoTextField = new JTextField();
		cs_NameCeoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_NameCeoTextField.setBounds(511, 40, 100, 20);
		frame.getContentPane().add(cs_NameCeoTextField);
		cs_NameCeoTextField.setColumns(10);
		
		JLabel cs_BusinRegNum = new JLabel("사업자 번호");
		cs_BusinRegNum.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BusinRegNum.setBounds(21, 70, 100, 20);
		frame.getContentPane().add(cs_BusinRegNum);
		
		cs_BusinRegNumTextField = new JTextField();
		cs_BusinRegNumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BusinRegNumTextField.setBounds(121, 70, 125, 20);
		frame.getContentPane().add(cs_BusinRegNumTextField);
		cs_BusinRegNumTextField.setColumns(10);
		
		cs_BusinType = new JLabel("업  태");
		cs_BusinType.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BusinType.setBounds(256, 70, 50, 20);
		frame.getContentPane().add(cs_BusinType);
		
		cs_BusinTypeTextField = new JTextField();
		cs_BusinTypeTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BusinTypeTextField.setBounds(316, 70, 100, 20);
		frame.getContentPane().add(cs_BusinTypeTextField);
		cs_BusinTypeTextField.setColumns(10);
		
		cs_BusinItem = new JLabel("업  종");
		cs_BusinItem.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BusinItem.setBounds(431, 70, 50, 20);
		frame.getContentPane().add(cs_BusinItem);
		
		cs_BusinItemTextField = new JTextField();
		cs_BusinItemTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BusinItemTextField.setBounds(491, 70, 100, 20);
		frame.getContentPane().add(cs_BusinItemTextField);
		cs_BusinItemTextField.setColumns(10);
		
		JLabel cs_AddressCode = new JLabel("우편번호");
		cs_AddressCode.setHorizontalAlignment(SwingConstants.CENTER);
		cs_AddressCode.setBounds(36, 100, 100, 20);
		frame.getContentPane().add(cs_AddressCode);
		
		cs_AddressCodetTextField = new JTextField();
		cs_AddressCodetTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_AddressCodetTextField.setBounds(131, 100, 90, 20);
		frame.getContentPane().add(cs_AddressCodetTextField);
		cs_AddressCodetTextField.setColumns(10);
		
		JButton cs_AddressCodeFinder = new JButton("조    회");
		cs_AddressCodeFinder.setBounds(236, 100, 95, 20);
		frame.getContentPane().add(cs_AddressCodeFinder);
		
		JLabel cs_Address = new JLabel("주    소");
		cs_Address.setHorizontalAlignment(SwingConstants.CENTER);
		cs_Address.setBounds(46, 130, 70, 20);
		frame.getContentPane().add(cs_Address);
		
		cs_AddressTextField = new JTextField();
		cs_AddressTextField.setBounds(121, 130, 350, 20);
		frame.getContentPane().add(cs_AddressTextField);
		cs_AddressTextField.setColumns(10);
		
		JLabel cs_DetailAddress = new JLabel("상세주소");
		cs_DetailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		cs_DetailAddress.setBounds(41, 160, 90, 20);
		frame.getContentPane().add(cs_DetailAddress);
		
		cs_DetailAddressTextField = new JTextField();
		cs_DetailAddressTextField.setBounds(121, 160, 350, 20);
		frame.getContentPane().add(cs_DetailAddressTextField);
		cs_DetailAddressTextField.setColumns(10);
		
		JLabel cs_Email = new JLabel("이메일");
		cs_Email.setHorizontalAlignment(SwingConstants.CENTER);
		cs_Email.setBounds(21, 190, 50, 20);
		frame.getContentPane().add(cs_Email);
		
		cs_EmailTextField = new JTextField();
		cs_EmailTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_EmailTextField.setBounds(71, 190, 185, 20);
		frame.getContentPane().add(cs_EmailTextField);
		cs_EmailTextField.setColumns(10);
		
		JLabel cs_TelNum = new JLabel("전  화");
		cs_TelNum.setHorizontalAlignment(SwingConstants.CENTER);
		cs_TelNum.setBounds(266, 190, 50, 20);
		frame.getContentPane().add(cs_TelNum);
		
		cs_TelNumTextField = new JTextField();
		cs_TelNumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_TelNumTextField.setBounds(321, 190, 110, 20);
		frame.getContentPane().add(cs_TelNumTextField);
		cs_TelNumTextField.setColumns(10);
		
		JLabel cs_MobileNum = new JLabel("휴대폰");
		cs_MobileNum.setHorizontalAlignment(SwingConstants.CENTER);
		cs_MobileNum.setBounds(441, 190, 50, 20);
		frame.getContentPane().add(cs_MobileNum);
		
		cs_MobileNumTextField = new JTextField();
		cs_MobileNumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_MobileNumTextField.setBounds(496, 190, 120, 20);
		frame.getContentPane().add(cs_MobileNumTextField);
		cs_MobileNumTextField.setColumns(10);
		
		JLabel cs_Fax = new JLabel("FAX");
		cs_Fax.setHorizontalAlignment(SwingConstants.CENTER);
		cs_Fax.setBounds(351, 100, 50, 20);
		frame.getContentPane().add(cs_Fax);
		
		cs_FaxTextField = new JTextField();
		cs_FaxTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_FaxTextField.setBounds(401, 100, 130, 20);
		frame.getContentPane().add(cs_FaxTextField);
		cs_FaxTextField.setColumns(10);
		
		JLabel cs_NameForInvoice = new JLabel("계산서 발행용 상호");
		cs_NameForInvoice.setHorizontalAlignment(SwingConstants.CENTER);
		cs_NameForInvoice.setBounds(21, 220, 110, 20);
		frame.getContentPane().add(cs_NameForInvoice);
		
		cs_NameForInvoiceTextField = new JTextField();
		cs_NameForInvoiceTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_NameForInvoiceTextField.setBounds(136, 220, 120, 20);
		frame.getContentPane().add(cs_NameForInvoiceTextField);
		cs_NameForInvoiceTextField.setColumns(10);
		
		JLabel cs_BankName = new JLabel("입금은행");
		cs_BankName.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BankName.setBounds(26, 250, 100, 20);
		frame.getContentPane().add(cs_BankName);
		
		cs_BankNameTextField = new JTextField();
		cs_BankNameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_BankNameTextField.setBounds(106, 250, 110, 20);
		frame.getContentPane().add(cs_BankNameTextField);
		cs_BankNameTextField.setColumns(10);
		
		JLabel cs_AccountHolder = new JLabel("계좌주");
		cs_AccountHolder.setHorizontalAlignment(SwingConstants.CENTER);
		cs_AccountHolder.setBounds(211, 250, 70, 20);
		frame.getContentPane().add(cs_AccountHolder);
		
		cs_AccountHolderTextField = new JTextField();
		cs_AccountHolderTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_AccountHolderTextField.setBounds(276, 250, 100, 20);
		frame.getContentPane().add(cs_AccountHolderTextField);
		cs_AccountHolderTextField.setColumns(10);
		
		JLabel cs_AccountNumber = new JLabel("계좌번호");
		cs_AccountNumber.setHorizontalAlignment(SwingConstants.CENTER);
		cs_AccountNumber.setBounds(361, 250, 100, 20);
		frame.getContentPane().add(cs_AccountNumber);
		
		cs_AccountNumberTextField = new JTextField();
		cs_AccountNumberTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_AccountNumberTextField.setBounds(446, 250, 150, 20);
		frame.getContentPane().add(cs_AccountNumberTextField);
		cs_AccountNumberTextField.setColumns(10);
		
		JLabel cs_RegiDate = new JLabel("등록일");
		cs_RegiDate.setHorizontalAlignment(SwingConstants.CENTER);
		cs_RegiDate.setBounds(31, 280, 100, 20);
		frame.getContentPane().add(cs_RegiDate);
		
		cs_RegiDateTextField = new JTextField();
		cs_RegiDateTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_RegiDateTextField.setBounds(116, 280, 120, 20);
		frame.getContentPane().add(cs_RegiDateTextField);
		cs_RegiDateTextField.setColumns(10);
		
		JLabel cs_CloseDate = new JLabel("폐기일");
		cs_CloseDate.setHorizontalAlignment(SwingConstants.CENTER);
		cs_CloseDate.setBounds(221, 280, 100, 20);
		frame.getContentPane().add(cs_CloseDate);
		
		cs_CloseDateTextField = new JTextField();
		cs_CloseDateTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cs_CloseDateTextField.setBounds(296, 280, 120, 20);
		frame.getContentPane().add(cs_CloseDateTextField);
		cs_CloseDateTextField.setColumns(10);
		
		cs_SaleType = new JLabel("거래처 분류");
		cs_SaleType.setHorizontalAlignment(SwingConstants.CENTER);
		cs_SaleType.setBounds(21, 10, 100, 20);
		frame.getContentPane().add(cs_SaleType);
		
		JComboBox cs_SaleTypeComboBox = new JComboBox();
		cs_SaleTypeComboBox.setBounds(121, 10, 100, 23);
		frame.getContentPane().add(cs_SaleTypeComboBox);
		
		cs_Memo = new JLabel("메모");
		cs_Memo.setHorizontalAlignment(SwingConstants.CENTER);
		cs_Memo.setBounds(12, 310, 52, 20);
		frame.getContentPane().add(cs_Memo);
		
		cs_MemoTextField = new JTextField();
		cs_MemoTextField.setBounds(60, 310, 520, 20);
		frame.getContentPane().add(cs_MemoTextField);
		cs_MemoTextField.setColumns(10);
		
		JButton cs_Insert = new JButton("입력");
		cs_Insert.setBounds(83, 352, 100, 20);
		frame.getContentPane().add(cs_Insert);
		
		JButton cs_update = new JButton("수정");
		cs_update.setBounds(266, 352, 100, 20);
		frame.getContentPane().add(cs_update);
		
		cs_close = new JButton("닫기");
		cs_close.setBounds(449, 351, 100, 20);
		frame.getContentPane().add(cs_close);
	}
}
