package kr.or.yi.mybatis_c3p0_wsm;

import static org.junit.Assert.*;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Test;

public class AbstractTest {
	protected static final Log log = LogFactory.getLog(AbstractTest.class);
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
