import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//JUnit은 테스트끼리 영향을 주지 않도록 각 테스트를 실행할 때 마다 실행객체를 만들고
// 테스트가 종료되면 실행객체를 삭제.
public class JUnitTest {
    @DisplayName("1 + 2는 3이다")//테스트 이름을 명시함
    @Test //테스트를 수행하는 메서드
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;
        //첫번째 인수에는 기대하는값, 두번째에는 실제로 검증할 값을 넣음
        Assertions.assertEquals(sum,a+b);//값이 같은지 확인

    }
}
