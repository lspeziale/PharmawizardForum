package com.pharmawizard.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pharmawizard.domain.Comment;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long>{

}
