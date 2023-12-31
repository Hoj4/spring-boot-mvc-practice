package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired // 스프링 컨테이너에서 멤버서비스를 가져옴
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

}
