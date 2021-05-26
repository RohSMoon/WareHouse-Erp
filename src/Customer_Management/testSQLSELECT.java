package Customer_Management;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class testSQLSELECT {

	/*
	public List<CustomerManagerVO> Select() throws SQLException {
		List<CustomerManagerVO> rtnList = new ArrayList<CustomerManagerVO>();
		CustomerManagerDao ABC = new CustomerManagerDao();
		rtnList = ABC.selectList();
		System.out.println();
		return rtnList;
	}
	*/
	
	public List<Map<String, Object>> Select() throws SQLException {
		List<Map<String, Object>> rtnList = new ArrayList<Map<String,Object>>();
		CustomerManagerDao ABC = new CustomerManagerDao();
		rtnList = ABC.selectList();
		System.out.println();
		return rtnList;
	}
	public static void main(String[] args) throws SQLException {
		testSQLSELECT tsql = new testSQLSELECT();
		/*
		List<CustomerManagerVO> ABCD = tsql.Select();

		for (CustomerManagerVO customerManagerVO : ABCD) {
			System.out.println("**************************");
			System.out.println(customerManagerVO.getCustomerName() 
								+ " | " + customerManagerVO.getNameOfRepresentative()
								+ " | " + customerManagerVO.getAddress()
								+ " | " + customerManagerVO.getBusinRegNum()
					);
			System.out.println("**************************");
		}
		*/  //리스트를 쓰면 고정된 컬럼 값을 받아서 사용한다.
		 // 맵을 사용하면 유동적으로 변하는 DB의 컬럼을 그대로 가져온다.
		List<Map<String, Object>> stq = new ArrayList<Map<String, Object>>();
		stq = tsql.Select();
		for (Map<String, Object> map : stq) {
			Iterator<String> a = map.keySet().iterator();
			while (a.hasNext()) {
				String key = a.next();
				System.out.println("Key : " + key + " | Data : " + map.get(key));
			}
		}
		
	}
}
