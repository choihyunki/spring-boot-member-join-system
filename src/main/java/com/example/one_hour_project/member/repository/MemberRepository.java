package com.example.one_hour_project.member.repository;

import com.example.one_hour_project.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
