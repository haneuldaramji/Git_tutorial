package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//라우터 역할을 하는 애너테이션, 라우터란 HTTP요청과 메서드를 연결하는 장치.
//지금의 경우 TestController를 라우터로 지정해 /test라는 GET요청이 왔을 때 test()메서드를 실행하도록 구성함.

public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
