package com.sec.demo.pojo;

import java.io.Serializable;

/**
 * Created by WangZJ on 2018/7/22.
 */
public class User implements Serializable{
//	private static final long serialVersionUID = 1L;
	
    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
    @Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}
    
}
