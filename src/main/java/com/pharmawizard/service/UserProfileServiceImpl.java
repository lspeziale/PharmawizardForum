package com.pharmawizard.service;

import java.util.Collection;
import java.util.Optional;

import com.pharmawizard.domain.UserCreateForm;
import com.pharmawizard.domain.UserProfile;
import com.pharmawizard.repository.UserProfileRepository;

public class UserProfileServiceImpl implements UserProfileService {

	private final UserProfileRepository userProfileRepository;

	public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
		this.userProfileRepository = userProfileRepository;
	}

	@Override
	public UserProfile getUserById(long idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfile getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<UserProfile> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfile create(UserCreateForm form) {
		// TODO Auto-generated method stub
		return null;
	}

}
