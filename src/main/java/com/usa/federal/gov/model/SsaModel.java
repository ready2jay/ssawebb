package com.usa.federal.gov.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class SsaModel {
	protected long ssnNo;
	protected String firstName;
	protected String lastName;
	protected String phoneNo;
	protected String gender;
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	protected Date dob;
	protected Date createdDate;
	protected Date updatedDate;
	protected String state;
	protected String updatedBy;
	protected MultipartFile photo;

	public long getSsnNo() {
		return ssnNo;
	}

	public void setSsnNo(long ssnNo) {
		this.ssnNo = ssnNo;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "SsaModel [ssnNo=" + ssnNo + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", gender=" + gender + ", dob=" + dob + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", state=" + state + ", updatedBy=" + updatedBy + ", photo=" + photo + "]";
	}

}
