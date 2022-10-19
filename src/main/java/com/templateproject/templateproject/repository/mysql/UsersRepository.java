package com.templateproject.templateproject.repository.mysql;

import com.templateproject.templateproject.entity.mysql.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
}
