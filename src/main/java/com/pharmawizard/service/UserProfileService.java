package com.pharmawizard.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pharmawizard.domain.UserCreateForm;
import com.pharmawizard.domain.UserProfile;

@Service
public interface UserProfileService {

	UserProfile getUserById(long idUser);

	UserProfile getUserByEmail(String email);

	Collection<UserProfile> getAllUsers();

	UserProfile create(UserCreateForm form);

}
