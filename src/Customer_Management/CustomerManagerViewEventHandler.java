package Customer_Management;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



	public class CustomerManagerViewEventHandler implements ActionListener {
		CustomerManagerView cmv = null;
		CustomerManagerViewEventHandler cmvEH = null;
		CustomerManagerVO cmVO = null;
		
	public CustomerManagerViewEventHandler() {
		System.out.println("CMV핸들러 생성자에서 CMV ========"+cmv);
		cmVO = new CustomerManagerVO();
	}
	
	public CustomerManagerViewEventHandler(CustomerManagerView cmv) {
		System.out.println("여기==커스텀매니져 핸들러 생성자==>"+cmv);
		this.cmv = cmv;
		System.out.println("CMV핸들러에서 주입받고 CMV ========"+cmv);
		// cmv = cmvEH;
		
	}
	
	////////end of constructor////////end of constructor////////end of constructor////////end of constructor////////end of constructor
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		//String command = e.getActionCommand();
//-------------- 거래처 관리 버튼  -------------------------//
		
		if(obj == cmv.cs_Insert) {
			System.out.println("입력버튼 작동");
			CustomerManagerVO cmVO = new CustomerManagerVO();	

			cmVO.setIssuanceNumber    		   ( Integer.parseInt(cmv.cs_IssuanceNumberTextField.getText()) ); 
			cmVO.setCustomerName	           ( cmv.cs_CustomerNameTextField.getText()                     ); 
			cmVO.setNameOfRepresentative       ( cmv.cs_NameOfRepresentativeTextField.getText()             ); 
			cmVO.setBusinRegNum				   ( Integer.parseInt(cmv.cs_BusinRegNumTextField  .getText())  ); 
			cmVO.setBusinItem				   ( cmv.cs_BusinItemTextField.getText()                        ); 
			cmVO.setBusinType 			       ( cmv.cs_BusinTypeTextField .getText()                       ); 
			cmVO.setFax					       ( Integer.parseInt(cmv.cs_FaxTextField.getText())            ); 
			cmVO.setAddress 				   ( cmv.cs_AddressTextField .getText()                         ); 
			cmVO.setDetailAddress 		       ( cmv.cs_DetailAddressTextField.getText()                    ); 
			cmVO.setEmail 				       ( cmv.cs_EmailTextField.getText()                            ); 
			cmVO.setTel 					   ( Integer.parseInt( cmv.cs_TelTextField .getText())          ); 
			cmVO.setHP 					       ( Integer.parseInt(cmv.cs_HPTextField.getText())             ); 
			cmVO.setCustomerNameToBill 	       ( cmv.cs_CustomerNameToBillTextField.getText()               ); 
			cmVO.setBankName 			       ( cmv.cs_BankNameTextField  .getText()                       ); 
			cmVO.setAccountHolder		       ( cmv.cs_AccountHolderTextField.getText()                    ); 
			cmVO.setAccountNumber 		       ( Integer.parseInt(cmv.cs_AccountNumberTextField.getText())  ); 
			cmVO.setRegiDate 				   ( cmv.cs_RegiDateTextField.getText()                         ); 
			cmVO.setCloseDate 			       ( cmv.cs_CloseDateTextField.getText()                        ); 
			cmVO.setMemo 				       ( cmv.cs_MemoTextField.getText()					   			);                           
			/*
			int	   issuanceNumber 		= Integer.parseInt(cmv.cs_IssuanceNumberTextField.getText());
			String customerName   		= cmv.cs_CustomerNameTextField.getText();
			String nameOfRepresentative = cmv.cs_NameOfRepresentativeTextField.getText();
			int	   businRegNum 			= Integer.parseInt(cmv.cs_BusinRegNumTextField  .getText());
			String businItem 			= cmv.cs_BusinItemTextField.getText();
			String businType 			= cmv.cs_BusinTypeTextField .getText();
			int	   fax					= Integer.parseInt(cmv.cs_FaxTextField.getText());
			String address 				= cmv.cs_AddressTextField .getText();
			String detailAddress 		= cmv.cs_DetailAddressTextField.getText();
			String email 				= cmv.cs_EmailTextField.getText();
			int	   tel 					= Integer.parseInt( cmv.cs_TelTextField .getText());
			int	   hp 					= Integer.parseInt(cmv.cs_HPTextField.getText());
			String customerNameToBill 	= cmv.cs_CustomerNameToBillTextField.getText();
			String bankName 			= cmv.cs_BankNameTextField  .getText();
			String accountHolder		= cmv.cs_AccountHolderTextField.getText();
			int	   accountNumber 		= Integer.parseInt(cmv.cs_AccountNumberTextField.getText());
			String regDate 				= cmv.cs_RegiDateTextField.getText();
			String closeDate 			= cmv.cs_CloseDateTextField.getText();
			String memo 				= cmv.cs_Memo TextField.getText();
			*/
			
			System.out.println("issuanceNumber 값 받았다."+cmVO.getIssuanceNumber());
			try {
				
				CustomerManagerDao cdao =new CustomerManagerDao();
				cdao.insert(cmVO);
			
		    /*
			cmVO.setIssuanceNumber(Integer.parseInt(cmv.cs_IssuanceNumberTextField.getText()));
			java.lang.reflect.Field[] fi = CustomerManagerView.class.getFields();
			for(java.lang.reflect.Field f : fi) {
				
				
			}*/
			 
			
	
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}/////////////end of insert try/////////////end of insert try
				
	 }/////end of insert if IF if/////end of insert if IF if  
	
			else if(obj == cmv.cs_update) {
				System.out.println("수정버튼 작동");
	}
			//if("입력".equals(command)) {
			else if(obj == cmv.cs_Close) {
			System.out.println("닫기 버튼 정상 작동");
			System.out.println("닫기버튼 cmv 문구 ========"+cmv);
			System.out.println("닫기버튼 디스 문구 ========"+this);
				//this.dispose();
				cmv.dispose();
			//System.exit(JDialog.EXIT_ON_CLOSE);
			//this.dispose();
		}///end of emv.cs CLOES 닫기버튼////////end of emv.cs CLOES 닫기버튼////////end of emv.cs CLOES 닫기버튼////
		
	
	}////////end of actionPerformed////////end of actionPerformed////////end of actionPerformed////////end of actionPerformed



}////////end of CLASS////////end of CLASS////////end of CLASS////////end of CLASS////////end of CLASS