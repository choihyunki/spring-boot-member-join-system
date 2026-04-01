package com.example.one_hour_project.member.service;


import com.example.one_hour_project.member.controller.dto.JoinRequest;
import com.example.one_hour_project.member.entity.Member;
import com.example.one_hour_project.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;


    @Override
    public String join(JoinRequest joinRequest) {
       Member member = Member.builder()
               .id(joinRequest.getId())
               .name(joinRequest.getName())
               .phoneNumber(joinRequest.getPhoneNumber())
               .build();
       memberRepository.save(member);

       return "success";
    }

    @Override
    public void addAttribute(String success, boolean b) {

    }
}
