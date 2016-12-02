package com.pharmawizard.service;

import java.io.IOException;
import java.util.List;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.pharmawizard.domain.UserProfile;
import com.pharmawizard.repository.UserProfileRepository;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	private final Logger logger = Logger.getGlobal();

	private final UserProfileRepository userProfileRepository;

	public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
		this.userProfileRepository = userProfileRepository;
	}

	@Override
	public UserProfile getUserById(Long idUser) {
		return userProfileRepository.findOne(idUser);
	}

	@Override
	public UserProfile getUserByEmail(String email) {
		return userProfileRepository.findUserByEmail(email);
	}

	@Override
	public List<UserProfile> getAllUsers() {
		return userProfileRepository.findAll();
	}

	@Override
	public UserProfile createUser(UserProfile user) {
		return userProfileRepository.save(new UserProfile());
	}

	@Override
	public UserProfile updateUser(UserProfile user) {
		return userProfileRepository.save(user);

	}

	@Override
	public void deleteUser(Long idUser) {
		userProfileRepository.delete(idUser);
	}

	@Override
	public UserProfile getUserByUsername(String username) {
		return userProfileRepository.findByUsername(username);
	}

}
