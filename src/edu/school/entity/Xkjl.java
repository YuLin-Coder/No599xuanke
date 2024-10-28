package edu.school.entity;

public class Xkjl {
    
	
	public Integer getX_id() {
		return x_id;
	}
	public void setX_id(Integer x_id) {
		this.x_id = x_id;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	private Integer x_id;//主键
   
	public Xkjl() {
		super();
	}
	private String stuno;//学号
	private String sname;//生姓名
    private String c_id;//外键
    public Xkjl(Integer x_id, String stuno, String sname, String c_id, String createTime) {
		super();
		this.x_id = x_id;
		this.stuno = stuno;
		this.sname = sname;
		this.c_id = c_id;
		this.createTime = createTime;
	}
	private String createTime;//密码,
   
}
