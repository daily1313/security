package com.example.jwtexercise.repository;


import com.example.jwtexercise.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
