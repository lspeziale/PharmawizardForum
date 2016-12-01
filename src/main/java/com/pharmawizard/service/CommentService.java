package com.pharmawizard.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pharmawizard.domain.Comment;

@Service
public interface CommentService {

	Comment getCommentById(long idComment);

}
