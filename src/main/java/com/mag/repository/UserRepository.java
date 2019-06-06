package com.mag.repository;

import org.springframework.data.repository.CrudRepository;

import com.mag.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
