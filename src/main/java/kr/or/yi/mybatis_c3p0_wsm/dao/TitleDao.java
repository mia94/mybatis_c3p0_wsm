package kr.or.yi.mybatis_c3p0_wsm.dao;

import java.util.List;

import kr.or.yi.mybatis_c3p0_wsm.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();
	Title selectTitleByCode(Title title);
	int insertTitle(Title title);
	int deleteTitle(Title title);
	int updateTitle(Title title);
}
