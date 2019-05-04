package com.usa.federal.gov.model;

import javax.persistence.Column;

public class UsaStateModel {
	private String stateId;
	private String stateName;
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

	@Override
	public String toString() {
		return "UsaStateModel [stateId=" + stateId + ", stateName=" + stateName + ", stateCode=" + stateCode + "]";
	}
}
