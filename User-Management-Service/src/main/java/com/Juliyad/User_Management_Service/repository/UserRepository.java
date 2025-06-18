package com.Juliyad.User_Management_Service.repository;

import com.Juliyad.User_Management_Service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNicNumber(Long nicNumber);
}
