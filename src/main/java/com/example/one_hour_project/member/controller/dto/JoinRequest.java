package com.example.one_hour_project.member.controller.dto;

import lombok.Data;

@Data
public class JoinRequest {
    private Long id;

    private String name;

    private String phoneNumber;
}
