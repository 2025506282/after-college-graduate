package model;

public class User {
	private String userName;
	private String password;
	private Integer gender;
	private String phoneNumber;
	private String belongClass;
	private String rna;
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
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBelongClass() {
		return belongClass;
	}
	public void setBelongClass(String belongClass) {
		this.belongClass = belongClass;
	}
	public String getRna() {
		return rna;
	}
	public void setRna(String rna) {
		this.rna = rna;
	}
	
}
