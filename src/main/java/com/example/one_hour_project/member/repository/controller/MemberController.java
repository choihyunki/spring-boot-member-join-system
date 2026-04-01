package com.example.one_hour_project.member.repository.controller;

import org.springframework.ui.Model;
import com.example.one_hour_project.member.repository.controller.dto.JoinRequest;
import com.example.one_hour_project.member.repository.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String showRegistrationForm(Model model){
        model.addAttribute("joinRequest", new JoinRequest());
        return "join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute JoinRequest joinRequest){

        String result = memberService.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            memberService.addAttribute("success", true);
            return "success";
        }else{
            memberService.addAttribute("success", false);
            return "fail";
        }
    }

}
