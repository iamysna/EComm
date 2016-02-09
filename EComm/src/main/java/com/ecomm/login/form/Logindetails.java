package com.ecomm.login.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGINCATALOG")

public class Logindetails {
	
	
	
	
	@Id
	@Column(name="USERID")
	@GeneratedValue
	private Integer userid;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
    
	public void setusername(String username) {
	      this.username = username;
    }
	
    public String getusername() {
	      return username;
    }
    
    public void setpassword(String password) {
	      this.password = password;
    }
	
    public String getpassword() {
	      return password;
    }
    
    public Integer getUserId() {
		return userid;
	}
	public void setUserId(Integer id) {
		this.userid = id;
	}

}
