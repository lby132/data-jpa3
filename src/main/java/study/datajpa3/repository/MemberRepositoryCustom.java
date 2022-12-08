package study.datajpa3.repository;

import study.datajpa3.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<Member> findMemberCustom();
}
