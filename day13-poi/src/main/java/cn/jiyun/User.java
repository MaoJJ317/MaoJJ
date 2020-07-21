package cn.jiyun;

/** 

* @author User: 小灰灰 

* @version Time：2020年3月16日 下午12:34:18 

* 类说明 

*/

public class User {
	private Integer id;
	private String userName;
	private String passWord;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
