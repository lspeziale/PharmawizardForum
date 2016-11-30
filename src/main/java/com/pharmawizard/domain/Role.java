package com.pharmawizard.domain;

import java.io.Serializable;

public enum Role implements Serializable {

	USER("USER"), DBA("DBA"), ADMIN("ADMIN");

	String userProfileType;

	private Role(String userProfileType) {
		this.userProfileType = userProfileType;
	}

	public String getUserProfileType() {
		return userProfileType;
	}

}
