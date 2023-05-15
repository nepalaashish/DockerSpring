package com.ajmera.infotech.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajmera.infotech.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}