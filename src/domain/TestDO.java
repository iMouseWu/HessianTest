package domain;

import java.io.Serializable;

public class TestDO implements Serializable {

	private static final long serialVersionUID = -5816566219163888366L;

	private String userName = "1111";
	private String password = "2222";

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

}
