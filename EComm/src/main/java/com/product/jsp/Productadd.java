package com.product.jsp;

public class Productadd 
{
	private int  pid;
	private String pname;
	private String description;
	private int price;
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public String getDescription() 
	{
		return description;
	}
	public int getPrice()
	{
		return price;
	}
	
	
}
