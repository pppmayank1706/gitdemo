package com.anubhavtrainings.entities;



import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class address {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2", strategy="org.hibernate.id.UUIDGenerator")
	@Column(nullable=false, name="ID")
	public String addressId;
	@Column(name="TYPE")
	public String addressType;
	@Column(name="STREET")
	public String street;
	@Column(name="CITY")
	public String city;
	@Column(name="COUNTRY")
	public String country;
	@Column(name="REGION")
	public String region;


public address() {
	
}
public address(String addressId, String addressType, String street, String city, String country, String region) {
	super();
	this.addressId = addressId;
	this.addressType = addressType;
	this.street = street;
	this.city = city;
	this.country = country;
	this.region = region;
}
public String getAddressId() {
	return addressId;
}
public void setAddressId(String addressId) {
	this.addressId = addressId;
}
public String getAddressType() {
	return addressType;
}
public void setAddressType(String addressType) {
	this.addressType = addressType;
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}


}