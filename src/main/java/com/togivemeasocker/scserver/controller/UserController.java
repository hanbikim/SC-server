package com.togivemeasocker.scserver.controller;

import com.togivemeasocker.scserver.service.UserService;
import com.togivemeasocker.scserver.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;

    //메인페이지
    @GetMapping("/")
    public String index(){
        return"/index"; //iiii
    }

    //회원가입
    @GetMapping("/signup")
    public String dispSignup(){
        return "signup";
    }

    //회원가입처리
    @PostMapping("/signup")
    public String execSignup(UserDto userDto){
        userService.joinUser(userDto);
        return "redirect:/login"; //로그인 창으로 이동
    }

    //로그인 페이지
    @GetMapping("/login")
    public String dispLogin() {
        return "/login";
    }

    //로그인 결과 페이지 메인페이지로 넘기면 어떤가
    @GetMapping ("/main")
    public String dispLoginResult() {
        return "/main";
    }

    ///think
//    // 접근 거부 페이지 이 페이지 만들어??
//        @GetMapping("/user/denied")
//        public String dispDenied() {
//            return "/denied";
//        }

    //마이 페이지??

    //admin page
    @GetMapping("/admin")
    public String dispAdmin(){
        return "/admin";
    }

}

