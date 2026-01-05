package me.shinsunyoung.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링부트 사용에 필요한 기본 설정을 해줌
public class SpringBootDeveloperApplication {
    public static void main(String[] args){
        //애플리케이션을 실행하는 메서드 (메인클래스로 사용할 메서드, 커맨드 라인의 인수) 전달
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
