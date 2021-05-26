package MainLog;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Customer_Management.CustomerManagerView;


public class LogViewEventHandler implements ActionListener {
		LogView 		lgv = 		null;
	CustomerManagerView cmv = null;
	public LogViewEventHandler() {}
	public LogViewEventHandler(LogView lgv) {
		System.out.println("핸들러 파라미터 생성자를 탄다.");
		this.lgv = lgv;
		System.out.println("lgv핸들러에서============:      "+lgv);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		
//-------------- 기본 관리 탭 -------------------------//
		
		if(obj==lgv.Basic_CustomerManagement) {
			
			System.out.println("거래t56r4처 관리 호출 성공");
			//CustomerManagerView cmv = new CustomerManagerView();
			cmv = new CustomerManagerView();
			System.out.println("여기== logview에서==>"+cmv);
			
			
		} 
		else if(obj==lgv.Basic_ProductManagement) {
			System.out.println("제품 관리 호출 성공");
		} 
		else if(obj==lgv.Basic_MarketManagement) {
			System.out.println("마켓 관리 호출 성공");
		} 
		else if(obj==lgv.Basic_StorageManagement) {
			System.out.println("창고 관리 호출 성공");
		} 
		else if(obj==lgv.Basic_EmployeeManagement) {
			System.out.println("직원 관리 호출 성공");
		} 
		
//-------------- 발주 관리 탭 -------------------------//		
		else if(obj==lgv.oder_OrderListManagement) {
			System.out.println("발주 관리 호출 성공");
		} 
		else if(obj==lgv.order_BuyManagement) {
			System.out.println("매입 관리 호출 성공");
		} 
		else if(obj==lgv.order_StockManagement) {
			System.out.println("재고 관리 호출 성공");
		} 
//-------------- 발주 관리 탭 -------------------------//
		else if(obj==lgv.menu_Exit) {
			System.exit(0);
		}
		
		
		
	}/// -------End of actionPerformed



	
}////////////// End of CLASS////////////// End of CLASS////////////// End of CLASS////////////// End of CLASS////////////// End of CLASS////////////// End of CLASS