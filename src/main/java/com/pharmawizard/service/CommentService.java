package com.pharmawizard.service;

import com.pharmawizard.domain.Comment;

public interface CommentService {

	Comment getCommentById(Long idComment);

	Comment createComment(Comment comment);

	boolean deleteComment(Comment comment);

	Comment saveComment(Comment comment);

}
