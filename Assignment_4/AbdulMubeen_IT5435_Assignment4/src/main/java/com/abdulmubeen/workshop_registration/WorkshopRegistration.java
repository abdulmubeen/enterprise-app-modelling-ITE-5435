package com.abdulmubeen.workshop_registration;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class WorkshopRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    private String lastName;

    @NotBlank(message = "Company/Institution is required")
    private String companyInstitution;

    @NotBlank(message = "Address is required")
    private String address;

    private String city;

    private String state;

    private String country = "Canada";

    @NotBlank(message = "Email is required")
    @Email(message = "Please enter a valid email")
    private String email;

    @NotBlank(message = "Phone Number is required")
    private String phoneNumber;

    private String mealPreference;

    private boolean cash;
    private boolean cheque;
    private boolean demandDraft;

    private String chequeDdNo;
    private String drawnOnBank;
    private String payableAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getCompanyInstitution() {
		return companyInstitution;
	}
	public void setCompanyInstitution(String companyInstitution) {
		this.companyInstitution = companyInstitution;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMealPreference() {
		return mealPreference;
	}
	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}
	public boolean isCash() {
		return cash;
	}
	public void setCash(boolean cash) {
		this.cash = cash;
	}
	public boolean isCheque() {
		return cheque;
	}
	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}
	public boolean isDemandDraft() {
		return demandDraft;
	}
	public void setDemandDraft(boolean demandDraft) {
		this.demandDraft = demandDraft;
	}
	public String getChequeDdNo() {
		return chequeDdNo;
	}
	public void setChequeDdNo(String chequeDdNo) {
		this.chequeDdNo = chequeDdNo;
	}
	public String getDrawnOnBank() {
		return drawnOnBank;
	}
	public void setDrawnOnBank(String drawnOnBank) {
		this.drawnOnBank = drawnOnBank;
	}
	public String getPayableAt() {
		return payableAt;
	}
	public void setPayableAt(String payableAt) {
		this.payableAt = payableAt;
	}

}
