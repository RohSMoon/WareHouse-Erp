package Customer_Management;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.vo.LogViewDvo;

import oracle.jdbc.internal.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;


public class CustomerManagerDao {
	private SqlSessionFactory sqlSessionFactory;
	CustomerManagerVO customerManagerVO = null;
	final String Namespace = "Customer_Management.SqlMapper.";
/*
 * 
 * String resource = "com/atoz_develop/spms/dao/mybatis-config.xml";
// Resources.getResourceAsStream(): ClASSPATH 경로에 있는 파일의 입력 스트림 얻음
InputStream inputStream = Resources.getResourceAsStream(resource);
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
 * */
	
	CustomerManagerDao(){
		try {
			initSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initSession() throws IOException {
		String resource = "Customer_Management/sqlMapperConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		this.sqlSessionFactory = sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
/*
	public List<CustomerManagerVO> selectList() throws SQLException{
		//myBatis - SqlSession : SQL 실행
		//openSession() : SqlSession 얻기
		//SELECT 할 값이 여러개니까 LIST 사용해서 VO를 받아줬다.
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			//selectList(): SELECT
			//파하미터 : SQL 맵퍼의 네임 스페이스 
			//SQL 맵퍼의 네임 스페이스(com.atoz_develop.spms.dao.ProjectDao) 
			//+ SQL문 ID(selectList)
			return sqlSession.selectList(Namespace + "selectList");
		} finally {
			sqlSession.close();
		}
		//@Override
		//public Project SelectOne(int no) throws SQLException
		
	
	}
	*/
	public List<Map<String, Object>> selectList() throws SQLException{
		//myBatis - SqlSession : SQL 실행
		//openSession() : SqlSession 얻기
		//SELECT 할 값이 여러개니까 LIST 사용해서 VO를 받아줬다.
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			//selectList(): SELECT
			//파하미터 : SQL 맵퍼의 네임 스페이스 
			//SQL 맵퍼의 네임 스페이스(com.atoz_develop.spms.dao.ProjectDao) 
			//+ SQL문 ID(selectList)
			return sqlSession.selectList(Namespace + "selectList");
		} finally {
			sqlSession.close();
		}
		//@Override
		//public Project SelectOne(int no) throws SQLException
		
	
	}
	public CustomerManagerVO selectOne(CustomerManagerVO custmerManagerVO) {
		//SELECT 할 값이 한개지정이므로 객체배열을 사용할 필요가 없다.
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectOne(Namespace + "selectOne",custmerManagerVO);
		//1번 파람 =xml 경로
		//2번파람 데이터를 넘길 파미터
		//
	}
	public int insert(CustomerManagerVO custmerManagerVO) throws SQLException {
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//insert는 카운트로 받아야한다. 이미 카운트로 리턴을 받기 때문에  오브젝트로 선언해서 자원을 낭비할 필요가 없다.
	try {
		//insert() : INSERT
		int count = sqlSession.insert(Namespace + "insert",custmerManagerVO);
		//count를 쓰는 이유 몇건이 삽입되었는지 확인하기 위해서
		sqlSession.commit();
		
		return count;
	} finally {
		sqlSession.close();
	}
	
	}
	
	public int update(CustomerManagerVO custmerManagerVO) throws SQLException{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int count = sqlSession.update(Namespace + "update",custmerManagerVO);
			sqlSession.commit();
			return count;
		}finally {
			sqlSession.close();
		}
		
	}
	public Object delete(CustomerManagerVO custmerManagerVO) throws SQLException{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int count = sqlSession.delete(Namespace + "delete",custmerManagerVO);
			sqlSession.commit();
			return count;
		} finally {
			sqlSession.close();
		}
	}
	
	/*
	public void name() {
		List<commVo> testList = new ArrayList<commVo>();
		commVo testVo = new commVo();
		LogViewDvo testVo2 = new LogViewDvo();
		testList.add(testVo); //정상
		testList.add(testVo2); //에러
		
		Map<String, Object> testMap = new HashMap<String, Object>();
		testMap.put("ComVO", testVo); //정상
		testMap.put("LogVo", testVo2); //정상
		
	}
	*/
	
	
}