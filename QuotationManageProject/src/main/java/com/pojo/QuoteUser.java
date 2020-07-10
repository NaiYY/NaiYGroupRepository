package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("quote_user")
public class QuoteUser  {
	@TableId(type = IdType.AUTO)
	private String userName;
	private String password;
	private String grade;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "QuoteUser{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", grade='" + grade + '\'' +
				'}';
	}
}