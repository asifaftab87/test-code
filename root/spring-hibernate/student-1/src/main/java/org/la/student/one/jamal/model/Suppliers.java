package org.la.student.one.jamal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name= "suppliers1")
@Table(name= "suppliers")
public class Suppliers implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="supplierId")
	private Long supplierId;
	
	@Column(name="companyName")
	private String companyName;
	
	
	
	@Column(name="contactFName")
	private String contactFName;
	
	
	@Column(name="contactLName")
	private String contactLName;

	@Column(name="contactTitle")
	private String contactTitle;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;

	@Column(name="postalcode")
	private Long postalcode;
	
	@Column(name="country")
	private String country;

	@Column(name="phone")
	private Long phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="paymentMethods")
	private String paymentMethods;
	
	@Column(name="discountType")
	private String discountType;
	
	@Column(name="typeGoods")
	private String typeGoods;
	
	@Column(name="notes")
	private String notes;
	
	@Column(name="discountAvailabe")
	private String discountAvailabe;
	
	@Column(name="customerId")
	private String customerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactFName() {
		return contactFName;
	}

	public void setContactFName(String contactFName) {
		this.contactFName = contactFName;
	}

	public String getContactLName() {
		return contactLName;
	}

	public void setContactLName(String contactLName) {
		this.contactLName = contactLName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public Long getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(Long postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(String paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getTypeGoods() {
		return typeGoods;
	}

	public void setTypeGoods(String typeGoods) {
		this.typeGoods = typeGoods;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDiscountAvailabe() {
		return discountAvailabe;
	}

	public void setDiscountAvailabe(String discountAvailabe) {
		this.discountAvailabe = discountAvailabe;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Suppliers [id=" + id + ", supplierId=" + supplierId + ", companyName=" + companyName + ", contactFName="
				+ contactFName + ", contactLName=" + contactLName + ", contactTitle=" + contactTitle + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", postalcode="
				+ postalcode + ", country=" + country + ", phone=" + phone + ", email=" + email + ", paymentMethods="
				+ paymentMethods + ", discountType=" + discountType + ", typeGoods=" + typeGoods + ", notes=" + notes
				+ ", discountAvailabe=" + discountAvailabe + ", customerId=" + customerId + "]";
	}
	
	
	
	
	
	
	
	
	

	 

	
	
	
	
	 

}
