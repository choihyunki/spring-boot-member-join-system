package com.example.one_hour_project.member.controller;

import com.example.one_hour_project.member.controller.dto.JoinRequest;
import com.example.one_hour_project.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String showRegistrationForm(Model model) {
        model.addAttribute("joinRequest", new JoinRequest());
        return "join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute JoinRequest joinRequest, Model model) {
        try {
            memberService.join(joinRequest);
            model.addAttribute("success", true);
            return "success";
        } catch (Exception e) {
            model.addAttribute("success", false);
            return "fail";
        }
    }
}