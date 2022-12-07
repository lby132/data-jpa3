package study.datajpa3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa3.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
