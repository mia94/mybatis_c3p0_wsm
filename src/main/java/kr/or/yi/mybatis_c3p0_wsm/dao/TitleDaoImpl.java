package kr.or.yi.mybatis_c3p0_wsm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_wsm.dto.Title;
import kr.or.yi.mybatis_c3p0_wsm.jdbc.MyBatisSqlSessionFactory;

public class TitleDaoImpl implements TitleDao {
	private static final String namespace = "kr.or.yi.mybatis_c3p0_wsm.dao.TitleDao";

	@Override
	public List<Title> selectTitleByAll() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.openSession()) {
			return sqlsession.selectList(namespace + ".selectTitleByAll");
		}
	}

	@Override
	public Title selectTitleByCode(Title title) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.openSession()) {
			return sqlsession.selectOne(namespace + ".selectTitleByCode",title);
		}
	}

	@Override
	public int insertTitle(Title title) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlsession.insert(namespace + ".insertTitle", title);
			sqlsession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(int code) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.delete(namespace+".deleteTitle",code);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateTitle(Title title) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.update(namespace+".updateTitle",title);
			sqlSession.commit();
			return res;
		}
	}

}



















