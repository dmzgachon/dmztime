package com.example.demo.repository;

import com.example.demo.entity.DeviceToken;
import com.example.demo.entity.Heart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeviceTokenRepository extends JpaRepository<DeviceToken,Long> {

    boolean existsByToken(String token);
}