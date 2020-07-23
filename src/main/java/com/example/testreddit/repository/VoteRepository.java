package com.example.testreddit.repository;

import com.example.testreddit.model.Post;
import com.example.testreddit.model.User;
import com.example.testreddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
