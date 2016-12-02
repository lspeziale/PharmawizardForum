package com.pharmawizard.service;


import java.util.List;

import com.pharmawizard.domain.UserProfile;

public interface UserProfileService {

	UserProfile getUserById(Long idUser);

	UserProfile getUserByUsername(String username);

	UserProfile getUserByEmail(String email);

	List<UserProfile> getAllUsers();

	UserProfile createUser(UserProfile user);

	UserProfile updateUser(UserProfile user);

	void deleteUser(Long idUser);

}
