package com.umart.backend.repository.admin;

import com.umart.backend.model.admin.AdminRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdminRoleRepository extends JpaRepository<AdminRole, UUID> {
    boolean existsByName(String name);
}
