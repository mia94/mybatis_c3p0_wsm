package kr.or.yi.mybatis_c3p0_wsm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_wsm.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_wsm.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_wsm.dto.Title;

public class TitleDaoTest extends AbstractTest {
	
	private static TitleDao titleDao = new TitleDaoImpl();
	
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test01insertTitle() {
		log.debug("test01insertTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("인턴");
		
		int res = titleDao.insertTitle(title);
		Assert.assertEquals(1, res);
	}

}
