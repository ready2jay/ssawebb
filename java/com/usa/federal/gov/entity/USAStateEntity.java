package com.usa.federal.gov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USA_STATE")
public class USAStateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stateId")
	private String stateId;
	@Column(name = "stateName")
	private String stateName;
	@Column(name = "stateCode")
	private String stateCode;

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
}
