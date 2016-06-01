package test.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class User {

	public static final String ID = "ID";
	public static final String PASSWORD = "PASSWORD";
	public static final String NAME = "NAME";
	
	@Id
	@Column(name=ID)
	private String id;
	@Column(name=PASSWORD)
	private String pw;
	@Column(name=NAME)
	private String name;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
