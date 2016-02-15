package com.sumon.object;

public class Address {

	private String houseNo;
	private String roadNo;
	private String district;
	private int postCode;
	
	public String  getFullAddres() {
		return houseNo+","+roadNo+","+district+"\n Post Code: "+postCode;
	}
	
	protected String getHouseNo() {
		return houseNo;
	}
	protected void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	protected String getRoadNo() {
		return roadNo;
	}
	protected void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	protected String getDistrict() {
		return district;
	}
	protected void setDistrict(String district) {
		this.district = district;
	}
	protected int getPostCode() {
		return postCode;
	}
	protected void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	
}
