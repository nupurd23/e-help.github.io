package com.ehelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehelp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,String> {

}
