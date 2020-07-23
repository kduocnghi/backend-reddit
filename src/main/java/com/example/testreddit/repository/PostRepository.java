package com.example.testreddit.repository;

import com.example.testreddit.model.Post;
import com.example.testreddit.model.Subreddit;
import com.example.testreddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);
}
