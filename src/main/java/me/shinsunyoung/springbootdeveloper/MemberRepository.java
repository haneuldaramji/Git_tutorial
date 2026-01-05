package me.shinsunyoung.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//TestService.java의 findAll()이 실행되려면 MemberRepository 인터페이스가 반드시
//JpaRepository를 상속받아야 한다. 또한 객체 클래스(Member)와 그것의 기본키의 타입(long)을
//명시해야한다.
//member 라는 이름의 테이블에 접근해서 Member 클래스에 매핑하는 구현체.
public interface MemberRepository extends JpaRepository<Member, Long> {
//스프링이 자동으로 구현체를 만들어주기 때문에 여기에 메서드를 작성할 필요가 없음.
}
