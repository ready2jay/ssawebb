package com.usa.federal.gov.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "SSA_MASTER")
@Data
public class SsaMaster {
	@Id
	@GeneratedValue(generator = "ssa_seq")
	@SequenceGenerator(sequenceName = "ssa_seq_gen", name = "ssa_seq", allocationSize = 800000, initialValue = 100001)
	@Column(name = "ssa_no")
	protected long ssnNo;
	@Column(name = "first_name")
	protected String firstName;
	@Column(name = "last_name")
	protected String lastName;
	@Column(name = "phone_no")
	protected String phoneNo;
	@Column(name = "gender")
	protected String gender;
	@Column(name = "dob")
	protected Date dob;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date")
	protected Date cretedDate;
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "updated_date")
	protected Date updatedDate;
	@Column(name = "state")
	protected String state;
	@Column(name = "updated_by")
	protected String updatedBy;
	@Column(name = "Photo_path")
	@Lob
	protected byte[] photo;

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

	public Date getCretedDate() {
		return cretedDate;
	}

	public void setCretedDate(Date cretedDate) {
		this.cretedDate = cretedDate;
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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "SsaMaster [ssnNo=" + ssnNo + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", gender=" + gender + ", dob=" + dob + ", cretedDate=" + cretedDate + ", updatedDate="
				+ updatedDate + ", state=" + state + ", updatedBy=" + updatedBy + ", photo=" + Arrays.toString(photo)
				+ "]";
	}

}
