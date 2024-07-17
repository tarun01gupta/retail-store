package com.assignment.retailstore.repository;

import com.assignment.retailstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User Repository to perform DB operations for Customer like READ, UPDATE, INSERT
 * DELETE
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
