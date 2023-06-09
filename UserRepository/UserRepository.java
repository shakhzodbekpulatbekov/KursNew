package com.example.kpi.UserRepository;

import com.example.kpi.UserEntity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity> findByChatId(String chatId);

    @Override
    List<UserEntity> findAll();
}
