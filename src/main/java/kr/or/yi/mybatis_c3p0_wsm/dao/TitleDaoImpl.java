package kr.or.yi.mybatis_c3p0_wsm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_wsm.dto.Title;
import kr.or.yi.mybatis_c3p0_wsm.jdbc.MyBatisSqlSessionFactory;

public class TitleDaoImpl implements TitleDao {
	private static final String namespace = "kr.or.yi.mybatis_c3p0_wsm.dao.TitleDao";
		
	@Override
	public List<Title> selectTitleByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title selectTitleByCode(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlsession.insert(namespace + ".insertTitle",title);
			sqlsession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(int code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

}
