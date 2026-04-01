package com.example.one_hour_project.member.service;

import com.example.one_hour_project.member.controller.dto.JoinRequest;

public interface MemberService {
    String join(JoinRequest joinRequest);

    void addAttribute(String success, boolean b);
}
