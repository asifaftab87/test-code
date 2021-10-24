package org.la.student.one.jamal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "customers")
public class Customers implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="customerId")
	private Long customerId;
	
	
	@Column(name="firstName")
	private String firstName;

	@Column(name="lastName")
	private String lastName;

	@Column(name="classNum")
	private Long classNum;
	
	
	@Column(name="doorNum")
	private Long doorNum;

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
	
	@Value("${db.password}")
	@Column(name="password")
	private Long password;
	
	@Column(name="creditCard")
	private Long creditCard ;
	
	@Column(name="creditCardTypeId")
	private String creditCardTypeId;
	
	@JsonFormat (pattern="yyyy-MM")
	@Column(name="cardExpDate")
	private Date cardExpDate ;
	
	@Column(name="billingAddress")
	private String billingAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getClassNum() {
		return classNum;
	}

	public void setClassNum(Long classNum) {
		this.classNum = classNum;
	}

	public Long getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(Long doorNum) {
		this.doorNum = doorNum;
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

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public Long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(Long creditCard) {
		this.creditCard = creditCard;
	}

	public String getCreditCardTypeId() {
		return creditCardTypeId;
	}

	public void setCreditCardTypeId(String creditCardTypeId) {
		this.creditCardTypeId = creditCardTypeId;
	}

	public Date getCardExpDate() {
		return cardExpDate;
	}

	public void setCardExpDate(Date cardExpDate) {
		this.cardExpDate = cardExpDate;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", customerId=" + customerId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", classNum=" + classNum + ", doorNum=" + doorNum + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", postalcode=" + postalcode
				+ ", country=" + country + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", creditCard=" + creditCard + ", creditCardTypeId=" + creditCardTypeId + ", cardExpDate="
				+ cardExpDate + ", billingAddress=" + billingAddress + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

}
