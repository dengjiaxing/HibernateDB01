package org.hibernate.entity;

public class Address {
	private int addressid;
	private String addressinfo;

	public Address() {
		// TODO Auto-generated constructor stub
	}
	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getAddressinfo() {
		return addressinfo;
	}

	public void setAddressinfo(String addressinfo) {
		this.addressinfo = addressinfo;
	}

}
