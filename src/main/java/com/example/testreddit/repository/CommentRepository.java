package com.example.testreddit.repository;

import com.example.testreddit.model.Comment;
import com.example.testreddit.model.Post;
import com.example.testreddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
