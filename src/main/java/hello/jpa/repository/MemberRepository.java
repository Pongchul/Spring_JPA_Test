package hello.jpa.repository;

import hello.jpa.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long Id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
