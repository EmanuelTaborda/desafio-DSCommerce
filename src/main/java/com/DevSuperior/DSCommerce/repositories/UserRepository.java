package com.DevSuperior.DSCommerce.repositories;

import com.DevSuperior.DSCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
