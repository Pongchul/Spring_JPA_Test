package hello.jpa;

import hello.jpa.domain.Member;
import hello.jpa.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class H2DbApplicationTests {

    private final MemberRepository memberRepository;

    @Autowired
    public H2DbApplicationTests(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Test
    void 회원가입() {
        // 멤버 저장
        Member member = new Member();
        member.setName("pongchul");
        memberRepository.save(member);

        // 저장한 멤버 아이디로 검색
        Member findMember = memberRepository.findById(member.getId()).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());

    }
}
