package org.la.view.model.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable{

	private Long id;
	private Long userId;
	private String street;
	private String city;
	private String state;
	private String country;
	private String postcode;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", userId=" + userId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", postcode=" + postcode + "]";
	}
}
