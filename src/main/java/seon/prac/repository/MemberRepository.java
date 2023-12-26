package seon.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seon.prac.domain.Member;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
