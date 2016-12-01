package com.pharmawizard.repository;

import org.springframework.data.repository.CrudRepository;
import com.pharmawizard.domain.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {

	UserProfile findByUsername(String username);
	
}
