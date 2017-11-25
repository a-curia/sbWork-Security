package com.dbbyte.sbsecuritymysql.repositories;


import com.dbbyte.sbsecuritymysql.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String username);
}