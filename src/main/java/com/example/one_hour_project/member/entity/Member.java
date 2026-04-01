package com.example.one_hour_project.member.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // DB 식별값은 관례상 id로 씁니다.

    @Column(nullable = false, unique = true)
    private String loginId; // 사용자가 입력하는 아이디

    private String name;

    private String phoneNumber;
}