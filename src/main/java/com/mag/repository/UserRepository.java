package com.mag.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mag.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findUserByUsername(String name);

}
