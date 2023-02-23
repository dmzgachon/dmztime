package com.example.demo.repository;

import com.example.demo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsByEmail(String email);
    Optional<Member> findByEmail(String email);

    Optional<Member> findByPhonenumber(String phonenumber);

    Optional<Member> findByNameAndPhonenumber(String name, String phonenumber);

    boolean existsByPhonenumber(String phonenumber);

}

