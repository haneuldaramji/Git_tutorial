package me.shinsunyoung.springbootdeveloper;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//jpa 애너테이션들 (springboot 3.0이상버전은jakarta.persistance임)
import jakarta.persistence.*;

//퍼시스턴트 계층 코드
//db에 접근할때 사용할 객체인 Member DAO를 생성하고 실제 db에 접근하는 코드 작성
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id; //db테이블의 'id' 컬럼과 매칭

    @Column(name ="name", nullable = false)
    private String name; //db테이블의 'name'컬럼과 매칭
}
