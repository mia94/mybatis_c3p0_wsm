package kr.or.yi.mybatis_c3p0_wsm.dto;

public class Title {
	private int code;
	private String name;
	//mybatis에서는 생성자 만들필요X
	public Title(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Title [code=%s, name=%s]", code, name);
	}
	
	
}
